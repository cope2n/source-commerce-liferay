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

import com.liferay.commerce.product.model.CommerceCatalogLocalization;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the commerce catalog localization service. This utility wraps <code>com.liferay.commerce.product.service.persistence.impl.CommerceCatalogLocalizationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marco Leo
 * @see CommerceCatalogLocalizationPersistence
 * @generated
 */
public class CommerceCatalogLocalizationUtil {

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
	public static void clearCache(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		getPersistence().clearCache(commerceCatalogLocalization);
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
	public static Map<Serializable, CommerceCatalogLocalization>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CommerceCatalogLocalization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommerceCatalogLocalization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommerceCatalogLocalization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CommerceCatalogLocalization update(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		return getPersistence().update(commerceCatalogLocalization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CommerceCatalogLocalization update(
		CommerceCatalogLocalization commerceCatalogLocalization,
		ServiceContext serviceContext) {

		return getPersistence().update(
			commerceCatalogLocalization, serviceContext);
	}

	/**
	 * Returns all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the matching commerce catalog localizations
	 */
	public static List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId) {

		return getPersistence().findByCommerceCatalogId(commerceCatalogId);
	}

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
	public static List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end) {

		return getPersistence().findByCommerceCatalogId(
			commerceCatalogId, start, end);
	}

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
	public static List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return getPersistence().findByCommerceCatalogId(
			commerceCatalogId, start, end, orderByComparator);
	}

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
	public static List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCommerceCatalogId(
			commerceCatalogId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization findByCommerceCatalogId_First(
			long commerceCatalogId,
			OrderByComparator<CommerceCatalogLocalization> orderByComparator)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().findByCommerceCatalogId_First(
			commerceCatalogId, orderByComparator);
	}

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization fetchByCommerceCatalogId_First(
		long commerceCatalogId,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return getPersistence().fetchByCommerceCatalogId_First(
			commerceCatalogId, orderByComparator);
	}

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization findByCommerceCatalogId_Last(
			long commerceCatalogId,
			OrderByComparator<CommerceCatalogLocalization> orderByComparator)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().findByCommerceCatalogId_Last(
			commerceCatalogId, orderByComparator);
	}

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization fetchByCommerceCatalogId_Last(
		long commerceCatalogId,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return getPersistence().fetchByCommerceCatalogId_Last(
			commerceCatalogId, orderByComparator);
	}

	/**
	 * Returns the commerce catalog localizations before and after the current commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the current commerce catalog localization
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public static CommerceCatalogLocalization[]
			findByCommerceCatalogId_PrevAndNext(
				long commerceCatalogLocalizationId, long commerceCatalogId,
				OrderByComparator<CommerceCatalogLocalization>
					orderByComparator)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().findByCommerceCatalogId_PrevAndNext(
			commerceCatalogLocalizationId, commerceCatalogId,
			orderByComparator);
	}

	/**
	 * Removes all the commerce catalog localizations where commerceCatalogId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 */
	public static void removeByCommerceCatalogId(long commerceCatalogId) {
		getPersistence().removeByCommerceCatalogId(commerceCatalogId);
	}

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the number of matching commerce catalog localizations
	 */
	public static int countByCommerceCatalogId(long commerceCatalogId) {
		return getPersistence().countByCommerceCatalogId(commerceCatalogId);
	}

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization
			findByCommerceCatalogId_LanguageId(
				long commerceCatalogId, String languageId)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().findByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId);
	}

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization
		fetchByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId) {

		return getPersistence().fetchByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId);
	}

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	public static CommerceCatalogLocalization
		fetchByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId, boolean useFinderCache) {

		return getPersistence().fetchByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId, useFinderCache);
	}

	/**
	 * Removes the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the commerce catalog localization that was removed
	 */
	public static CommerceCatalogLocalization
			removeByCommerceCatalogId_LanguageId(
				long commerceCatalogId, String languageId)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().removeByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId);
	}

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63; and languageId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the number of matching commerce catalog localizations
	 */
	public static int countByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId) {

		return getPersistence().countByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId);
	}

	/**
	 * Caches the commerce catalog localization in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalization the commerce catalog localization
	 */
	public static void cacheResult(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		getPersistence().cacheResult(commerceCatalogLocalization);
	}

	/**
	 * Caches the commerce catalog localizations in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalizations the commerce catalog localizations
	 */
	public static void cacheResult(
		List<CommerceCatalogLocalization> commerceCatalogLocalizations) {

		getPersistence().cacheResult(commerceCatalogLocalizations);
	}

	/**
	 * Creates a new commerce catalog localization with the primary key. Does not add the commerce catalog localization to the database.
	 *
	 * @param commerceCatalogLocalizationId the primary key for the new commerce catalog localization
	 * @return the new commerce catalog localization
	 */
	public static CommerceCatalogLocalization create(
		long commerceCatalogLocalizationId) {

		return getPersistence().create(commerceCatalogLocalizationId);
	}

	/**
	 * Removes the commerce catalog localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization that was removed
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public static CommerceCatalogLocalization remove(
			long commerceCatalogLocalizationId)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().remove(commerceCatalogLocalizationId);
	}

	public static CommerceCatalogLocalization updateImpl(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		return getPersistence().updateImpl(commerceCatalogLocalization);
	}

	/**
	 * Returns the commerce catalog localization with the primary key or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	public static CommerceCatalogLocalization findByPrimaryKey(
			long commerceCatalogLocalizationId)
		throws com.liferay.commerce.product.exception.
			NoSuchCatalogLocalizationException {

		return getPersistence().findByPrimaryKey(commerceCatalogLocalizationId);
	}

	/**
	 * Returns the commerce catalog localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization, or <code>null</code> if a commerce catalog localization with the primary key could not be found
	 */
	public static CommerceCatalogLocalization fetchByPrimaryKey(
		long commerceCatalogLocalizationId) {

		return getPersistence().fetchByPrimaryKey(
			commerceCatalogLocalizationId);
	}

	/**
	 * Returns all the commerce catalog localizations.
	 *
	 * @return the commerce catalog localizations
	 */
	public static List<CommerceCatalogLocalization> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CommerceCatalogLocalization> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

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
	public static List<CommerceCatalogLocalization> findAll(
		int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CommerceCatalogLocalization> findAll(
		int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the commerce catalog localizations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of commerce catalog localizations.
	 *
	 * @return the number of commerce catalog localizations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CommerceCatalogLocalizationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CommerceCatalogLocalizationPersistence,
		 CommerceCatalogLocalizationPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CommerceCatalogLocalizationPersistence.class);

		ServiceTracker
			<CommerceCatalogLocalizationPersistence,
			 CommerceCatalogLocalizationPersistence> serviceTracker =
				new ServiceTracker
					<CommerceCatalogLocalizationPersistence,
					 CommerceCatalogLocalizationPersistence>(
						 bundle.getBundleContext(),
						 CommerceCatalogLocalizationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}