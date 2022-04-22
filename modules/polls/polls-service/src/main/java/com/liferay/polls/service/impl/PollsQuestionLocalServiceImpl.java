/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.polls.service.impl;

import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.polls.exception.QuestionChoiceException;
import com.liferay.polls.exception.QuestionDescriptionException;
import com.liferay.polls.exception.QuestionExpirationDateException;
import com.liferay.polls.exception.QuestionTitleException;
import com.liferay.polls.model.PollsChoice;
import com.liferay.polls.model.PollsQuestion;
import com.liferay.polls.service.PollsChoiceLocalService;
import com.liferay.polls.service.base.PollsQuestionLocalServiceBaseImpl;
import com.liferay.polls.service.persistence.PollsQuestionFinder;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.polls.model.PollsQuestion",
	service = AopService.class
)
public class PollsQuestionLocalServiceImpl
	extends PollsQuestionLocalServiceBaseImpl {
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PollsQuestion addQuestion(
			long userId, Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap, int expirationDateMonth,
			int expirationDateDay, int expirationDateYear,
			int expirationDateHour, int expirationDateMinute,
			boolean neverExpire, List<PollsChoice> choices,
			ServiceContext serviceContext)
			throws PortalException {

		// Question

		User user = userLocalService.getUser(userId);
		long groupId = serviceContext.getScopeGroupId();

		Date expirationDate = null;

		if (!neverExpire) {
			expirationDate = _portal.getDate(
					expirationDateMonth, expirationDateDay, expirationDateYear,
					expirationDateHour, expirationDateMinute, user.getTimeZone(),
					QuestionExpirationDateException.class);
		}

		validate(titleMap, descriptionMap, choices, expirationDate);

		long questionId = counterLocalService.increment();

		PollsQuestion question = pollsQuestionPersistence.create(questionId);

		question.setUuid(serviceContext.getUuid());
		question.setGroupId(groupId);
		question.setCompanyId(user.getCompanyId());
		question.setUserId(user.getUserId());
		question.setUserName(user.getFullName());
		question.setTitleMap(titleMap);
		question.setDescriptionMap(descriptionMap);
		question.setExpirationDate(expirationDate);

		question = pollsQuestionPersistence.update(question);

		// Resources

		if (serviceContext.isAddGroupPermissions() ||
				serviceContext.isAddGuestPermissions()) {

			addQuestionResources(
					question, serviceContext.isAddGroupPermissions(),
					serviceContext.isAddGuestPermissions());
		}
		else {
			addQuestionResources(
					question, serviceContext.getModelPermissions());
		}

		// Choices

		if (choices != null) {
			for (PollsChoice choice : choices) {
				_pollsChoiceLocalService.addChoice(
						userId, questionId, choice.getName(),
						choice.getDescription(), serviceContext);
			}
		}

		return question;
	}

	@Override
	public void addQuestionResources(
			long questionId, boolean addGroupPermissions,
			boolean addGuestPermissions)
			throws PortalException {

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
				questionId);

		addQuestionResources(
				question, addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addQuestionResources(
			long questionId, ModelPermissions modelPermissions)
			throws PortalException {

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
				questionId);

		addQuestionResources(question, modelPermissions);
	}

	@Override
	public void addQuestionResources(
			PollsQuestion question, boolean addGroupPermissions,
			boolean addGuestPermissions)
			throws PortalException {

		resourceLocalService.addResources(
				question.getCompanyId(), question.getGroupId(),
				question.getUserId(), PollsQuestion.class.getName(),
				question.getQuestionId(), false, addGroupPermissions,
				addGuestPermissions);
	}

	@Override
	public void addQuestionResources(
			PollsQuestion question, ModelPermissions modelPermissions)
			throws PortalException {

		resourceLocalService.addModelResources(
				question.getCompanyId(), question.getGroupId(),
				question.getUserId(), PollsQuestion.class.getName(),
				question.getQuestionId(), modelPermissions);
	}

	@Override
	public void deleteQuestion(long questionId) throws PortalException {
		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
				questionId);

		pollsQuestionLocalService.deleteQuestion(question);
	}

	@Override
	@SystemEvent(
			action = SystemEventConstants.ACTION_SKIP,
			type = SystemEventConstants.TYPE_DELETE
	)
	public void deleteQuestion(PollsQuestion question) throws PortalException {

		// Question

		pollsQuestionPersistence.remove(question);

		// Resources

		resourceLocalService.deleteResource(
				question.getCompanyId(), PollsQuestion.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, question.getQuestionId());

		// Choices

		pollsChoicePersistence.removeByQuestionId(question.getQuestionId());

		// Votes

		pollsVotePersistence.removeByQuestionId(question.getQuestionId());

		// Indexer

		Indexer<PollsQuestion> indexer = _indexerRegistry.getIndexer(
				PollsQuestion.class.getName());

		indexer.delete(question);
	}

	@Override
	public void deleteQuestions(long groupId) throws PortalException {
		for (PollsQuestion question :
				pollsQuestionPersistence.findByGroupId(groupId)) {

			pollsQuestionLocalService.deleteQuestion(question);
		}
	}

	@Override
	public PollsQuestion getQuestion(long questionId) throws PortalException {
		return pollsQuestionPersistence.findByPrimaryKey(questionId);
	}

	@Override
	public List<PollsQuestion> getQuestions(long groupId) {
		return pollsQuestionPersistence.findByGroupId(groupId);
	}

	@Override
	public List<PollsQuestion> getQuestions(long groupId, int start, int end) {
		return pollsQuestionPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public int getQuestionsCount(long groupId) {
		return pollsQuestionPersistence.countByGroupId(groupId);
	}

	@Override
	public List<PollsQuestion> search(
			long groupId, int start, int end,
			OrderByComparator<PollsQuestion> orderByComparator) {

		return pollsQuestionPersistence.filterFindByGroupId(
				groupId, start, end, orderByComparator);
	}

	@Override
	public List<PollsQuestion> search(
			long companyId, long[] groupIds, String keywords, int start, int end,
			OrderByComparator<PollsQuestion> orderByComparator) {

		return pollsQuestionFinder.findByKeywords(
				companyId, groupIds, keywords, start, end, orderByComparator);
	}

	@Override
	public List<PollsQuestion> search(
			long companyId, long[] groupIds, String name, String description,
			boolean andOperator, int start, int end,
			OrderByComparator<PollsQuestion> orderByComparator) {

		return pollsQuestionFinder.findByC_G_T_D(
				companyId, groupIds, name, description, andOperator, start, end,
				orderByComparator);
	}

	@Override
	public int searchCount(long groupId) {
		return pollsQuestionPersistence.filterCountByGroupId(groupId);
	}

	@Override
	public int searchCount(long companyId, long[] groupIds, String keywords) {
		return pollsQuestionFinder.countByKeywords(
				companyId, groupIds, keywords);
	}

	@Override
	public int searchCount(
			long companyId, long[] groupIds, String title, String description,
			boolean andOperator) {

		return pollsQuestionFinder.countByC_G_T_D(
				companyId, groupIds, title, description, andOperator);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PollsQuestion updateQuestion(
			long userId, long questionId, Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap, int expirationDateMonth,
			int expirationDateDay, int expirationDateYear,
			int expirationDateHour, int expirationDateMinute,
			boolean neverExpire, List<PollsChoice> choices,
			ServiceContext serviceContext)
			throws PortalException {

		// Question

		Date expirationDate = null;

		if (!neverExpire) {
			User user = userLocalService.getUser(userId);

			expirationDate = _portal.getDate(
					expirationDateMonth, expirationDateDay, expirationDateYear,
					expirationDateHour, expirationDateMinute, user.getTimeZone(),
					QuestionExpirationDateException.class);
		}

		validate(titleMap, descriptionMap, choices, expirationDate);

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
				questionId);

		question.setTitleMap(titleMap);
		question.setDescriptionMap(descriptionMap);
		question.setExpirationDate(expirationDate);

		question = pollsQuestionPersistence.update(question);

		// Choices

		if (choices == null) {
			return question;
		}

		deleteRemovedPollsChoices(questionId, choices);

		for (PollsChoice choice : choices) {
			String choiceName = choice.getName();
			String choiceDescription = choice.getDescription();

			choice = pollsChoicePersistence.fetchByQ_N(questionId, choiceName);

			if (choice == null) {
				_pollsChoiceLocalService.addChoice(
						userId, questionId, choiceName, choiceDescription,
						serviceContext);
			}
			else {
				_pollsChoiceLocalService.updateChoice(
						choice.getChoiceId(), questionId, choiceName,
						choiceDescription, serviceContext);
			}
		}

		return question;
	}

	protected void deletePollsChoice(PollsChoice pollsChoice) {
		pollsVotePersistence.removeByChoiceId(pollsChoice.getChoiceId());

		pollsChoicePersistence.remove(pollsChoice);
	}

	protected void deleteRemovedPollsChoices(
			long questionId, List<PollsChoice> choices) {

		Stream<PollsChoice> stream = choices.stream();

		Stream<String> choiceNamesStream = stream.map(
				choice -> choice.getName());

		List<String> choiceNames = choiceNamesStream.collect(
				Collectors.toList());

		List<PollsChoice> oldChoices = pollsChoicePersistence.findByQuestionId(
				questionId);

		Stream<PollsChoice> oldStream = oldChoices.stream();

		oldStream = oldStream.filter(
				oldChoice -> !choiceNames.contains(oldChoice.getName()));

		oldStream.forEach(this::deletePollsChoice);
	}

	protected void validate(
			Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
			List<PollsChoice> choices, Date expirationDate)
			throws PortalException {

		Locale locale = LocaleUtil.getSiteDefault();

		String title = titleMap.get(locale);

		if (Validator.isNull(title)) {
			throw new QuestionTitleException();
		}

		String description = descriptionMap.get(locale);

		if (Validator.isNull(description)) {
			throw new QuestionDescriptionException();
		}

		if ((choices != null) && (choices.size() < 2)) {
			throw new QuestionChoiceException();
		}

		if (choices != null) {
			Set<String> choiceDescriptions = new HashSet<>();

			for (PollsChoice choice : choices) {
				String choiceDescription = choice.getDescription(locale);

				if (Validator.isNull(choiceDescription) ||
						choiceDescriptions.contains(choiceDescription)) {

					throw new QuestionChoiceException();
				}

				choiceDescriptions.add(choiceDescription);
			}
		}

		if (!ExportImportThreadLocal.isImportInProcess() &&
				(expirationDate != null) && expirationDate.before(new Date())) {

			throw new QuestionExpirationDateException(
					"Expiration date " + expirationDate + " is in the past");
		}
	}

	@Reference
	private IndexerRegistry _indexerRegistry;

	@Reference
	private PollsChoiceLocalService _pollsChoiceLocalService;

	@Reference
	private Portal _portal;
}