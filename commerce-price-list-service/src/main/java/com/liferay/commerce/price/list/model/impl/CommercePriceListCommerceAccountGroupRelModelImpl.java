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

package com.liferay.commerce.price.list.model.impl;

import com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel;
import com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRelModel;
import com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRelSoap;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
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
 * The base model implementation for the CommercePriceListCommerceAccountGroupRel service. Represents a row in the &quot;CPLCommerceGroupAccountRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CommercePriceListCommerceAccountGroupRelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommercePriceListCommerceAccountGroupRelImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommercePriceListCommerceAccountGroupRelImpl
 * @generated
 */
@JSON(strict = true)
public class CommercePriceListCommerceAccountGroupRelModelImpl
	extends BaseModelImpl<CommercePriceListCommerceAccountGroupRel>
	implements CommercePriceListCommerceAccountGroupRelModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce price list commerce account group rel model instance should use the <code>CommercePriceListCommerceAccountGroupRel</code> interface instead.
	 */
	public static final String TABLE_NAME = "CPLCommerceGroupAccountRel";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR},
		{"CPLCommerceAccountGroupRelId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"commercePriceListId", Types.BIGINT},
		{"commerceAccountGroupId", Types.BIGINT}, {"order_", Types.INTEGER},
		{"lastPublishDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("CPLCommerceAccountGroupRelId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("commercePriceListId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("commerceAccountGroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("order_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("lastPublishDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CPLCommerceGroupAccountRel (uuid_ VARCHAR(75) null,CPLCommerceAccountGroupRelId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,commercePriceListId LONG,commerceAccountGroupId LONG,order_ INTEGER,lastPublishDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table CPLCommerceGroupAccountRel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY commercePriceListCommerceAccountGroupRel.order ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CPLCommerceGroupAccountRel.order_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.price.list.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.price.list.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.price.list.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel"),
		true);

	public static final long COMMERCEACCOUNTGROUPID_COLUMN_BITMASK = 1L;

	public static final long COMMERCEPRICELISTID_COLUMN_BITMASK = 2L;

	public static final long COMPANYID_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long ORDER_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CommercePriceListCommerceAccountGroupRel toModel(
		CommercePriceListCommerceAccountGroupRelSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		CommercePriceListCommerceAccountGroupRel model =
			new CommercePriceListCommerceAccountGroupRelImpl();

		model.setUuid(soapModel.getUuid());
		model.setCommercePriceListCommerceAccountGroupRelId(
			soapModel.getCommercePriceListCommerceAccountGroupRelId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCommercePriceListId(soapModel.getCommercePriceListId());
		model.setCommerceAccountGroupId(soapModel.getCommerceAccountGroupId());
		model.setOrder(soapModel.getOrder());
		model.setLastPublishDate(soapModel.getLastPublishDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CommercePriceListCommerceAccountGroupRel> toModels(
		CommercePriceListCommerceAccountGroupRelSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<CommercePriceListCommerceAccountGroupRel> models =
			new ArrayList<CommercePriceListCommerceAccountGroupRel>(
				soapModels.length);

		for (CommercePriceListCommerceAccountGroupRelSoap soapModel :
				soapModels) {

			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.price.list.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel"));

	public CommercePriceListCommerceAccountGroupRelModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commercePriceListCommerceAccountGroupRelId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommercePriceListCommerceAccountGroupRelId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commercePriceListCommerceAccountGroupRelId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommercePriceListCommerceAccountGroupRel.class;
	}

	@Override
	public String getModelClassName() {
		return CommercePriceListCommerceAccountGroupRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String,
				 Function<CommercePriceListCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommercePriceListCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(CommercePriceListCommerceAccountGroupRel)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map
			<String,
			 BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>>
				attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CommercePriceListCommerceAccountGroupRel)this,
					entry.getValue());
			}
		}
	}

	public Map
		<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map
		<String, BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>>
			getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function
		<InvocationHandler, CommercePriceListCommerceAccountGroupRel>
			_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CommercePriceListCommerceAccountGroupRel.class.getClassLoader(),
			CommercePriceListCommerceAccountGroupRel.class, ModelWrapper.class);

		try {
			Constructor<CommercePriceListCommerceAccountGroupRel> constructor =
				(Constructor<CommercePriceListCommerceAccountGroupRel>)
					proxyClass.getConstructor(InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map
		<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String,
					 Function
						 <CommercePriceListCommerceAccountGroupRel, Object>>();
		Map<String, BiConsumer<CommercePriceListCommerceAccountGroupRel, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String,
					 BiConsumer<CommercePriceListCommerceAccountGroupRel, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object uuid) {

					commercePriceListCommerceAccountGroupRel.setUuid(
						(String)uuid);
				}

			});
		attributeGetterFunctions.put(
			"commercePriceListCommerceAccountGroupRelId",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getCommercePriceListCommerceAccountGroupRelId();
				}

			});
		attributeSetterBiConsumers.put(
			"commercePriceListCommerceAccountGroupRelId",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object commercePriceListCommerceAccountGroupRelId) {

					commercePriceListCommerceAccountGroupRel.
						setCommercePriceListCommerceAccountGroupRelId(
							(Long)commercePriceListCommerceAccountGroupRelId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object companyId) {

					commercePriceListCommerceAccountGroupRel.setCompanyId(
						(Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object userId) {

					commercePriceListCommerceAccountGroupRel.setUserId(
						(Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object userName) {

					commercePriceListCommerceAccountGroupRel.setUserName(
						(String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object createDate) {

					commercePriceListCommerceAccountGroupRel.setCreateDate(
						(Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object modifiedDate) {

					commercePriceListCommerceAccountGroupRel.setModifiedDate(
						(Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"commercePriceListId",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getCommercePriceListId();
				}

			});
		attributeSetterBiConsumers.put(
			"commercePriceListId",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object commercePriceListId) {

					commercePriceListCommerceAccountGroupRel.
						setCommercePriceListId((Long)commercePriceListId);
				}

			});
		attributeGetterFunctions.put(
			"commerceAccountGroupId",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getCommerceAccountGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceAccountGroupId",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object commerceAccountGroupId) {

					commercePriceListCommerceAccountGroupRel.
						setCommerceAccountGroupId((Long)commerceAccountGroupId);
				}

			});
		attributeGetterFunctions.put(
			"order",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.getOrder();
				}

			});
		attributeSetterBiConsumers.put(
			"order",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object order) {

					commercePriceListCommerceAccountGroupRel.setOrder(
						(Integer)order);
				}

			});
		attributeGetterFunctions.put(
			"lastPublishDate",
			new Function<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel) {

					return commercePriceListCommerceAccountGroupRel.
						getLastPublishDate();
				}

			});
		attributeSetterBiConsumers.put(
			"lastPublishDate",
			new BiConsumer<CommercePriceListCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommercePriceListCommerceAccountGroupRel
						commercePriceListCommerceAccountGroupRel,
					Object lastPublishDate) {

					commercePriceListCommerceAccountGroupRel.setLastPublishDate(
						(Date)lastPublishDate);
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
	public long getCommercePriceListCommerceAccountGroupRelId() {
		return _commercePriceListCommerceAccountGroupRelId;
	}

	@Override
	public void setCommercePriceListCommerceAccountGroupRelId(
		long commercePriceListCommerceAccountGroupRelId) {

		_commercePriceListCommerceAccountGroupRelId =
			commercePriceListCommerceAccountGroupRelId;
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
		catch (PortalException pe) {
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
	public long getCommercePriceListId() {
		return _commercePriceListId;
	}

	@Override
	public void setCommercePriceListId(long commercePriceListId) {
		_columnBitmask |= COMMERCEPRICELISTID_COLUMN_BITMASK;

		if (!_setOriginalCommercePriceListId) {
			_setOriginalCommercePriceListId = true;

			_originalCommercePriceListId = _commercePriceListId;
		}

		_commercePriceListId = commercePriceListId;
	}

	public long getOriginalCommercePriceListId() {
		return _originalCommercePriceListId;
	}

	@JSON
	@Override
	public long getCommerceAccountGroupId() {
		return _commerceAccountGroupId;
	}

	@Override
	public void setCommerceAccountGroupId(long commerceAccountGroupId) {
		_columnBitmask |= COMMERCEACCOUNTGROUPID_COLUMN_BITMASK;

		if (!_setOriginalCommerceAccountGroupId) {
			_setOriginalCommerceAccountGroupId = true;

			_originalCommerceAccountGroupId = _commerceAccountGroupId;
		}

		_commerceAccountGroupId = commerceAccountGroupId;
	}

	public long getOriginalCommerceAccountGroupId() {
		return _originalCommerceAccountGroupId;
	}

	@JSON
	@Override
	public int getOrder() {
		return _order;
	}

	@Override
	public void setOrder(int order) {
		_columnBitmask = -1L;

		_order = order;
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
			PortalUtil.getClassNameId(
				CommercePriceListCommerceAccountGroupRel.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(),
			CommercePriceListCommerceAccountGroupRel.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommercePriceListCommerceAccountGroupRel toEscapedModel() {
		if (_escapedModel == null) {
			Function
				<InvocationHandler, CommercePriceListCommerceAccountGroupRel>
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
		CommercePriceListCommerceAccountGroupRelImpl
			commercePriceListCommerceAccountGroupRelImpl =
				new CommercePriceListCommerceAccountGroupRelImpl();

		commercePriceListCommerceAccountGroupRelImpl.setUuid(getUuid());
		commercePriceListCommerceAccountGroupRelImpl.
			setCommercePriceListCommerceAccountGroupRelId(
				getCommercePriceListCommerceAccountGroupRelId());
		commercePriceListCommerceAccountGroupRelImpl.setCompanyId(
			getCompanyId());
		commercePriceListCommerceAccountGroupRelImpl.setUserId(getUserId());
		commercePriceListCommerceAccountGroupRelImpl.setUserName(getUserName());
		commercePriceListCommerceAccountGroupRelImpl.setCreateDate(
			getCreateDate());
		commercePriceListCommerceAccountGroupRelImpl.setModifiedDate(
			getModifiedDate());
		commercePriceListCommerceAccountGroupRelImpl.setCommercePriceListId(
			getCommercePriceListId());
		commercePriceListCommerceAccountGroupRelImpl.setCommerceAccountGroupId(
			getCommerceAccountGroupId());
		commercePriceListCommerceAccountGroupRelImpl.setOrder(getOrder());
		commercePriceListCommerceAccountGroupRelImpl.setLastPublishDate(
			getLastPublishDate());

		commercePriceListCommerceAccountGroupRelImpl.resetOriginalValues();

		return commercePriceListCommerceAccountGroupRelImpl;
	}

	@Override
	public int compareTo(
		CommercePriceListCommerceAccountGroupRel
			commercePriceListCommerceAccountGroupRel) {

		int value = 0;

		if (getOrder() < commercePriceListCommerceAccountGroupRel.getOrder()) {
			value = -1;
		}
		else if (getOrder() >
					commercePriceListCommerceAccountGroupRel.getOrder()) {

			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommercePriceListCommerceAccountGroupRel)) {
			return false;
		}

		CommercePriceListCommerceAccountGroupRel
			commercePriceListCommerceAccountGroupRel =
				(CommercePriceListCommerceAccountGroupRel)obj;

		long primaryKey =
			commercePriceListCommerceAccountGroupRel.getPrimaryKey();

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
		CommercePriceListCommerceAccountGroupRelModelImpl
			commercePriceListCommerceAccountGroupRelModelImpl = this;

		commercePriceListCommerceAccountGroupRelModelImpl._originalUuid =
			commercePriceListCommerceAccountGroupRelModelImpl._uuid;

		commercePriceListCommerceAccountGroupRelModelImpl._originalCompanyId =
			commercePriceListCommerceAccountGroupRelModelImpl._companyId;

		commercePriceListCommerceAccountGroupRelModelImpl.
			_setOriginalCompanyId = false;

		commercePriceListCommerceAccountGroupRelModelImpl._setModifiedDate =
			false;

		commercePriceListCommerceAccountGroupRelModelImpl.
			_originalCommercePriceListId =
				commercePriceListCommerceAccountGroupRelModelImpl.
					_commercePriceListId;

		commercePriceListCommerceAccountGroupRelModelImpl.
			_setOriginalCommercePriceListId = false;

		commercePriceListCommerceAccountGroupRelModelImpl.
			_originalCommerceAccountGroupId =
				commercePriceListCommerceAccountGroupRelModelImpl.
					_commerceAccountGroupId;

		commercePriceListCommerceAccountGroupRelModelImpl.
			_setOriginalCommerceAccountGroupId = false;

		commercePriceListCommerceAccountGroupRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CommercePriceListCommerceAccountGroupRel> toCacheModel() {
		CommercePriceListCommerceAccountGroupRelCacheModel
			commercePriceListCommerceAccountGroupRelCacheModel =
				new CommercePriceListCommerceAccountGroupRelCacheModel();

		commercePriceListCommerceAccountGroupRelCacheModel.uuid = getUuid();

		String uuid = commercePriceListCommerceAccountGroupRelCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			commercePriceListCommerceAccountGroupRelCacheModel.uuid = null;
		}

		commercePriceListCommerceAccountGroupRelCacheModel.
			commercePriceListCommerceAccountGroupRelId =
				getCommercePriceListCommerceAccountGroupRelId();

		commercePriceListCommerceAccountGroupRelCacheModel.companyId =
			getCompanyId();

		commercePriceListCommerceAccountGroupRelCacheModel.userId = getUserId();

		commercePriceListCommerceAccountGroupRelCacheModel.userName =
			getUserName();

		String userName =
			commercePriceListCommerceAccountGroupRelCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commercePriceListCommerceAccountGroupRelCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commercePriceListCommerceAccountGroupRelCacheModel.createDate =
				createDate.getTime();
		}
		else {
			commercePriceListCommerceAccountGroupRelCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commercePriceListCommerceAccountGroupRelCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			commercePriceListCommerceAccountGroupRelCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		commercePriceListCommerceAccountGroupRelCacheModel.commercePriceListId =
			getCommercePriceListId();

		commercePriceListCommerceAccountGroupRelCacheModel.
			commerceAccountGroupId = getCommerceAccountGroupId();

		commercePriceListCommerceAccountGroupRelCacheModel.order = getOrder();

		Date lastPublishDate = getLastPublishDate();

		if (lastPublishDate != null) {
			commercePriceListCommerceAccountGroupRelCacheModel.lastPublishDate =
				lastPublishDate.getTime();
		}
		else {
			commercePriceListCommerceAccountGroupRelCacheModel.lastPublishDate =
				Long.MIN_VALUE;
		}

		return commercePriceListCommerceAccountGroupRelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry
				<String,
				 Function<CommercePriceListCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommercePriceListCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply(
					(CommercePriceListCommerceAccountGroupRel)this));
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
		Map<String, Function<CommercePriceListCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry
				<String,
				 Function<CommercePriceListCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommercePriceListCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply(
					(CommercePriceListCommerceAccountGroupRel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, CommercePriceListCommerceAccountGroupRel>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _commercePriceListCommerceAccountGroupRelId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _commercePriceListId;
	private long _originalCommercePriceListId;
	private boolean _setOriginalCommercePriceListId;
	private long _commerceAccountGroupId;
	private long _originalCommerceAccountGroupId;
	private boolean _setOriginalCommerceAccountGroupId;
	private int _order;
	private Date _lastPublishDate;
	private long _columnBitmask;
	private CommercePriceListCommerceAccountGroupRel _escapedModel;

}