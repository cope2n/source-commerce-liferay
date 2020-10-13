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

import com.liferay.commerce.product.model.CommerceCatalog;
import com.liferay.commerce.product.model.CommerceCatalogModel;
import com.liferay.commerce.product.model.CommerceCatalogSoap;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

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
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CommerceCatalog service. Represents a row in the &quot;CommerceCatalog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CommerceCatalogModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceCatalogImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceCatalogImpl
 * @generated
 */
@JSON(strict = true)
public class CommerceCatalogModelImpl
	extends BaseModelImpl<CommerceCatalog> implements CommerceCatalogModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce catalog model instance should use the <code>CommerceCatalog</code> interface instead.
	 */
	public static final String TABLE_NAME = "CommerceCatalog";

	public static final Object[][] TABLE_COLUMNS = {
		{"externalReferenceCode", Types.VARCHAR},
		{"commerceCatalogId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"name", Types.VARCHAR}, {"commerceCurrencyCode", Types.VARCHAR},
		{"catalogDefaultLanguageId", Types.VARCHAR}, {"system", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("externalReferenceCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("commerceCatalogId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("commerceCurrencyCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("catalogDefaultLanguageId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("system", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CommerceCatalog (externalReferenceCode VARCHAR(75) null,commerceCatalogId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,commerceCurrencyCode VARCHAR(75) null,catalogDefaultLanguageId VARCHAR(75) null,system BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table CommerceCatalog";

	public static final String ORDER_BY_JPQL =
		" ORDER BY commerceCatalog.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CommerceCatalog.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.product.model.CommerceCatalog"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.product.model.CommerceCatalog"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.product.model.CommerceCatalog"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long EXTERNALREFERENCECODE_COLUMN_BITMASK = 2L;

	public static final long SYSTEM_COLUMN_BITMASK = 4L;

	public static final long CREATEDATE_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CommerceCatalog toModel(CommerceCatalogSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CommerceCatalog model = new CommerceCatalogImpl();

		model.setExternalReferenceCode(soapModel.getExternalReferenceCode());
		model.setCommerceCatalogId(soapModel.getCommerceCatalogId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setCommerceCurrencyCode(soapModel.getCommerceCurrencyCode());
		model.setCatalogDefaultLanguageId(
			soapModel.getCatalogDefaultLanguageId());
		model.setSystem(soapModel.isSystem());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CommerceCatalog> toModels(
		CommerceCatalogSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<CommerceCatalog> models = new ArrayList<CommerceCatalog>(
			soapModels.length);

		for (CommerceCatalogSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.product.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.product.model.CommerceCatalog"));

	public CommerceCatalogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commerceCatalogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommerceCatalogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceCatalogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceCatalog.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceCatalog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CommerceCatalog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CommerceCatalog, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceCatalog, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CommerceCatalog)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CommerceCatalog, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CommerceCatalog, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CommerceCatalog)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CommerceCatalog, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CommerceCatalog, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CommerceCatalog>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CommerceCatalog.class.getClassLoader(), CommerceCatalog.class,
			ModelWrapper.class);

		try {
			Constructor<CommerceCatalog> constructor =
				(Constructor<CommerceCatalog>)proxyClass.getConstructor(
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

	private static final Map<String, Function<CommerceCatalog, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CommerceCatalog, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CommerceCatalog, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<CommerceCatalog, Object>>();
		Map<String, BiConsumer<CommerceCatalog, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CommerceCatalog, ?>>();

		attributeGetterFunctions.put(
			"externalReferenceCode",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getExternalReferenceCode();
				}

			});
		attributeSetterBiConsumers.put(
			"externalReferenceCode",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog,
					Object externalReferenceCodeObject) {

					commerceCatalog.setExternalReferenceCode(
						(String)externalReferenceCodeObject);
				}

			});
		attributeGetterFunctions.put(
			"commerceCatalogId",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getCommerceCatalogId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceCatalogId",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog,
					Object commerceCatalogIdObject) {

					commerceCatalog.setCommerceCatalogId(
						(Long)commerceCatalogIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object companyIdObject) {

					commerceCatalog.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object userIdObject) {

					commerceCatalog.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object userNameObject) {

					commerceCatalog.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object createDateObject) {

					commerceCatalog.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog,
					Object modifiedDateObject) {

					commerceCatalog.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"name",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getName();
				}

			});
		attributeSetterBiConsumers.put(
			"name",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object nameObject) {

					commerceCatalog.setName((String)nameObject);
				}

			});
		attributeGetterFunctions.put(
			"commerceCurrencyCode",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getCommerceCurrencyCode();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceCurrencyCode",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog,
					Object commerceCurrencyCodeObject) {

					commerceCatalog.setCommerceCurrencyCode(
						(String)commerceCurrencyCodeObject);
				}

			});
		attributeGetterFunctions.put(
			"catalogDefaultLanguageId",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getCatalogDefaultLanguageId();
				}

			});
		attributeSetterBiConsumers.put(
			"catalogDefaultLanguageId",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog,
					Object catalogDefaultLanguageIdObject) {

					commerceCatalog.setCatalogDefaultLanguageId(
						(String)catalogDefaultLanguageIdObject);
				}

			});
		attributeGetterFunctions.put(
			"system",
			new Function<CommerceCatalog, Object>() {

				@Override
				public Object apply(CommerceCatalog commerceCatalog) {
					return commerceCatalog.getSystem();
				}

			});
		attributeSetterBiConsumers.put(
			"system",
			new BiConsumer<CommerceCatalog, Object>() {

				@Override
				public void accept(
					CommerceCatalog commerceCatalog, Object systemObject) {

					commerceCatalog.setSystem((Boolean)systemObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getExternalReferenceCode() {
		if (_externalReferenceCode == null) {
			return "";
		}
		else {
			return _externalReferenceCode;
		}
	}

	@Override
	public void setExternalReferenceCode(String externalReferenceCode) {
		_columnBitmask |= EXTERNALREFERENCECODE_COLUMN_BITMASK;

		if (_originalExternalReferenceCode == null) {
			_originalExternalReferenceCode = _externalReferenceCode;
		}

		_externalReferenceCode = externalReferenceCode;
	}

	public String getOriginalExternalReferenceCode() {
		return GetterUtil.getString(_originalExternalReferenceCode);
	}

	@JSON
	@Override
	public long getCommerceCatalogId() {
		return _commerceCatalogId;
	}

	@Override
	public void setCommerceCatalogId(long commerceCatalogId) {
		_commerceCatalogId = commerceCatalogId;
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
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getCommerceCurrencyCode() {
		if (_commerceCurrencyCode == null) {
			return "";
		}
		else {
			return _commerceCurrencyCode;
		}
	}

	@Override
	public void setCommerceCurrencyCode(String commerceCurrencyCode) {
		_commerceCurrencyCode = commerceCurrencyCode;
	}

	@JSON
	@Override
	public String getCatalogDefaultLanguageId() {
		if (_catalogDefaultLanguageId == null) {
			return "";
		}
		else {
			return _catalogDefaultLanguageId;
		}
	}

	@Override
	public void setCatalogDefaultLanguageId(String catalogDefaultLanguageId) {
		_catalogDefaultLanguageId = catalogDefaultLanguageId;
	}

	@JSON
	@Override
	public boolean getSystem() {
		return _system;
	}

	@JSON
	@Override
	public boolean isSystem() {
		return _system;
	}

	@Override
	public void setSystem(boolean system) {
		_columnBitmask |= SYSTEM_COLUMN_BITMASK;

		if (!_setOriginalSystem) {
			_setOriginalSystem = true;

			_originalSystem = _system;
		}

		_system = system;
	}

	public boolean getOriginalSystem() {
		return _originalSystem;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CommerceCatalog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommerceCatalog toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CommerceCatalog>
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
		CommerceCatalogImpl commerceCatalogImpl = new CommerceCatalogImpl();

		commerceCatalogImpl.setExternalReferenceCode(
			getExternalReferenceCode());
		commerceCatalogImpl.setCommerceCatalogId(getCommerceCatalogId());
		commerceCatalogImpl.setCompanyId(getCompanyId());
		commerceCatalogImpl.setUserId(getUserId());
		commerceCatalogImpl.setUserName(getUserName());
		commerceCatalogImpl.setCreateDate(getCreateDate());
		commerceCatalogImpl.setModifiedDate(getModifiedDate());
		commerceCatalogImpl.setName(getName());
		commerceCatalogImpl.setCommerceCurrencyCode(getCommerceCurrencyCode());
		commerceCatalogImpl.setCatalogDefaultLanguageId(
			getCatalogDefaultLanguageId());
		commerceCatalogImpl.setSystem(isSystem());

		commerceCatalogImpl.resetOriginalValues();

		return commerceCatalogImpl;
	}

	@Override
	public int compareTo(CommerceCatalog commerceCatalog) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), commerceCatalog.getCreateDate());

		value = value * -1;

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

		if (!(object instanceof CommerceCatalog)) {
			return false;
		}

		CommerceCatalog commerceCatalog = (CommerceCatalog)object;

		long primaryKey = commerceCatalog.getPrimaryKey();

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
		_originalExternalReferenceCode = _externalReferenceCode;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;

		_originalSystem = _system;

		_setOriginalSystem = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<CommerceCatalog> toCacheModel() {
		CommerceCatalogCacheModel commerceCatalogCacheModel =
			new CommerceCatalogCacheModel();

		commerceCatalogCacheModel.externalReferenceCode =
			getExternalReferenceCode();

		String externalReferenceCode =
			commerceCatalogCacheModel.externalReferenceCode;

		if ((externalReferenceCode != null) &&
			(externalReferenceCode.length() == 0)) {

			commerceCatalogCacheModel.externalReferenceCode = null;
		}

		commerceCatalogCacheModel.commerceCatalogId = getCommerceCatalogId();

		commerceCatalogCacheModel.companyId = getCompanyId();

		commerceCatalogCacheModel.userId = getUserId();

		commerceCatalogCacheModel.userName = getUserName();

		String userName = commerceCatalogCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commerceCatalogCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commerceCatalogCacheModel.createDate = createDate.getTime();
		}
		else {
			commerceCatalogCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commerceCatalogCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			commerceCatalogCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		commerceCatalogCacheModel.name = getName();

		String name = commerceCatalogCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			commerceCatalogCacheModel.name = null;
		}

		commerceCatalogCacheModel.commerceCurrencyCode =
			getCommerceCurrencyCode();

		String commerceCurrencyCode =
			commerceCatalogCacheModel.commerceCurrencyCode;

		if ((commerceCurrencyCode != null) &&
			(commerceCurrencyCode.length() == 0)) {

			commerceCatalogCacheModel.commerceCurrencyCode = null;
		}

		commerceCatalogCacheModel.catalogDefaultLanguageId =
			getCatalogDefaultLanguageId();

		String catalogDefaultLanguageId =
			commerceCatalogCacheModel.catalogDefaultLanguageId;

		if ((catalogDefaultLanguageId != null) &&
			(catalogDefaultLanguageId.length() == 0)) {

			commerceCatalogCacheModel.catalogDefaultLanguageId = null;
		}

		commerceCatalogCacheModel.system = isSystem();

		return commerceCatalogCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CommerceCatalog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CommerceCatalog, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceCatalog, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CommerceCatalog)this));
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
		Map<String, Function<CommerceCatalog, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CommerceCatalog, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceCatalog, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CommerceCatalog)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CommerceCatalog>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _externalReferenceCode;
	private String _originalExternalReferenceCode;
	private long _commerceCatalogId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _commerceCurrencyCode;
	private String _catalogDefaultLanguageId;
	private boolean _system;
	private boolean _originalSystem;
	private boolean _setOriginalSystem;
	private long _columnBitmask;
	private CommerceCatalog _escapedModel;

}