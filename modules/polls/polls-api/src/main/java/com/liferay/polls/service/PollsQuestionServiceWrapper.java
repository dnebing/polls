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
 * Provides a wrapper for {@link PollsQuestionService}.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionService
 * @generated
 */
public class PollsQuestionServiceWrapper
	implements PollsQuestionService, ServiceWrapper<PollsQuestionService> {

	public PollsQuestionServiceWrapper() {
		this(null);
	}

	public PollsQuestionServiceWrapper(
		PollsQuestionService pollsQuestionService) {

		_pollsQuestionService = pollsQuestionService;
	}

	@Override
	public com.liferay.polls.model.PollsQuestion addQuestion(
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			java.util.List<com.liferay.polls.model.PollsChoice> choices,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsQuestionService.addQuestion(
			titleMap, descriptionMap, expirationDateMonth, expirationDateDay,
			expirationDateYear, expirationDateHour, expirationDateMinute,
			neverExpire, choices, serviceContext);
	}

	@Override
	public void deleteQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_pollsQuestionService.deleteQuestion(questionId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pollsQuestionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.polls.model.PollsQuestion getQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsQuestionService.getQuestion(questionId);
	}

	@Override
	public com.liferay.polls.model.PollsQuestion updateQuestion(
			long questionId, java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			java.util.List<com.liferay.polls.model.PollsChoice> choices,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pollsQuestionService.updateQuestion(
			questionId, titleMap, descriptionMap, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices, serviceContext);
	}

	@Override
	public PollsQuestionService getWrappedService() {
		return _pollsQuestionService;
	}

	@Override
	public void setWrappedService(PollsQuestionService pollsQuestionService) {
		_pollsQuestionService = pollsQuestionService;
	}

	private PollsQuestionService _pollsQuestionService;

}