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

package com.liferay.commerce.product.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.commerce.product.exception.NoSuchCatalogLocalizationException;
import com.liferay.commerce.product.model.CommerceCatalogLocalization;
import com.liferay.commerce.product.service.persistence.CommerceCatalogLocalizationPersistence;
import com.liferay.commerce.product.service.persistence.CommerceCatalogLocalizationUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class CommerceCatalogLocalizationPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.liferay.commerce.product.service"));

	@Before
	public void setUp() {
		_persistence = CommerceCatalogLocalizationUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<CommerceCatalogLocalization> iterator =
			_commerceCatalogLocalizations.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CommerceCatalogLocalization commerceCatalogLocalization =
			_persistence.create(pk);

		Assert.assertNotNull(commerceCatalogLocalization);

		Assert.assertEquals(commerceCatalogLocalization.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		_persistence.remove(newCommerceCatalogLocalization);

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			_persistence.fetchByPrimaryKey(
				newCommerceCatalogLocalization.getPrimaryKey());

		Assert.assertNull(existingCommerceCatalogLocalization);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addCommerceCatalogLocalization();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CommerceCatalogLocalization newCommerceCatalogLocalization =
			_persistence.create(pk);

		newCommerceCatalogLocalization.setMvccVersion(
			RandomTestUtil.nextLong());

		newCommerceCatalogLocalization.setCompanyId(RandomTestUtil.nextLong());

		newCommerceCatalogLocalization.setCommerceCatalogId(
			RandomTestUtil.nextLong());

		newCommerceCatalogLocalization.setLanguageId(
			RandomTestUtil.randomString());

		newCommerceCatalogLocalization.setDescCatalog(
			RandomTestUtil.randomString());

		newCommerceCatalogLocalization.setSubCatalog(
			RandomTestUtil.randomString());

		newCommerceCatalogLocalization.setImageCatalog(
			RandomTestUtil.randomString());

		_commerceCatalogLocalizations.add(
			_persistence.update(newCommerceCatalogLocalization));

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			_persistence.findByPrimaryKey(
				newCommerceCatalogLocalization.getPrimaryKey());

		Assert.assertEquals(
			existingCommerceCatalogLocalization.getMvccVersion(),
			newCommerceCatalogLocalization.getMvccVersion());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.
				getCommerceCatalogLocalizationId(),
			newCommerceCatalogLocalization.getCommerceCatalogLocalizationId());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getCompanyId(),
			newCommerceCatalogLocalization.getCompanyId());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getCommerceCatalogId(),
			newCommerceCatalogLocalization.getCommerceCatalogId());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getLanguageId(),
			newCommerceCatalogLocalization.getLanguageId());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getDescCatalog(),
			newCommerceCatalogLocalization.getDescCatalog());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getSubCatalog(),
			newCommerceCatalogLocalization.getSubCatalog());
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getImageCatalog(),
			newCommerceCatalogLocalization.getImageCatalog());
	}

	@Test
	public void testCountByCommerceCatalogId() throws Exception {
		_persistence.countByCommerceCatalogId(RandomTestUtil.nextLong());

		_persistence.countByCommerceCatalogId(0L);
	}

	@Test
	public void testCountByCommerceCatalogId_LanguageId() throws Exception {
		_persistence.countByCommerceCatalogId_LanguageId(
			RandomTestUtil.nextLong(), "");

		_persistence.countByCommerceCatalogId_LanguageId(0L, "null");

		_persistence.countByCommerceCatalogId_LanguageId(0L, (String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			_persistence.findByPrimaryKey(
				newCommerceCatalogLocalization.getPrimaryKey());

		Assert.assertEquals(
			existingCommerceCatalogLocalization,
			newCommerceCatalogLocalization);
	}

	@Test(expected = NoSuchCatalogLocalizationException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<CommerceCatalogLocalization>
		getOrderByComparator() {

		return OrderByComparatorFactoryUtil.create(
			"CommerceCatalogLocalization", "mvccVersion", true,
			"commerceCatalogLocalizationId", true, "companyId", true,
			"commerceCatalogId", true, "languageId", true, "descCatalog", true,
			"subCatalog", true, "imageCatalog", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			_persistence.fetchByPrimaryKey(
				newCommerceCatalogLocalization.getPrimaryKey());

		Assert.assertEquals(
			existingCommerceCatalogLocalization,
			newCommerceCatalogLocalization);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CommerceCatalogLocalization missingCommerceCatalogLocalization =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingCommerceCatalogLocalization);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		CommerceCatalogLocalization newCommerceCatalogLocalization1 =
			addCommerceCatalogLocalization();
		CommerceCatalogLocalization newCommerceCatalogLocalization2 =
			addCommerceCatalogLocalization();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCommerceCatalogLocalization1.getPrimaryKey());
		primaryKeys.add(newCommerceCatalogLocalization2.getPrimaryKey());

		Map<Serializable, CommerceCatalogLocalization>
			commerceCatalogLocalizations = _persistence.fetchByPrimaryKeys(
				primaryKeys);

		Assert.assertEquals(2, commerceCatalogLocalizations.size());
		Assert.assertEquals(
			newCommerceCatalogLocalization1,
			commerceCatalogLocalizations.get(
				newCommerceCatalogLocalization1.getPrimaryKey()));
		Assert.assertEquals(
			newCommerceCatalogLocalization2,
			commerceCatalogLocalizations.get(
				newCommerceCatalogLocalization2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, CommerceCatalogLocalization>
			commerceCatalogLocalizations = _persistence.fetchByPrimaryKeys(
				primaryKeys);

		Assert.assertTrue(commerceCatalogLocalizations.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCommerceCatalogLocalization.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, CommerceCatalogLocalization>
			commerceCatalogLocalizations = _persistence.fetchByPrimaryKeys(
				primaryKeys);

		Assert.assertEquals(1, commerceCatalogLocalizations.size());
		Assert.assertEquals(
			newCommerceCatalogLocalization,
			commerceCatalogLocalizations.get(
				newCommerceCatalogLocalization.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, CommerceCatalogLocalization>
			commerceCatalogLocalizations = _persistence.fetchByPrimaryKeys(
				primaryKeys);

		Assert.assertTrue(commerceCatalogLocalizations.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCommerceCatalogLocalization.getPrimaryKey());

		Map<Serializable, CommerceCatalogLocalization>
			commerceCatalogLocalizations = _persistence.fetchByPrimaryKeys(
				primaryKeys);

		Assert.assertEquals(1, commerceCatalogLocalizations.size());
		Assert.assertEquals(
			newCommerceCatalogLocalization,
			commerceCatalogLocalizations.get(
				newCommerceCatalogLocalization.getPrimaryKey()));
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CommerceCatalogLocalization.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"commerceCatalogLocalizationId",
				newCommerceCatalogLocalization.
					getCommerceCatalogLocalizationId()));

		List<CommerceCatalogLocalization> result =
			_persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			result.get(0);

		Assert.assertEquals(
			existingCommerceCatalogLocalization,
			newCommerceCatalogLocalization);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CommerceCatalogLocalization.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"commerceCatalogLocalizationId", RandomTestUtil.nextLong()));

		List<CommerceCatalogLocalization> result =
			_persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CommerceCatalogLocalization.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("commerceCatalogLocalizationId"));

		Object newCommerceCatalogLocalizationId =
			newCommerceCatalogLocalization.getCommerceCatalogLocalizationId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"commerceCatalogLocalizationId",
				new Object[] {newCommerceCatalogLocalizationId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingCommerceCatalogLocalizationId = result.get(0);

		Assert.assertEquals(
			existingCommerceCatalogLocalizationId,
			newCommerceCatalogLocalizationId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CommerceCatalogLocalization.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("commerceCatalogLocalizationId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"commerceCatalogLocalizationId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		CommerceCatalogLocalization newCommerceCatalogLocalization =
			addCommerceCatalogLocalization();

		_persistence.clearCache();

		CommerceCatalogLocalization existingCommerceCatalogLocalization =
			_persistence.findByPrimaryKey(
				newCommerceCatalogLocalization.getPrimaryKey());

		Assert.assertEquals(
			Long.valueOf(
				existingCommerceCatalogLocalization.getCommerceCatalogId()),
			ReflectionTestUtil.<Long>invoke(
				existingCommerceCatalogLocalization,
				"getOriginalCommerceCatalogId", new Class<?>[0]));
		Assert.assertEquals(
			existingCommerceCatalogLocalization.getLanguageId(),
			ReflectionTestUtil.invoke(
				existingCommerceCatalogLocalization, "getOriginalLanguageId",
				new Class<?>[0]));
	}

	protected CommerceCatalogLocalization addCommerceCatalogLocalization()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		CommerceCatalogLocalization commerceCatalogLocalization =
			_persistence.create(pk);

		commerceCatalogLocalization.setMvccVersion(RandomTestUtil.nextLong());

		commerceCatalogLocalization.setCompanyId(RandomTestUtil.nextLong());

		commerceCatalogLocalization.setCommerceCatalogId(
			RandomTestUtil.nextLong());

		commerceCatalogLocalization.setLanguageId(
			RandomTestUtil.randomString());

		commerceCatalogLocalization.setDescCatalog(
			RandomTestUtil.randomString());

		commerceCatalogLocalization.setSubCatalog(
			RandomTestUtil.randomString());

		commerceCatalogLocalization.setImageCatalog(
			RandomTestUtil.randomString());

		_commerceCatalogLocalizations.add(
			_persistence.update(commerceCatalogLocalization));

		return commerceCatalogLocalization;
	}

	private List<CommerceCatalogLocalization> _commerceCatalogLocalizations =
		new ArrayList<CommerceCatalogLocalization>();
	private CommerceCatalogLocalizationPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}