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

package com.liferay.polls.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.polls.model.PollsQuestion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service utility for PollsQuestion. This utility wraps
 * <code>com.liferay.polls.service.impl.PollsQuestionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionLocalService
 * @generated
 */
public class PollsQuestionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.polls.service.impl.PollsQuestionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the polls question to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsQuestionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsQuestion the polls question
	 * @return the polls question that was added
	 */
	public static PollsQuestion addPollsQuestion(PollsQuestion pollsQuestion) {
		return getService().addPollsQuestion(pollsQuestion);
	}

	public static PollsQuestion addQuestion(
			long userId, Map<java.util.Locale, String> titleMap,
			Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<com.liferay.polls.model.PollsChoice> choices,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addQuestion(
			userId, titleMap, descriptionMap, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices, serviceContext);
	}

	public static void addQuestionResources(
			long questionId, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		getService().addQuestionResources(
			questionId, addGroupPermissions, addGuestPermissions);
	}

	public static void addQuestionResources(
			long questionId,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws PortalException {

		getService().addQuestionResources(questionId, modelPermissions);
	}

	public static void addQuestionResources(
			PollsQuestion question, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		getService().addQuestionResources(
			question, addGroupPermissions, addGuestPermissions);
	}

	public static void addQuestionResources(
			PollsQuestion question,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws PortalException {

		getService().addQuestionResources(question, modelPermissions);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new polls question with the primary key. Does not add the polls question to the database.
	 *
	 * @param questionId the primary key for the new polls question
	 * @return the new polls question
	 */
	public static PollsQuestion createPollsQuestion(long questionId) {
		return getService().createPollsQuestion(questionId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the polls question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsQuestionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question that was removed
	 * @throws PortalException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion deletePollsQuestion(long questionId)
		throws PortalException {

		return getService().deletePollsQuestion(questionId);
	}

	/**
	 * Deletes the polls question from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsQuestionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsQuestion the polls question
	 * @return the polls question that was removed
	 */
	public static PollsQuestion deletePollsQuestion(
		PollsQuestion pollsQuestion) {

		return getService().deletePollsQuestion(pollsQuestion);
	}

	public static void deleteQuestion(long questionId) throws PortalException {
		getService().deleteQuestion(questionId);
	}

	public static void deleteQuestion(PollsQuestion question)
		throws PortalException {

		getService().deleteQuestion(question);
	}

	public static void deleteQuestions(long groupId) throws PortalException {
		getService().deleteQuestions(groupId);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PollsQuestion fetchPollsQuestion(long questionId) {
		return getService().fetchPollsQuestion(questionId);
	}

	/**
	 * Returns the polls question matching the UUID and group.
	 *
	 * @param uuid the polls question's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchPollsQuestionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPollsQuestionByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the polls question with the primary key.
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question
	 * @throws PortalException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion getPollsQuestion(long questionId)
		throws PortalException {

		return getService().getPollsQuestion(questionId);
	}

	/**
	 * Returns the polls question matching the UUID and group.
	 *
	 * @param uuid the polls question's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls question
	 * @throws PortalException if a matching polls question could not be found
	 */
	public static PollsQuestion getPollsQuestionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPollsQuestionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the polls questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of polls questions
	 */
	public static List<PollsQuestion> getPollsQuestions(int start, int end) {
		return getService().getPollsQuestions(start, end);
	}

	/**
	 * Returns all the polls questions matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls questions
	 * @param companyId the primary key of the company
	 * @return the matching polls questions, or an empty list if no matches were found
	 */
	public static List<PollsQuestion> getPollsQuestionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPollsQuestionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of polls questions matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls questions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching polls questions, or an empty list if no matches were found
	 */
	public static List<PollsQuestion> getPollsQuestionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getService().getPollsQuestionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of polls questions.
	 *
	 * @return the number of polls questions
	 */
	public static int getPollsQuestionsCount() {
		return getService().getPollsQuestionsCount();
	}

	public static PollsQuestion getQuestion(long questionId)
		throws PortalException {

		return getService().getQuestion(questionId);
	}

	public static List<PollsQuestion> getQuestions(long groupId) {
		return getService().getQuestions(groupId);
	}

	public static List<PollsQuestion> getQuestions(
		long groupId, int start, int end) {

		return getService().getQuestions(groupId, start, end);
	}

	public static int getQuestionsCount(long groupId) {
		return getService().getQuestionsCount(groupId);
	}

	public static List<PollsQuestion> search(
		long groupId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getService().search(groupId, start, end, orderByComparator);
	}

	public static List<PollsQuestion> search(
		long companyId, long[] groupIds, String keywords, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getService().search(
			companyId, groupIds, keywords, start, end, orderByComparator);
	}

	public static List<PollsQuestion> search(
		long companyId, long[] groupIds, String name, String description,
		boolean andOperator, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getService().search(
			companyId, groupIds, name, description, andOperator, start, end,
			orderByComparator);
	}

	public static int searchCount(long groupId) {
		return getService().searchCount(groupId);
	}

	public static int searchCount(
		long companyId, long[] groupIds, String keywords) {

		return getService().searchCount(companyId, groupIds, keywords);
	}

	public static int searchCount(
		long companyId, long[] groupIds, String title, String description,
		boolean andOperator) {

		return getService().searchCount(
			companyId, groupIds, title, description, andOperator);
	}

	/**
	 * Updates the polls question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsQuestionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsQuestion the polls question
	 * @return the polls question that was updated
	 */
	public static PollsQuestion updatePollsQuestion(
		PollsQuestion pollsQuestion) {

		return getService().updatePollsQuestion(pollsQuestion);
	}

	public static PollsQuestion updateQuestion(
			long userId, long questionId,
			Map<java.util.Locale, String> titleMap,
			Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<com.liferay.polls.model.PollsChoice> choices,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateQuestion(
			userId, questionId, titleMap, descriptionMap, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices, serviceContext);
	}

	public static PollsQuestionLocalService getService() {
		return _service;
	}

	private static volatile PollsQuestionLocalService _service;

}