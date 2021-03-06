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

package com.liferay.commerce.product.model.impl;

import com.liferay.commerce.product.model.CPSpecificationOption;
import com.liferay.commerce.product.model.CPSpecificationOptionModel;
import com.liferay.commerce.product.model.CPSpecificationOptionSoap;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CPSpecificationOption service. Represents a row in the &quot;CPSpecificationOption&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CPSpecificationOptionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CPSpecificationOptionImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CPSpecificationOptionImpl
 * @generated
 */
@JSON(strict = true)
public class CPSpecificationOptionModelImpl
	extends BaseModelImpl<CPSpecificationOption>
	implements CPSpecificationOptionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cp specification option model instance should use the <code>CPSpecificationOption</code> interface instead.
	 */
	public static final String TABLE_NAME = "CPSpecificationOption";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"CPSpecificationOptionId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"CPOptionCategoryId", Types.BIGINT},
		{"title", Types.VARCHAR}, {"description", Types.VARCHAR},
		{"facetable", Types.BOOLEAN}, {"key_", Types.VARCHAR},
		{"lastPublishDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("CPSpecificationOptionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("CPOptionCategoryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("facetable", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("key_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastPublishDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CPSpecificationOption (uuid_ VARCHAR(75) null,CPSpecificationOptionId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,CPOptionCategoryId LONG,title STRING null,description STRING null,facetable BOOLEAN,key_ VARCHAR(75) null,lastPublishDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table CPSpecificationOption";

	public static final String ORDER_BY_JPQL =
		" ORDER BY cpSpecificationOption.title ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CPSpecificationOption.title ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.product.model.CPSpecificationOption"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.product.model.CPSpecificationOption"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.product.model.CPSpecificationOption"),
		true);

	public static final long CPOPTIONCATEGORYID_COLUMN_BITMASK = 1L;

	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	public static final long KEY_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long TITLE_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CPSpecificationOption toModel(
		CPSpecificationOptionSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		CPSpecificationOption model = new CPSpecificationOptionImpl();

		model.setUuid(soapModel.getUuid());
		model.setCPSpecificationOptionId(
			soapModel.getCPSpecificationOptionId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCPOptionCategoryId(soapModel.getCPOptionCategoryId());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setFacetable(soapModel.isFacetable());
		model.setKey(soapModel.getKey());
		model.setLastPublishDate(soapModel.getLastPublishDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CPSpecificationOption> toModels(
		CPSpecificationOptionSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<CPSpecificationOption> models =
			new ArrayList<CPSpecificationOption>(soapModels.length);

		for (CPSpecificationOptionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.product.model.CPSpecificationOption"));

	public CPSpecificationOptionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _CPSpecificationOptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCPSpecificationOptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CPSpecificationOptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CPSpecificationOption.class;
	}

	@Override
	public String getModelClassName() {
		return CPSpecificationOption.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CPSpecificationOption, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CPSpecificationOption, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CPSpecificationOption, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CPSpecificationOption)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CPSpecificationOption, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CPSpecificationOption, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CPSpecificationOption)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CPSpecificationOption, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CPSpecificationOption, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CPSpecificationOption>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CPSpecificationOption.class.getClassLoader(),
			CPSpecificationOption.class, ModelWrapper.class);

		try {
			Constructor<CPSpecificationOption> constructor =
				(Constructor<CPSpecificationOption>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<CPSpecificationOption, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CPSpecificationOption, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CPSpecificationOption, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<CPSpecificationOption, Object>>();
		Map<String, BiConsumer<CPSpecificationOption, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<CPSpecificationOption, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object uuidObject) {

					cpSpecificationOption.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"CPSpecificationOptionId",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getCPSpecificationOptionId();
				}

			});
		attributeSetterBiConsumers.put(
			"CPSpecificationOptionId",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object CPSpecificationOptionIdObject) {

					cpSpecificationOption.setCPSpecificationOptionId(
						(Long)CPSpecificationOptionIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object companyIdObject) {

					cpSpecificationOption.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object userIdObject) {

					cpSpecificationOption.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object userNameObject) {

					cpSpecificationOption.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object createDateObject) {

					cpSpecificationOption.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object modifiedDateObject) {

					cpSpecificationOption.setModifiedDate(
						(Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"CPOptionCategoryId",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getCPOptionCategoryId();
				}

			});
		attributeSetterBiConsumers.put(
			"CPOptionCategoryId",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object CPOptionCategoryIdObject) {

					cpSpecificationOption.setCPOptionCategoryId(
						(Long)CPOptionCategoryIdObject);
				}

			});
		attributeGetterFunctions.put(
			"title",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getTitle();
				}

			});
		attributeSetterBiConsumers.put(
			"title",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object titleObject) {

					cpSpecificationOption.setTitle((String)titleObject);
				}

			});
		attributeGetterFunctions.put(
			"description",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getDescription();
				}

			});
		attributeSetterBiConsumers.put(
			"description",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object descriptionObject) {

					cpSpecificationOption.setDescription(
						(String)descriptionObject);
				}

			});
		attributeGetterFunctions.put(
			"facetable",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getFacetable();
				}

			});
		attributeSetterBiConsumers.put(
			"facetable",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object facetableObject) {

					cpSpecificationOption.setFacetable(
						(Boolean)facetableObject);
				}

			});
		attributeGetterFunctions.put(
			"key",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getKey();
				}

			});
		attributeSetterBiConsumers.put(
			"key",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object keyObject) {

					cpSpecificationOption.setKey((String)keyObject);
				}

			});
		attributeGetterFunctions.put(
			"lastPublishDate",
			new Function<CPSpecificationOption, Object>() {

				@Override
				public Object apply(
					CPSpecificationOption cpSpecificationOption) {

					return cpSpecificationOption.getLastPublishDate();
				}

			});
		attributeSetterBiConsumers.put(
			"lastPublishDate",
			new BiConsumer<CPSpecificationOption, Object>() {

				@Override
				public void accept(
					CPSpecificationOption cpSpecificationOption,
					Object lastPublishDateObject) {

					cpSpecificationOption.setLastPublishDate(
						(Date)lastPublishDateObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getCPSpecificationOptionId() {
		return _CPSpecificationOptionId;
	}

	@Override
	public void setCPSpecificationOptionId(long CPSpecificationOptionId) {
		_CPSpecificationOptionId = CPSpecificationOptionId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCPOptionCategoryId() {
		return _CPOptionCategoryId;
	}

	@Override
	public void setCPOptionCategoryId(long CPOptionCategoryId) {
		_columnBitmask |= CPOPTIONCATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCPOptionCategoryId) {
			_setOriginalCPOptionCategoryId = true;

			_originalCPOptionCategoryId = _CPOptionCategoryId;
		}

		_CPOptionCategoryId = CPOptionCategoryId;
	}

	public long getOriginalCPOptionCategoryId() {
		return _originalCPOptionCategoryId;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public String getTitle(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId);
	}

	@Override
	public String getTitle(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId, useDefault);
	}

	@Override
	public String getTitle(String languageId) {
		return LocalizationUtil.getLocalization(getTitle(), languageId);
	}

	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(
			getTitle(), languageId, useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _titleCurrentLanguageId;
	}

	@JSON
	@Override
	public String getTitleCurrentValue() {
		Locale locale = getLocale(_titleCurrentLanguageId);

		return getTitle(locale);
	}

	@Override
	public Map<Locale, String> getTitleMap() {
		return LocalizationUtil.getLocalizationMap(getTitle());
	}

	@Override
	public void setTitle(String title) {
		_columnBitmask = -1L;

		_title = title;
	}

	@Override
	public void setTitle(String title, Locale locale) {
		setTitle(title, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setTitle(String title, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(title)) {
			setTitle(
				LocalizationUtil.updateLocalization(
					getTitle(), "Title", title, languageId, defaultLanguageId));
		}
		else {
			setTitle(
				LocalizationUtil.removeLocalization(
					getTitle(), "Title", languageId));
		}
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_titleCurrentLanguageId = languageId;
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap) {
		setTitleMap(titleMap, LocaleUtil.getDefault());
	}

	@Override
	public void setTitleMap(
		Map<Locale, String> titleMap, Locale defaultLocale) {

		if (titleMap == null) {
			return;
		}

		setTitle(
			LocalizationUtil.updateLocalization(
				titleMap, getTitle(), "Title",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public String getDescription(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId);
	}

	@Override
	public String getDescription(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId, useDefault);
	}

	@Override
	public String getDescription(String languageId) {
		return LocalizationUtil.getLocalization(getDescription(), languageId);
	}

	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(
			getDescription(), languageId, useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return _descriptionCurrentLanguageId;
	}

	@JSON
	@Override
	public String getDescriptionCurrentValue() {
		Locale locale = getLocale(_descriptionCurrentLanguageId);

		return getDescription(locale);
	}

	@Override
	public Map<Locale, String> getDescriptionMap() {
		return LocalizationUtil.getLocalizationMap(getDescription());
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public void setDescription(String description, Locale locale) {
		setDescription(description, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setDescription(
		String description, Locale locale, Locale defaultLocale) {

		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(description)) {
			setDescription(
				LocalizationUtil.updateLocalization(
					getDescription(), "Description", description, languageId,
					defaultLanguageId));
		}
		else {
			setDescription(
				LocalizationUtil.removeLocalization(
					getDescription(), "Description", languageId));
		}
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		_descriptionCurrentLanguageId = languageId;
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap) {
		setDescriptionMap(descriptionMap, LocaleUtil.getDefault());
	}

	@Override
	public void setDescriptionMap(
		Map<Locale, String> descriptionMap, Locale defaultLocale) {

		if (descriptionMap == null) {
			return;
		}

		setDescription(
			LocalizationUtil.updateLocalization(
				descriptionMap, getDescription(), "Description",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public boolean getFacetable() {
		return _facetable;
	}

	@JSON
	@Override
	public boolean isFacetable() {
		return _facetable;
	}

	@Override
	public void setFacetable(boolean facetable) {
		_facetable = facetable;
	}

	@JSON
	@Override
	public String getKey() {
		if (_key == null) {
			return "";
		}
		else {
			return _key;
		}
	}

	@Override
	public void setKey(String key) {
		_columnBitmask |= KEY_COLUMN_BITMASK;

		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	@JSON
	@Override
	public Date getLastPublishDate() {
		return _lastPublishDate;
	}

	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		_lastPublishDate = lastPublishDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(CPSpecificationOption.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CPSpecificationOption.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> titleMap = getTitleMap();

		for (Map.Entry<Locale, String> entry : titleMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> descriptionMap = getDescriptionMap();

		for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(
			new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getTitle();

		if (xml == null) {
			return "";
		}

		Locale defaultLocale = LocaleUtil.getDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		Locale defaultLocale = LocaleUtil.fromLanguageId(
			getDefaultLanguageId());

		Locale[] availableLocales = LocaleUtil.fromLanguageIds(
			getAvailableLanguageIds());

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(
			CPSpecificationOption.class.getName(), getPrimaryKey(),
			defaultLocale, availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {

		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String title = getTitle(defaultLocale);

		if (Validator.isNull(title)) {
			setTitle(getTitle(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setTitle(getTitle(defaultLocale), defaultLocale, defaultLocale);
		}

		String description = getDescription(defaultLocale);

		if (Validator.isNull(description)) {
			setDescription(
				getDescription(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setDescription(
				getDescription(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public CPSpecificationOption toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CPSpecificationOption>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CPSpecificationOptionImpl cpSpecificationOptionImpl =
			new CPSpecificationOptionImpl();

		cpSpecificationOptionImpl.setUuid(getUuid());
		cpSpecificationOptionImpl.setCPSpecificationOptionId(
			getCPSpecificationOptionId());
		cpSpecificationOptionImpl.setCompanyId(getCompanyId());
		cpSpecificationOptionImpl.setUserId(getUserId());
		cpSpecificationOptionImpl.setUserName(getUserName());
		cpSpecificationOptionImpl.setCreateDate(getCreateDate());
		cpSpecificationOptionImpl.setModifiedDate(getModifiedDate());
		cpSpecificationOptionImpl.setCPOptionCategoryId(
			getCPOptionCategoryId());
		cpSpecificationOptionImpl.setTitle(getTitle());
		cpSpecificationOptionImpl.setDescription(getDescription());
		cpSpecificationOptionImpl.setFacetable(isFacetable());
		cpSpecificationOptionImpl.setKey(getKey());
		cpSpecificationOptionImpl.setLastPublishDate(getLastPublishDate());

		cpSpecificationOptionImpl.resetOriginalValues();

		return cpSpecificationOptionImpl;
	}

	@Override
	public int compareTo(CPSpecificationOption cpSpecificationOption) {
		int value = 0;

		value = getTitle().compareTo(cpSpecificationOption.getTitle());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CPSpecificationOption)) {
			return false;
		}

		CPSpecificationOption cpSpecificationOption =
			(CPSpecificationOption)object;

		long primaryKey = cpSpecificationOption.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CPSpecificationOptionModelImpl cpSpecificationOptionModelImpl = this;

		cpSpecificationOptionModelImpl._originalUuid =
			cpSpecificationOptionModelImpl._uuid;

		cpSpecificationOptionModelImpl._originalCompanyId =
			cpSpecificationOptionModelImpl._companyId;

		cpSpecificationOptionModelImpl._setOriginalCompanyId = false;

		cpSpecificationOptionModelImpl._setModifiedDate = false;

		cpSpecificationOptionModelImpl._originalCPOptionCategoryId =
			cpSpecificationOptionModelImpl._CPOptionCategoryId;

		cpSpecificationOptionModelImpl._setOriginalCPOptionCategoryId = false;

		cpSpecificationOptionModelImpl._originalKey =
			cpSpecificationOptionModelImpl._key;

		cpSpecificationOptionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CPSpecificationOption> toCacheModel() {
		CPSpecificationOptionCacheModel cpSpecificationOptionCacheModel =
			new CPSpecificationOptionCacheModel();

		cpSpecificationOptionCacheModel.uuid = getUuid();

		String uuid = cpSpecificationOptionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			cpSpecificationOptionCacheModel.uuid = null;
		}

		cpSpecificationOptionCacheModel.CPSpecificationOptionId =
			getCPSpecificationOptionId();

		cpSpecificationOptionCacheModel.companyId = getCompanyId();

		cpSpecificationOptionCacheModel.userId = getUserId();

		cpSpecificationOptionCacheModel.userName = getUserName();

		String userName = cpSpecificationOptionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			cpSpecificationOptionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			cpSpecificationOptionCacheModel.createDate = createDate.getTime();
		}
		else {
			cpSpecificationOptionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cpSpecificationOptionCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			cpSpecificationOptionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		cpSpecificationOptionCacheModel.CPOptionCategoryId =
			getCPOptionCategoryId();

		cpSpecificationOptionCacheModel.title = getTitle();

		String title = cpSpecificationOptionCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			cpSpecificationOptionCacheModel.title = null;
		}

		cpSpecificationOptionCacheModel.description = getDescription();

		String description = cpSpecificationOptionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			cpSpecificationOptionCacheModel.description = null;
		}

		cpSpecificationOptionCacheModel.facetable = isFacetable();

		cpSpecificationOptionCacheModel.key = getKey();

		String key = cpSpecificationOptionCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			cpSpecificationOptionCacheModel.key = null;
		}

		Date lastPublishDate = getLastPublishDate();

		if (lastPublishDate != null) {
			cpSpecificationOptionCacheModel.lastPublishDate =
				lastPublishDate.getTime();
		}
		else {
			cpSpecificationOptionCacheModel.lastPublishDate = Long.MIN_VALUE;
		}

		return cpSpecificationOptionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CPSpecificationOption, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CPSpecificationOption, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CPSpecificationOption, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply((CPSpecificationOption)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CPSpecificationOption, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CPSpecificationOption, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CPSpecificationOption, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((CPSpecificationOption)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CPSpecificationOption>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _CPSpecificationOptionId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _CPOptionCategoryId;
	private long _originalCPOptionCategoryId;
	private boolean _setOriginalCPOptionCategoryId;
	private String _title;
	private String _titleCurrentLanguageId;
	private String _description;
	private String _descriptionCurrentLanguageId;
	private boolean _facetable;
	private String _key;
	private String _originalKey;
	private Date _lastPublishDate;
	private long _columnBitmask;
	private CPSpecificationOption _escapedModel;

}