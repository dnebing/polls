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

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.polls.model.PollsChoice;
import com.liferay.polls.model.PollsQuestion;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.*;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for PollsQuestion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PollsQuestionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.polls.service.impl.PollsQuestionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the polls question local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PollsQuestionLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public PollsQuestion addPollsQuestion(PollsQuestion pollsQuestion);

	@Indexable(type = IndexableType.REINDEX)
	public PollsQuestion addQuestion(
			long userId, java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices, ServiceContext serviceContext)
		throws PortalException;

	public void addQuestionResources(
			long questionId, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException;

	public void addQuestionResources(
			long questionId, ModelPermissions modelPermissions)
		throws PortalException;

	public void addQuestionResources(
			PollsQuestion question, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException;

	public void addQuestionResources(
			PollsQuestion question, ModelPermissions modelPermissions)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new polls question with the primary key. Does not add the polls question to the database.
	 *
	 * @param questionId the primary key for the new polls question
	 * @return the new polls question
	 */
	@Transactional(enabled = false)
	public PollsQuestion createPollsQuestion(long questionId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public PollsQuestion deletePollsQuestion(long questionId)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public PollsQuestion deletePollsQuestion(PollsQuestion pollsQuestion);

	public void deleteQuestion(long questionId) throws PortalException;

	@SystemEvent(
		action = SystemEventConstants.ACTION_SKIP,
		type = SystemEventConstants.TYPE_DELETE
	)
	public void deleteQuestion(PollsQuestion question) throws PortalException;

	public void deleteQuestions(long groupId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PollsQuestion fetchPollsQuestion(long questionId);

	/**
	 * Returns the polls question matching the UUID and group.
	 *
	 * @param uuid the polls question's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PollsQuestion fetchPollsQuestionByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the polls question with the primary key.
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question
	 * @throws PortalException if a polls question with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PollsQuestion getPollsQuestion(long questionId)
		throws PortalException;

	/**
	 * Returns the polls question matching the UUID and group.
	 *
	 * @param uuid the polls question's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls question
	 * @throws PortalException if a matching polls question could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PollsQuestion getPollsQuestionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> getPollsQuestions(int start, int end);

	/**
	 * Returns all the polls questions matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls questions
	 * @param companyId the primary key of the company
	 * @return the matching polls questions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> getPollsQuestionsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> getPollsQuestionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator);

	/**
	 * Returns the number of polls questions.
	 *
	 * @return the number of polls questions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPollsQuestionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PollsQuestion getQuestion(long questionId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> getQuestions(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> getQuestions(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQuestionsCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> search(
		long groupId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> search(
		long companyId, long[] groupIds, String keywords, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PollsQuestion> search(
		long companyId, long[] groupIds, String name, String description,
		boolean andOperator, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long companyId, long[] groupIds, String keywords);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(
		long companyId, long[] groupIds, String title, String description,
		boolean andOperator);

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
	@Indexable(type = IndexableType.REINDEX)
	public PollsQuestion updatePollsQuestion(PollsQuestion pollsQuestion);

	@Indexable(type = IndexableType.REINDEX)
	public PollsQuestion updateQuestion(
			long userId, long questionId,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices, ServiceContext serviceContext)
		throws PortalException;

}