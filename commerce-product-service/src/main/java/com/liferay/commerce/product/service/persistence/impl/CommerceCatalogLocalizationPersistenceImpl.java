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

package com.liferay.commerce.product.service.persistence.impl;

import com.liferay.commerce.product.exception.NoSuchCatalogLocalizationException;
import com.liferay.commerce.product.model.CommerceCatalogLocalization;
import com.liferay.commerce.product.model.impl.CommerceCatalogLocalizationImpl;
import com.liferay.commerce.product.model.impl.CommerceCatalogLocalizationModelImpl;
import com.liferay.commerce.product.service.persistence.CommerceCatalogLocalizationPersistence;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the commerce catalog localization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marco Leo
 * @generated
 */
public class CommerceCatalogLocalizationPersistenceImpl
	extends BasePersistenceImpl<CommerceCatalogLocalization>
	implements CommerceCatalogLocalizationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CommerceCatalogLocalizationUtil</code> to access the commerce catalog localization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CommerceCatalogLocalizationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByCommerceCatalogId;
	private FinderPath _finderPathWithoutPaginationFindByCommerceCatalogId;
	private FinderPath _finderPathCountByCommerceCatalogId;

	/**
	 * Returns all the commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the matching commerce catalog localizations
	 */
	@Override
	public List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId) {

		return findByCommerceCatalogId(
			commerceCatalogId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end) {

		return findByCommerceCatalogId(commerceCatalogId, start, end, null);
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
	@Override
	public List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return findByCommerceCatalogId(
			commerceCatalogId, start, end, orderByComparator, true);
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
	@Override
	public List<CommerceCatalogLocalization> findByCommerceCatalogId(
		long commerceCatalogId, int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByCommerceCatalogId;
				finderArgs = new Object[] {commerceCatalogId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCommerceCatalogId;
			finderArgs = new Object[] {
				commerceCatalogId, start, end, orderByComparator
			};
		}

		List<CommerceCatalogLocalization> list = null;

		if (useFinderCache) {
			list = (List<CommerceCatalogLocalization>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CommerceCatalogLocalization commerceCatalogLocalization :
						list) {

					if (commerceCatalogId !=
							commerceCatalogLocalization.
								getCommerceCatalogId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE);

			sb.append(_FINDER_COLUMN_COMMERCECATALOGID_COMMERCECATALOGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CommerceCatalogLocalizationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(commerceCatalogId);

				list = (List<CommerceCatalogLocalization>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization findByCommerceCatalogId_First(
			long commerceCatalogId,
			OrderByComparator<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			fetchByCommerceCatalogId_First(
				commerceCatalogId, orderByComparator);

		if (commerceCatalogLocalization != null) {
			return commerceCatalogLocalization;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("commerceCatalogId=");
		sb.append(commerceCatalogId);

		sb.append("}");

		throw new NoSuchCatalogLocalizationException(sb.toString());
	}

	/**
	 * Returns the first commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByCommerceCatalogId_First(
		long commerceCatalogId,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		List<CommerceCatalogLocalization> list = findByCommerceCatalogId(
			commerceCatalogId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization findByCommerceCatalogId_Last(
			long commerceCatalogId,
			OrderByComparator<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			fetchByCommerceCatalogId_Last(commerceCatalogId, orderByComparator);

		if (commerceCatalogLocalization != null) {
			return commerceCatalogLocalization;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("commerceCatalogId=");
		sb.append(commerceCatalogId);

		sb.append("}");

		throw new NoSuchCatalogLocalizationException(sb.toString());
	}

	/**
	 * Returns the last commerce catalog localization in the ordered set where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByCommerceCatalogId_Last(
		long commerceCatalogId,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		int count = countByCommerceCatalogId(commerceCatalogId);

		if (count == 0) {
			return null;
		}

		List<CommerceCatalogLocalization> list = findByCommerceCatalogId(
			commerceCatalogId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CommerceCatalogLocalization[] findByCommerceCatalogId_PrevAndNext(
			long commerceCatalogLocalizationId, long commerceCatalogId,
			OrderByComparator<CommerceCatalogLocalization> orderByComparator)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			findByPrimaryKey(commerceCatalogLocalizationId);

		Session session = null;

		try {
			session = openSession();

			CommerceCatalogLocalization[] array =
				new CommerceCatalogLocalizationImpl[3];

			array[0] = getByCommerceCatalogId_PrevAndNext(
				session, commerceCatalogLocalization, commerceCatalogId,
				orderByComparator, true);

			array[1] = commerceCatalogLocalization;

			array[2] = getByCommerceCatalogId_PrevAndNext(
				session, commerceCatalogLocalization, commerceCatalogId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CommerceCatalogLocalization getByCommerceCatalogId_PrevAndNext(
		Session session,
		CommerceCatalogLocalization commerceCatalogLocalization,
		long commerceCatalogId,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE);

		sb.append(_FINDER_COLUMN_COMMERCECATALOGID_COMMERCECATALOGID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CommerceCatalogLocalizationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(commerceCatalogId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						commerceCatalogLocalization)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CommerceCatalogLocalization> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the commerce catalog localizations where commerceCatalogId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 */
	@Override
	public void removeByCommerceCatalogId(long commerceCatalogId) {
		for (CommerceCatalogLocalization commerceCatalogLocalization :
				findByCommerceCatalogId(
					commerceCatalogId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(commerceCatalogLocalization);
		}
	}

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @return the number of matching commerce catalog localizations
	 */
	@Override
	public int countByCommerceCatalogId(long commerceCatalogId) {
		FinderPath finderPath = _finderPathCountByCommerceCatalogId;

		Object[] finderArgs = new Object[] {commerceCatalogId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMMERCECATALOGLOCALIZATION_WHERE);

			sb.append(_FINDER_COLUMN_COMMERCECATALOGID_COMMERCECATALOGID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(commerceCatalogId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_COMMERCECATALOGID_COMMERCECATALOGID_2 =
			"commerceCatalogLocalization.commerceCatalogId = ?";

	private FinderPath _finderPathFetchByCommerceCatalogId_LanguageId;
	private FinderPath _finderPathCountByCommerceCatalogId_LanguageId;

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization findByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			fetchByCommerceCatalogId_LanguageId(commerceCatalogId, languageId);

		if (commerceCatalogLocalization == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("commerceCatalogId=");
			sb.append(commerceCatalogId);

			sb.append(", languageId=");
			sb.append(languageId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCatalogLocalizationException(sb.toString());
		}

		return commerceCatalogLocalization;
	}

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId) {

		return fetchByCommerceCatalogId_LanguageId(
			commerceCatalogId, languageId, true);
	}

	/**
	 * Returns the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching commerce catalog localization, or <code>null</code> if a matching commerce catalog localization could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId, boolean useFinderCache) {

		languageId = Objects.toString(languageId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {commerceCatalogId, languageId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByCommerceCatalogId_LanguageId, finderArgs,
				this);
		}

		if (result instanceof CommerceCatalogLocalization) {
			CommerceCatalogLocalization commerceCatalogLocalization =
				(CommerceCatalogLocalization)result;

			if ((commerceCatalogId !=
					commerceCatalogLocalization.getCommerceCatalogId()) ||
				!Objects.equals(
					languageId, commerceCatalogLocalization.getLanguageId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE);

			sb.append(
				_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_COMMERCECATALOGID_2);

			boolean bindLanguageId = false;

			if (languageId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_3);
			}
			else {
				bindLanguageId = true;

				sb.append(
					_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(commerceCatalogId);

				if (bindLanguageId) {
					queryPos.add(languageId);
				}

				List<CommerceCatalogLocalization> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByCommerceCatalogId_LanguageId,
							finderArgs, list);
					}
				}
				else {
					CommerceCatalogLocalization commerceCatalogLocalization =
						list.get(0);

					result = commerceCatalogLocalization;

					cacheResult(commerceCatalogLocalization);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByCommerceCatalogId_LanguageId,
						finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CommerceCatalogLocalization)result;
		}
	}

	/**
	 * Removes the commerce catalog localization where commerceCatalogId = &#63; and languageId = &#63; from the database.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the commerce catalog localization that was removed
	 */
	@Override
	public CommerceCatalogLocalization removeByCommerceCatalogId_LanguageId(
			long commerceCatalogId, String languageId)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			findByCommerceCatalogId_LanguageId(commerceCatalogId, languageId);

		return remove(commerceCatalogLocalization);
	}

	/**
	 * Returns the number of commerce catalog localizations where commerceCatalogId = &#63; and languageId = &#63;.
	 *
	 * @param commerceCatalogId the commerce catalog ID
	 * @param languageId the language ID
	 * @return the number of matching commerce catalog localizations
	 */
	@Override
	public int countByCommerceCatalogId_LanguageId(
		long commerceCatalogId, String languageId) {

		languageId = Objects.toString(languageId, "");

		FinderPath finderPath = _finderPathCountByCommerceCatalogId_LanguageId;

		Object[] finderArgs = new Object[] {commerceCatalogId, languageId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_COMMERCECATALOGLOCALIZATION_WHERE);

			sb.append(
				_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_COMMERCECATALOGID_2);

			boolean bindLanguageId = false;

			if (languageId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_3);
			}
			else {
				bindLanguageId = true;

				sb.append(
					_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(commerceCatalogId);

				if (bindLanguageId) {
					queryPos.add(languageId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_COMMERCECATALOGID_2 =
			"commerceCatalogLocalization.commerceCatalogId = ? AND ";

	private static final String
		_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_2 =
			"commerceCatalogLocalization.languageId = ?";

	private static final String
		_FINDER_COLUMN_COMMERCECATALOGID_LANGUAGEID_LANGUAGEID_3 =
			"(commerceCatalogLocalization.languageId IS NULL OR commerceCatalogLocalization.languageId = '')";

	public CommerceCatalogLocalizationPersistenceImpl() {
		setModelClass(CommerceCatalogLocalization.class);
	}

	/**
	 * Caches the commerce catalog localization in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalization the commerce catalog localization
	 */
	@Override
	public void cacheResult(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		entityCache.putResult(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			commerceCatalogLocalization.getPrimaryKey(),
			commerceCatalogLocalization);

		finderCache.putResult(
			_finderPathFetchByCommerceCatalogId_LanguageId,
			new Object[] {
				commerceCatalogLocalization.getCommerceCatalogId(),
				commerceCatalogLocalization.getLanguageId()
			},
			commerceCatalogLocalization);

		commerceCatalogLocalization.resetOriginalValues();
	}

	/**
	 * Caches the commerce catalog localizations in the entity cache if it is enabled.
	 *
	 * @param commerceCatalogLocalizations the commerce catalog localizations
	 */
	@Override
	public void cacheResult(
		List<CommerceCatalogLocalization> commerceCatalogLocalizations) {

		for (CommerceCatalogLocalization commerceCatalogLocalization :
				commerceCatalogLocalizations) {

			if (entityCache.getResult(
					CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					CommerceCatalogLocalizationImpl.class,
					commerceCatalogLocalization.getPrimaryKey()) == null) {

				cacheResult(commerceCatalogLocalization);
			}
			else {
				commerceCatalogLocalization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all commerce catalog localizations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CommerceCatalogLocalizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the commerce catalog localization.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		entityCache.removeResult(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			commerceCatalogLocalization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(CommerceCatalogLocalizationModelImpl)commerceCatalogLocalization,
			true);
	}

	@Override
	public void clearCache(
		List<CommerceCatalogLocalization> commerceCatalogLocalizations) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CommerceCatalogLocalization commerceCatalogLocalization :
				commerceCatalogLocalizations) {

			entityCache.removeResult(
				CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
				CommerceCatalogLocalizationImpl.class,
				commerceCatalogLocalization.getPrimaryKey());

			clearUniqueFindersCache(
				(CommerceCatalogLocalizationModelImpl)
					commerceCatalogLocalization,
				true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
				CommerceCatalogLocalizationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CommerceCatalogLocalizationModelImpl
			commerceCatalogLocalizationModelImpl) {

		Object[] args = new Object[] {
			commerceCatalogLocalizationModelImpl.getCommerceCatalogId(),
			commerceCatalogLocalizationModelImpl.getLanguageId()
		};

		finderCache.putResult(
			_finderPathCountByCommerceCatalogId_LanguageId, args,
			Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByCommerceCatalogId_LanguageId, args,
			commerceCatalogLocalizationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CommerceCatalogLocalizationModelImpl
			commerceCatalogLocalizationModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				commerceCatalogLocalizationModelImpl.getCommerceCatalogId(),
				commerceCatalogLocalizationModelImpl.getLanguageId()
			};

			finderCache.removeResult(
				_finderPathCountByCommerceCatalogId_LanguageId, args);
			finderCache.removeResult(
				_finderPathFetchByCommerceCatalogId_LanguageId, args);
		}

		if ((commerceCatalogLocalizationModelImpl.getColumnBitmask() &
			 _finderPathFetchByCommerceCatalogId_LanguageId.
				 getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				commerceCatalogLocalizationModelImpl.
					getOriginalCommerceCatalogId(),
				commerceCatalogLocalizationModelImpl.getOriginalLanguageId()
			};

			finderCache.removeResult(
				_finderPathCountByCommerceCatalogId_LanguageId, args);
			finderCache.removeResult(
				_finderPathFetchByCommerceCatalogId_LanguageId, args);
		}
	}

	/**
	 * Creates a new commerce catalog localization with the primary key. Does not add the commerce catalog localization to the database.
	 *
	 * @param commerceCatalogLocalizationId the primary key for the new commerce catalog localization
	 * @return the new commerce catalog localization
	 */
	@Override
	public CommerceCatalogLocalization create(
		long commerceCatalogLocalizationId) {

		CommerceCatalogLocalization commerceCatalogLocalization =
			new CommerceCatalogLocalizationImpl();

		commerceCatalogLocalization.setNew(true);
		commerceCatalogLocalization.setPrimaryKey(
			commerceCatalogLocalizationId);

		commerceCatalogLocalization.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return commerceCatalogLocalization;
	}

	/**
	 * Removes the commerce catalog localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization that was removed
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization remove(
			long commerceCatalogLocalizationId)
		throws NoSuchCatalogLocalizationException {

		return remove((Serializable)commerceCatalogLocalizationId);
	}

	/**
	 * Removes the commerce catalog localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the commerce catalog localization
	 * @return the commerce catalog localization that was removed
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization remove(Serializable primaryKey)
		throws NoSuchCatalogLocalizationException {

		Session session = null;

		try {
			session = openSession();

			CommerceCatalogLocalization commerceCatalogLocalization =
				(CommerceCatalogLocalization)session.get(
					CommerceCatalogLocalizationImpl.class, primaryKey);

			if (commerceCatalogLocalization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCatalogLocalizationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(commerceCatalogLocalization);
		}
		catch (NoSuchCatalogLocalizationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CommerceCatalogLocalization removeImpl(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(commerceCatalogLocalization)) {
				commerceCatalogLocalization =
					(CommerceCatalogLocalization)session.get(
						CommerceCatalogLocalizationImpl.class,
						commerceCatalogLocalization.getPrimaryKeyObj());
			}

			if (commerceCatalogLocalization != null) {
				session.delete(commerceCatalogLocalization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (commerceCatalogLocalization != null) {
			clearCache(commerceCatalogLocalization);
		}

		return commerceCatalogLocalization;
	}

	@Override
	public CommerceCatalogLocalization updateImpl(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		boolean isNew = commerceCatalogLocalization.isNew();

		if (!(commerceCatalogLocalization instanceof
				CommerceCatalogLocalizationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					commerceCatalogLocalization.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					commerceCatalogLocalization);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in commerceCatalogLocalization proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CommerceCatalogLocalization implementation " +
					commerceCatalogLocalization.getClass());
		}

		CommerceCatalogLocalizationModelImpl
			commerceCatalogLocalizationModelImpl =
				(CommerceCatalogLocalizationModelImpl)
					commerceCatalogLocalization;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(commerceCatalogLocalization);

				commerceCatalogLocalization.setNew(false);
			}
			else {
				commerceCatalogLocalization =
					(CommerceCatalogLocalization)session.merge(
						commerceCatalogLocalization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CommerceCatalogLocalizationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				commerceCatalogLocalizationModelImpl.getCommerceCatalogId()
			};

			finderCache.removeResult(_finderPathCountByCommerceCatalogId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCommerceCatalogId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((commerceCatalogLocalizationModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCommerceCatalogId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					commerceCatalogLocalizationModelImpl.
						getOriginalCommerceCatalogId()
				};

				finderCache.removeResult(
					_finderPathCountByCommerceCatalogId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCommerceCatalogId, args);

				args = new Object[] {
					commerceCatalogLocalizationModelImpl.getCommerceCatalogId()
				};

				finderCache.removeResult(
					_finderPathCountByCommerceCatalogId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCommerceCatalogId, args);
			}
		}

		entityCache.putResult(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			commerceCatalogLocalization.getPrimaryKey(),
			commerceCatalogLocalization, false);

		clearUniqueFindersCache(commerceCatalogLocalizationModelImpl, false);
		cacheUniqueFindersCache(commerceCatalogLocalizationModelImpl);

		commerceCatalogLocalization.resetOriginalValues();

		return commerceCatalogLocalization;
	}

	/**
	 * Returns the commerce catalog localization with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the commerce catalog localization
	 * @return the commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCatalogLocalizationException {

		CommerceCatalogLocalization commerceCatalogLocalization =
			fetchByPrimaryKey(primaryKey);

		if (commerceCatalogLocalization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCatalogLocalizationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return commerceCatalogLocalization;
	}

	/**
	 * Returns the commerce catalog localization with the primary key or throws a <code>NoSuchCatalogLocalizationException</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization
	 * @throws NoSuchCatalogLocalizationException if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization findByPrimaryKey(
			long commerceCatalogLocalizationId)
		throws NoSuchCatalogLocalizationException {

		return findByPrimaryKey((Serializable)commerceCatalogLocalizationId);
	}

	/**
	 * Returns the commerce catalog localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the commerce catalog localization
	 * @return the commerce catalog localization, or <code>null</code> if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByPrimaryKey(
		Serializable primaryKey) {

		Serializable serializable = entityCache.getResult(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CommerceCatalogLocalization commerceCatalogLocalization =
			(CommerceCatalogLocalization)serializable;

		if (commerceCatalogLocalization == null) {
			Session session = null;

			try {
				session = openSession();

				commerceCatalogLocalization =
					(CommerceCatalogLocalization)session.get(
						CommerceCatalogLocalizationImpl.class, primaryKey);

				if (commerceCatalogLocalization != null) {
					cacheResult(commerceCatalogLocalization);
				}
				else {
					entityCache.putResult(
						CommerceCatalogLocalizationModelImpl.
							ENTITY_CACHE_ENABLED,
						CommerceCatalogLocalizationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					CommerceCatalogLocalizationImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return commerceCatalogLocalization;
	}

	/**
	 * Returns the commerce catalog localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commerceCatalogLocalizationId the primary key of the commerce catalog localization
	 * @return the commerce catalog localization, or <code>null</code> if a commerce catalog localization with the primary key could not be found
	 */
	@Override
	public CommerceCatalogLocalization fetchByPrimaryKey(
		long commerceCatalogLocalizationId) {

		return fetchByPrimaryKey((Serializable)commerceCatalogLocalizationId);
	}

	@Override
	public Map<Serializable, CommerceCatalogLocalization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CommerceCatalogLocalization> map =
			new HashMap<Serializable, CommerceCatalogLocalization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CommerceCatalogLocalization commerceCatalogLocalization =
				fetchByPrimaryKey(primaryKey);

			if (commerceCatalogLocalization != null) {
				map.put(primaryKey, commerceCatalogLocalization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
				CommerceCatalogLocalizationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(
						primaryKey, (CommerceCatalogLocalization)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		sb.append(_SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			sb.append((long)primaryKey);

			sb.append(",");
		}

		sb.setIndex(sb.index() - 1);

		sb.append(")");

		String sql = sb.toString();

		Session session = null;

		try {
			session = openSession();

			Query query = session.createQuery(sql);

			for (CommerceCatalogLocalization commerceCatalogLocalization :
					(List<CommerceCatalogLocalization>)query.list()) {

				map.put(
					commerceCatalogLocalization.getPrimaryKeyObj(),
					commerceCatalogLocalization);

				cacheResult(commerceCatalogLocalization);

				uncachedPrimaryKeys.remove(
					commerceCatalogLocalization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					CommerceCatalogLocalizationImpl.class, primaryKey,
					nullModel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the commerce catalog localizations.
	 *
	 * @return the commerce catalog localizations
	 */
	@Override
	public List<CommerceCatalogLocalization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CommerceCatalogLocalization> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<CommerceCatalogLocalization> findAll(
		int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<CommerceCatalogLocalization> findAll(
		int start, int end,
		OrderByComparator<CommerceCatalogLocalization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CommerceCatalogLocalization> list = null;

		if (useFinderCache) {
			list = (List<CommerceCatalogLocalization>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMMERCECATALOGLOCALIZATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMMERCECATALOGLOCALIZATION;

				sql = sql.concat(
					CommerceCatalogLocalizationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CommerceCatalogLocalization>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the commerce catalog localizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CommerceCatalogLocalization commerceCatalogLocalization :
				findAll()) {

			remove(commerceCatalogLocalization);
		}
	}

	/**
	 * Returns the number of commerce catalog localizations.
	 *
	 * @return the number of commerce catalog localizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_COMMERCECATALOGLOCALIZATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CommerceCatalogLocalizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the commerce catalog localization persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByCommerceCatalogId = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCommerceCatalogId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCommerceCatalogId = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCommerceCatalogId", new String[] {Long.class.getName()},
			CommerceCatalogLocalizationModelImpl.
				COMMERCECATALOGID_COLUMN_BITMASK);

		_finderPathCountByCommerceCatalogId = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCommerceCatalogId", new String[] {Long.class.getName()});

		_finderPathFetchByCommerceCatalogId_LanguageId = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			CommerceCatalogLocalizationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCommerceCatalogId_LanguageId",
			new String[] {Long.class.getName(), String.class.getName()},
			CommerceCatalogLocalizationModelImpl.
				COMMERCECATALOGID_COLUMN_BITMASK |
			CommerceCatalogLocalizationModelImpl.LANGUAGEID_COLUMN_BITMASK);

		_finderPathCountByCommerceCatalogId_LanguageId = new FinderPath(
			CommerceCatalogLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			CommerceCatalogLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCommerceCatalogId_LanguageId",
			new String[] {Long.class.getName(), String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(
			CommerceCatalogLocalizationImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_COMMERCECATALOGLOCALIZATION =
		"SELECT commerceCatalogLocalization FROM CommerceCatalogLocalization commerceCatalogLocalization";

	private static final String
		_SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE_PKS_IN =
			"SELECT commerceCatalogLocalization FROM CommerceCatalogLocalization commerceCatalogLocalization WHERE commerceCatalogLocalizationId IN (";

	private static final String _SQL_SELECT_COMMERCECATALOGLOCALIZATION_WHERE =
		"SELECT commerceCatalogLocalization FROM CommerceCatalogLocalization commerceCatalogLocalization WHERE ";

	private static final String _SQL_COUNT_COMMERCECATALOGLOCALIZATION =
		"SELECT COUNT(commerceCatalogLocalization) FROM CommerceCatalogLocalization commerceCatalogLocalization";

	private static final String _SQL_COUNT_COMMERCECATALOGLOCALIZATION_WHERE =
		"SELECT COUNT(commerceCatalogLocalization) FROM CommerceCatalogLocalization commerceCatalogLocalization WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"commerceCatalogLocalization.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CommerceCatalogLocalization exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CommerceCatalogLocalization exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CommerceCatalogLocalizationPersistenceImpl.class);

}