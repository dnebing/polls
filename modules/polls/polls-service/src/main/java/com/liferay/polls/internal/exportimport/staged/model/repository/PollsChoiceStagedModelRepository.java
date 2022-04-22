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

package com.liferay.polls.internal.exportimport.staged.model.repository;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.PortletDataException;
import com.liferay.exportimport.staged.model.repository.StagedModelRepository;
import com.liferay.polls.model.PollsChoice;
import com.liferay.polls.service.PollsChoiceLocalService;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

/**
 * @author Akos Thurzo
 */
@Component(
	immediate = true,
	property = "model.class.name=com.liferay.polls.model.PollsChoice",
	service = StagedModelRepository.class
)
public class PollsChoiceStagedModelRepository
	implements StagedModelRepository<PollsChoice> {

	@Override
	public PollsChoice addStagedModel(
			PortletDataContext portletDataContext, PollsChoice pollsChoice)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteStagedModel(PollsChoice pollsChoice)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteStagedModel(
			String uuid, long groupId, String className, String extraData)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteStagedModels(PortletDataContext portletDataContext)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Override
	public PollsChoice fetchMissingReference(String uuid, long groupId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public PollsChoice fetchStagedModelByUuidAndGroupId(
		String uuid, long groupId) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<PollsChoice> fetchStagedModelsByUuidAndCompanyId(
		String uuid, long companyId) {

		throw new UnsupportedOperationException();
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext) {

		throw new UnsupportedOperationException();
	}

	@Override
	public PollsChoice getStagedModel(long choiceId) throws PortalException {
		return _pollsChoiceLocalService.getPollsChoice(choiceId);
	}

	@Override
	public void restoreStagedModel(
			PortletDataContext portletDataContext, PollsChoice pollsChoice)
		throws PortletDataException {

		throw new UnsupportedOperationException();
	}

	@Override
	public PollsChoice saveStagedModel(PollsChoice pollsChoice)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Override
	public PollsChoice updateStagedModel(
			PortletDataContext portletDataContext, PollsChoice pollsChoice)
		throws PortalException {

		throw new UnsupportedOperationException();
	}

	@Reference
	private PollsChoiceLocalService _pollsChoiceLocalService;

}