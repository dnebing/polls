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
import com.liferay.polls.model.PollsChoice;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PollsChoice. This utility wraps
 * <code>com.liferay.polls.service.impl.PollsChoiceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoiceLocalService
 * @generated
 */
public class PollsChoiceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.polls.service.impl.PollsChoiceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static PollsChoice addChoice(
			long userId, long questionId, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addChoice(
			userId, questionId, name, description, serviceContext);
	}

	/**
	 * Adds the polls choice to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsChoiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsChoice the polls choice
	 * @return the polls choice that was added
	 */
	public static PollsChoice addPollsChoice(PollsChoice pollsChoice) {
		return getService().addPollsChoice(pollsChoice);
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
	 * Creates a new polls choice with the primary key. Does not add the polls choice to the database.
	 *
	 * @param choiceId the primary key for the new polls choice
	 * @return the new polls choice
	 */
	public static PollsChoice createPollsChoice(long choiceId) {
		return getService().createPollsChoice(choiceId);
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
	 * Deletes the polls choice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsChoiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param choiceId the primary key of the polls choice
	 * @return the polls choice that was removed
	 * @throws PortalException if a polls choice with the primary key could not be found
	 */
	public static PollsChoice deletePollsChoice(long choiceId)
		throws PortalException {

		return getService().deletePollsChoice(choiceId);
	}

	/**
	 * Deletes the polls choice from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsChoiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsChoice the polls choice
	 * @return the polls choice that was removed
	 */
	public static PollsChoice deletePollsChoice(PollsChoice pollsChoice) {
		return getService().deletePollsChoice(pollsChoice);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsChoiceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsChoiceModelImpl</code>.
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

	public static PollsChoice fetchPollsChoice(long choiceId) {
		return getService().fetchPollsChoice(choiceId);
	}

	/**
	 * Returns the polls choice matching the UUID and group.
	 *
	 * @param uuid the polls choice's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls choice, or <code>null</code> if a matching polls choice could not be found
	 */
	public static PollsChoice fetchPollsChoiceByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPollsChoiceByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static PollsChoice getChoice(long choiceId) throws PortalException {
		return getService().getChoice(choiceId);
	}

	public static List<PollsChoice> getChoices(long questionId) {
		return getService().getChoices(questionId);
	}

	public static int getChoicesCount(long questionId) {
		return getService().getChoicesCount(questionId);
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
	 * Returns the polls choice with the primary key.
	 *
	 * @param choiceId the primary key of the polls choice
	 * @return the polls choice
	 * @throws PortalException if a polls choice with the primary key could not be found
	 */
	public static PollsChoice getPollsChoice(long choiceId)
		throws PortalException {

		return getService().getPollsChoice(choiceId);
	}

	/**
	 * Returns the polls choice matching the UUID and group.
	 *
	 * @param uuid the polls choice's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls choice
	 * @throws PortalException if a matching polls choice could not be found
	 */
	public static PollsChoice getPollsChoiceByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPollsChoiceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the polls choices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.polls.model.impl.PollsChoiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls choices
	 * @param end the upper bound of the range of polls choices (not inclusive)
	 * @return the range of polls choices
	 */
	public static List<PollsChoice> getPollsChoices(int start, int end) {
		return getService().getPollsChoices(start, end);
	}

	/**
	 * Returns all the polls choices matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls choices
	 * @param companyId the primary key of the company
	 * @return the matching polls choices, or an empty list if no matches were found
	 */
	public static List<PollsChoice> getPollsChoicesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPollsChoicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of polls choices matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls choices
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of polls choices
	 * @param end the upper bound of the range of polls choices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching polls choices, or an empty list if no matches were found
	 */
	public static List<PollsChoice> getPollsChoicesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PollsChoice> orderByComparator) {

		return getService().getPollsChoicesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of polls choices.
	 *
	 * @return the number of polls choices
	 */
	public static int getPollsChoicesCount() {
		return getService().getPollsChoicesCount();
	}

	public static PollsChoice updateChoice(
			long choiceId, long questionId, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateChoice(
			choiceId, questionId, name, description, serviceContext);
	}

	/**
	 * Updates the polls choice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PollsChoiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pollsChoice the polls choice
	 * @return the polls choice that was updated
	 */
	public static PollsChoice updatePollsChoice(PollsChoice pollsChoice) {
		return getService().updatePollsChoice(pollsChoice);
	}

	public static PollsChoiceLocalService getService() {
		return _service;
	}

	private static volatile PollsChoiceLocalService _service;

}