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

package com.liferay.commerce.product.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.product.exception.NoSuchCatalogLocalizationException;
import com.liferay.commerce.product.model.CommerceCatalogLocalization;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the commerce catalog localization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marco Leo
 * @see CommerceCatalogLocalizationUtil
 * @generated
 */
@ProviderType
public interface CommerceCatalogLocalizationPersistence
	extends BasePersistence<CommerceCatalogLocalization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CommerceCatalogLocalizationUtil} to access the commerce catalog localization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CommerceCatalogLocalization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the matching commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId);

	/**
	 * Returns a range of all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @return the range of matching commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end);

	/**
	 * Returns an ordered range of all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator);

	/**
	 * Returns an ordered range of all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization findByCommerceCatalogId_First(
			long commerceCatalogId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization fetchByCommerceCatalogId_First(
		long commerceCatalogId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator);

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization findByCommerceCatalogId_Last(
			long commerceCatalogId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization fetchByCommerceCatalogId_Last(
		long commerceCatalogId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator);

	/**
	 * Returns the commerce catalog localizations before and after the current commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the current commerce catalog localization
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public CommerceCatalogLocalization[] findByCommerceCatalogId_PrevAndNext(
			long commerceCatalogLocalizationId, long commerceCatalogId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Removes all the commerce catalog localizations where commerceCatalogId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 */
	public void removeByCommerceCatalogId(long commerceCatalogId);

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the number of matching commerce catalog localizations
	 */
	public int countByCommerceCatalogId(long commerceCatalogId);

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization findByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization fetchByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId);

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public CommerceCatalogLocalization fetchByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId, boolean useFinderCache);

	/**
	 * Removes the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the commerce catalog localization that was removed
	 */
	public CommerceCatalogLocalization removeByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63; and languageId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the number of matching commerce catalog localizations
	 */
	public int countByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId);

	/**
	 * Caches the commerce catalog localization in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalization the commerce catalog localization
	 */
	public void cacheResult(
		CommerceCatalogLocalization commerceCatalogLocalization);

	/**
	 * Caches the commerce catalog localizations in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalizations the commerce catalog localizations
	 */
	public void cacheResult(
		java.util.List<CommerceCatalogLocalization>
			commerceCatalogLocalizations);

	/**
	 * Creates a new commerce catalog localization with the primary key. Does not add the commerce catalog localization to the database.
	 *
	 * @param commerceCatalogLocalizationId the primary key for the new commerce catalog localization
	 * @return the new commerce catalog localization
	 */
	public CommerceCatalogLocalization create(
		long commerceCatalogLocalizationId);

	/**
	 * Removes the commerce catalog localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization that was removed
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public CommerceCatalogLocalization remove(
			long commerceCatalogLocalizationId)
		throws NoSuchCatalogLocalizationException;

	public CommerceCatalogLocalization updateImpl(
		CommerceCatalogLocalization commerceCatalogLocalization);

	/**
	 * Returns the commerce catalog localization with the primary key or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public CommerceCatalogLocalization findByPrimaryKey(
			long commerceCatalogLocalizationId)
		throws NoSuchCatalogLocalizationException;

	/**
	 * Returns the commerce catalog localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization, or <code>null</code> if a commerce catalog localization with the primary key could not be found
	 */
	public CommerceCatalogLocalization fetchByPrimaryKey(
		long commerceCatalogLocalizationId);

	/**
	 * Returns all the commerce catalog localizations.
	 *
	 * @return the commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findAll();

	/**
	 * Returns a range of all the commerce catalog localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @return the range of commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the commerce catalog localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator);

	/**
	 * Returns an ordered range of all the commerce catalog localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CommerceCatalogLocalizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of commerce catalog localizations
	 * @param end the upper bound of the range of commerce catalog localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of commerce catalog localizations
	 */
	public java.util.List<CommerceCatalogLocalization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the commerce catalog localizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of commerce catalog localizations.
	 *
	 * @return the number of commerce catalog localizations
	 */
	public int countAll();

}