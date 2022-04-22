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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PollsChoiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoiceLocalService
 * @generated
 */
public class PollsChoiceLocalServiceWrapper
	implements PollsChoiceLocalService,
			   ServiceWrapper<PollsChoiceLocalService> {

	public PollsChoiceLocalServiceWrapper() {
		this(null);
	}

	public PollsChoiceLocalServiceWrapper(
		PollsChoiceLocalService pollsChoiceLocalService) {

		_pollsChoiceLocalService = pollsChoiceLocalService;
	}

	@Override
	public com.liferay.polls.model.PollsChoice addChoice(
			long userId, long questionId, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.addChoice(
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
	@Override
	public com.liferay.polls.model.PollsChoice addPollsChoice(
		com.liferay.polls.model.PollsChoice pollsChoice) {

		return _pollsChoiceLocalService.addPollsChoice(pollsChoice);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new polls choice with the primary key. Does not add the polls choice to the database.
	 *
	 * @param choiceId the primary key for the new polls choice
	 * @return the new polls choice
	 */
	@Override
	public com.liferay.polls.model.PollsChoice createPollsChoice(
		long choiceId) {

		return _pollsChoiceLocalService.createPollsChoice(choiceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.polls.model.PollsChoice deletePollsChoice(long choiceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.deletePollsChoice(choiceId);
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
	@Override
	public com.liferay.polls.model.PollsChoice deletePollsChoice(
		com.liferay.polls.model.PollsChoice pollsChoice) {

		return _pollsChoiceLocalService.deletePollsChoice(pollsChoice);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pollsChoiceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pollsChoiceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pollsChoiceLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pollsChoiceLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _pollsChoiceLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _pollsChoiceLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pollsChoiceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _pollsChoiceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.polls.model.PollsChoice fetchPollsChoice(long choiceId) {
		return _pollsChoiceLocalService.fetchPollsChoice(choiceId);
	}

	/**
	 * Returns the polls choice matching the UUID and group.
	 *
	 * @param uuid the polls choice's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls choice, or <code>null</code> if a matching polls choice could not be found
	 */
	@Override
	public com.liferay.polls.model.PollsChoice fetchPollsChoiceByUuidAndGroupId(
		String uuid, long groupId) {

		return _pollsChoiceLocalService.fetchPollsChoiceByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pollsChoiceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.polls.model.PollsChoice getChoice(long choiceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.getChoice(choiceId);
	}

	@Override
	public java.util.List<com.liferay.polls.model.PollsChoice> getChoices(
		long questionId) {

		return _pollsChoiceLocalService.getChoices(questionId);
	}

	@Override
	public int getChoicesCount(long questionId) {
		return _pollsChoiceLocalService.getChoicesCount(questionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _pollsChoiceLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pollsChoiceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pollsChoiceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the polls choice with the primary key.
	 *
	 * @param choiceId the primary key of the polls choice
	 * @return the polls choice
	 * @throws PortalException if a polls choice with the primary key could not be found
	 */
	@Override
	public com.liferay.polls.model.PollsChoice getPollsChoice(long choiceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.getPollsChoice(choiceId);
	}

	/**
	 * Returns the polls choice matching the UUID and group.
	 *
	 * @param uuid the polls choice's UUID
	 * @param groupId the primary key of the group
	 * @return the matching polls choice
	 * @throws PortalException if a matching polls choice could not be found
	 */
	@Override
	public com.liferay.polls.model.PollsChoice getPollsChoiceByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.getPollsChoiceByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.polls.model.PollsChoice> getPollsChoices(
		int start, int end) {

		return _pollsChoiceLocalService.getPollsChoices(start, end);
	}

	/**
	 * Returns all the polls choices matching the UUID and company.
	 *
	 * @param uuid the UUID of the polls choices
	 * @param companyId the primary key of the company
	 * @return the matching polls choices, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.polls.model.PollsChoice>
		getPollsChoicesByUuidAndCompanyId(String uuid, long companyId) {

		return _pollsChoiceLocalService.getPollsChoicesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.polls.model.PollsChoice>
		getPollsChoicesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.polls.model.PollsChoice> orderByComparator) {

		return _pollsChoiceLocalService.getPollsChoicesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of polls choices.
	 *
	 * @return the number of polls choices
	 */
	@Override
	public int getPollsChoicesCount() {
		return _pollsChoiceLocalService.getPollsChoicesCount();
	}

	@Override
	public com.liferay.polls.model.PollsChoice updateChoice(
			long choiceId, long questionId, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsChoiceLocalService.updateChoice(
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
	@Override
	public com.liferay.polls.model.PollsChoice updatePollsChoice(
		com.liferay.polls.model.PollsChoice pollsChoice) {

		return _pollsChoiceLocalService.updatePollsChoice(pollsChoice);
	}

	@Override
	public PollsChoiceLocalService getWrappedService() {
		return _pollsChoiceLocalService;
	}

	@Override
	public void setWrappedService(
		PollsChoiceLocalService pollsChoiceLocalService) {

		_pollsChoiceLocalService = pollsChoiceLocalService;
	}

	private PollsChoiceLocalService _pollsChoiceLocalService;

}