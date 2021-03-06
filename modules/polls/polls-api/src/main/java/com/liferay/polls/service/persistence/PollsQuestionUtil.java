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

package com.liferay.polls.service.persistence;

import com.liferay.polls.model.PollsQuestion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the polls question service. This utility wraps <code>com.liferay.polls.service.persistence.impl.PollsQuestionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionPersistence
 * @generated
 */
public class PollsQuestionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(PollsQuestion pollsQuestion) {
		getPersistence().clearCache(pollsQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PollsQuestion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PollsQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PollsQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PollsQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PollsQuestion update(PollsQuestion pollsQuestion) {
		return getPersistence().update(pollsQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PollsQuestion update(
		PollsQuestion pollsQuestion, ServiceContext serviceContext) {

		return getPersistence().update(pollsQuestion, serviceContext);
	}

	/**
	 * Returns all the polls questions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching polls questions
	 */
	public static List<PollsQuestion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the polls questions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the polls questions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the polls questions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first polls question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByUuid_First(
			String uuid, OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first polls question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUuid_First(
		String uuid, OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByUuid_Last(
			String uuid, OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUuid_Last(
		String uuid, OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the polls questions before and after the current polls question in the ordered set where uuid = &#63;.
	 *
	 * @param questionId the primary key of the current polls question
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next polls question
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion[] findByUuid_PrevAndNext(
			long questionId, String uuid,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_PrevAndNext(
			questionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the polls questions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of polls questions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching polls questions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the polls question where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuestionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByUUID_G(String uuid, long groupId)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the polls question where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the polls question where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the polls question where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the polls question that was removed
	 */
	public static PollsQuestion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of polls questions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching polls questions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the polls questions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching polls questions
	 */
	public static List<PollsQuestion> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the polls questions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the polls questions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the polls questions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first polls question in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first polls question in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the polls questions before and after the current polls question in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param questionId the primary key of the current polls question
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next polls question
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion[] findByUuid_C_PrevAndNext(
			long questionId, String uuid, long companyId,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			questionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the polls questions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of polls questions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching polls questions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the polls questions where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching polls questions
	 */
	public static List<PollsQuestion> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the polls questions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of matching polls questions
	 */
	public static List<PollsQuestion> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the polls questions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the polls questions where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching polls questions
	 */
	public static List<PollsQuestion> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first polls question in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByGroupId_First(
			long groupId, OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first polls question in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByGroupId_First(
		long groupId, OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question
	 * @throws NoSuchQuestionException if a matching polls question could not be found
	 */
	public static PollsQuestion findByGroupId_Last(
			long groupId, OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last polls question in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching polls question, or <code>null</code> if a matching polls question could not be found
	 */
	public static PollsQuestion fetchByGroupId_Last(
		long groupId, OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the polls questions before and after the current polls question in the ordered set where groupId = &#63;.
	 *
	 * @param questionId the primary key of the current polls question
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next polls question
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion[] findByGroupId_PrevAndNext(
			long questionId, long groupId,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByGroupId_PrevAndNext(
			questionId, groupId, orderByComparator);
	}

	/**
	 * Returns all the polls questions that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching polls questions that the user has permission to view
	 */
	public static List<PollsQuestion> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the polls questions that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of matching polls questions that the user has permission to view
	 */
	public static List<PollsQuestion> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the polls questions that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching polls questions that the user has permission to view
	 */
	public static List<PollsQuestion> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the polls questions before and after the current polls question in the ordered set of polls questions that the user has permission to view where groupId = &#63;.
	 *
	 * @param questionId the primary key of the current polls question
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next polls question
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion[] filterFindByGroupId_PrevAndNext(
			long questionId, long groupId,
			OrderByComparator<PollsQuestion> orderByComparator)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			questionId, groupId, orderByComparator);
	}

	/**
	 * Removes all the polls questions where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of polls questions where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching polls questions
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of polls questions that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching polls questions that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Caches the polls question in the entity cache if it is enabled.
	 *
	 * @param pollsQuestion the polls question
	 */
	public static void cacheResult(PollsQuestion pollsQuestion) {
		getPersistence().cacheResult(pollsQuestion);
	}

	/**
	 * Caches the polls questions in the entity cache if it is enabled.
	 *
	 * @param pollsQuestions the polls questions
	 */
	public static void cacheResult(List<PollsQuestion> pollsQuestions) {
		getPersistence().cacheResult(pollsQuestions);
	}

	/**
	 * Creates a new polls question with the primary key. Does not add the polls question to the database.
	 *
	 * @param questionId the primary key for the new polls question
	 * @return the new polls question
	 */
	public static PollsQuestion create(long questionId) {
		return getPersistence().create(questionId);
	}

	/**
	 * Removes the polls question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question that was removed
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion remove(long questionId)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().remove(questionId);
	}

	public static PollsQuestion updateImpl(PollsQuestion pollsQuestion) {
		return getPersistence().updateImpl(pollsQuestion);
	}

	/**
	 * Returns the polls question with the primary key or throws a <code>NoSuchQuestionException</code> if it could not be found.
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question
	 * @throws NoSuchQuestionException if a polls question with the primary key could not be found
	 */
	public static PollsQuestion findByPrimaryKey(long questionId)
		throws com.liferay.polls.exception.NoSuchQuestionException {

		return getPersistence().findByPrimaryKey(questionId);
	}

	/**
	 * Returns the polls question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param questionId the primary key of the polls question
	 * @return the polls question, or <code>null</code> if a polls question with the primary key could not be found
	 */
	public static PollsQuestion fetchByPrimaryKey(long questionId) {
		return getPersistence().fetchByPrimaryKey(questionId);
	}

	/**
	 * Returns all the polls questions.
	 *
	 * @return the polls questions
	 */
	public static List<PollsQuestion> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the polls questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @return the range of polls questions
	 */
	public static List<PollsQuestion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the polls questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of polls questions
	 */
	public static List<PollsQuestion> findAll(
		int start, int end,
		OrderByComparator<PollsQuestion> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the polls questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PollsQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls questions
	 * @param end the upper bound of the range of polls questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of polls questions
	 */
	public static List<PollsQuestion> findAll(
		int start, int end, OrderByComparator<PollsQuestion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the polls questions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of polls questions.
	 *
	 * @return the number of polls questions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PollsQuestionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PollsQuestionPersistence _persistence;

}