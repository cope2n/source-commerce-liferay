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

package com.liferay.commerce.product.service.impl;

import com.liferay.commerce.product.constants.CPActionKeys;
import com.liferay.commerce.product.model.CommerceCatalog;
import com.liferay.commerce.product.service.base.CommerceCatalogServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;

import java.util.List;

/**
 * @author Alec Sloan
 * @author Alessio Antonio Rendina
 */
public class CommerceCatalogServiceImpl extends CommerceCatalogServiceBaseImpl {

	@Override
	public CommerceCatalog addCommerceCatalog(
			String name, String commerceCurrencyCode,
			String catalogDefaultLanguageId, String externalReferenceCode,
			ServiceContext serviceContext, String descCatalog)
		throws PortalException {

		PortalPermissionUtil.check(
			getPermissionChecker(), CPActionKeys.ADD_COMMERCE_CATALOG);

		return commerceCatalogLocalService.addCommerceCatalog(
			name, commerceCurrencyCode, catalogDefaultLanguageId,
			externalReferenceCode, serviceContext, descCatalog);
	}

	@Override
	public CommerceCatalog deleteCommerceCatalog(long commerceCatalogId)
		throws PortalException {

		_commerceCatalogModelResourcePermission.check(
			getPermissionChecker(), commerceCatalogId, ActionKeys.DELETE);

		return commerceCatalogLocalService.deleteCommerceCatalog(
			commerceCatalogId);
	}

	@Override
	public CommerceCatalog fetchByExternalReferenceCode(
			long companyId, String externalReferenceCode)
		throws PortalException {

		CommerceCatalog commerceCatalog =
			commerceCatalogLocalService.fetchByExternalReferenceCode(
				companyId, externalReferenceCode);

		if (commerceCatalog != null) {
			_commerceCatalogModelResourcePermission.check(
				getPermissionChecker(), commerceCatalog, ActionKeys.VIEW);
		}

		return commerceCatalog;
	}

	@Override
	public CommerceCatalog fetchCommerceCatalog(long commerceCatalogId)
		throws PortalException {

		CommerceCatalog commerceCatalog =
			commerceCatalogLocalService.fetchCommerceCatalog(commerceCatalogId);

		if (commerceCatalog != null) {
			_commerceCatalogModelResourcePermission.check(
				getPermissionChecker(), commerceCatalog, ActionKeys.VIEW);
		}

		return commerceCatalog;
	}

	@Override
	public CommerceCatalog fetchCommerceCatalogByGroupId(long groupId)
		throws PortalException {

		CommerceCatalog commerceCatalog =
			commerceCatalogLocalService.fetchCommerceCatalogByGroupId(groupId);

		if (commerceCatalog != null) {
			_commerceCatalogModelResourcePermission.check(
				getPermissionChecker(), commerceCatalog, ActionKeys.VIEW);
		}

		return commerceCatalog;
	}

	@Override
	public CommerceCatalog getCommerceCatalog(long commerceCatalogId)
		throws PortalException {

		_commerceCatalogModelResourcePermission.check(
			getPermissionChecker(), commerceCatalogId, ActionKeys.VIEW);

		return commerceCatalogLocalService.getCommerceCatalog(
			commerceCatalogId);
	}

	@Override
	public List<CommerceCatalog> getCommerceCatalogs(
		long companyId, int start, int end) {

		return commerceCatalogPersistence.filterFindByCompanyId(
			companyId, start, end);
	}

	@Override
	public List<CommerceCatalog> searchCommerceCatalogs(
			long companyId, String keywords, int start, int end, Sort sort)
		throws PortalException {

		return commerceCatalogLocalService.searchCommerceCatalogs(
			companyId, keywords, start, end, sort);
	}

	@Override
	public int searchCommerceCatalogsCount(long companyId, String keywords)
		throws PortalException {

		return commerceCatalogLocalService.searchCommerceCatalogsCount(
			companyId, keywords);
	}

	@Override
	public CommerceCatalog updateCommerceCatalog(
			long commerceCatalogId, String name, String commerceCurrencyCode,
			String catalogDefaultLanguageId, String descCatalog)
		throws PortalException {

		_commerceCatalogModelResourcePermission.check(
			getPermissionChecker(), commerceCatalogId, ActionKeys.UPDATE);

		return commerceCatalogLocalService.updateCommerceCatalog(
			commerceCatalogId, name, commerceCurrencyCode,
			catalogDefaultLanguageId, descCatalog);
	}

	private static volatile ModelResourcePermission<CommerceCatalog>
		_commerceCatalogModelResourcePermission =
			ModelResourcePermissionFactory.getInstance(
				CommerceCatalogServiceImpl.class,
				"_commerceCatalogModelResourcePermission",
				CommerceCatalog.class);

}