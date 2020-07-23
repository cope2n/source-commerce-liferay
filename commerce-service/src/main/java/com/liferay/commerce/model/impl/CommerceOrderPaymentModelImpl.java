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

package com.liferay.commerce.model.impl;

import com.liferay.commerce.model.CommerceOrderPayment;
import com.liferay.commerce.model.CommerceOrderPaymentModel;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
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

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CommerceOrderPayment service. Represents a row in the &quot;CommerceOrderPayment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CommerceOrderPaymentModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceOrderPaymentImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceOrderPaymentImpl
 * @generated
 */
public class CommerceOrderPaymentModelImpl
	extends BaseModelImpl<CommerceOrderPayment>
	implements CommerceOrderPaymentModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce order payment model instance should use the <code>CommerceOrderPayment</code> interface instead.
	 */
	public static final String TABLE_NAME = "CommerceOrderPayment";

	public static final Object[][] TABLE_COLUMNS = {
		{"commerceOrderPaymentId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"commerceOrderId", Types.BIGINT},
		{"commercePaymentMethodKey", Types.VARCHAR}, {"content", Types.CLOB},
		{"status", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("commerceOrderPaymentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("commerceOrderId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("commercePaymentMethodKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("content", Types.CLOB);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CommerceOrderPayment (commerceOrderPaymentId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,commerceOrderId LONG,commercePaymentMethodKey VARCHAR(75) null,content TEXT null,status INTEGER)";

	public static final String TABLE_SQL_DROP =
		"drop table CommerceOrderPayment";

	public static final String ORDER_BY_JPQL =
		" ORDER BY commerceOrderPayment.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CommerceOrderPayment.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.model.CommerceOrderPayment"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.model.CommerceOrderPayment"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.model.CommerceOrderPayment"),
		true);

	public static final long COMMERCEORDERID_COLUMN_BITMASK = 1L;

	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.model.CommerceOrderPayment"));

	public CommerceOrderPaymentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commerceOrderPaymentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommerceOrderPaymentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceOrderPaymentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceOrderPayment.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceOrderPayment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CommerceOrderPayment, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CommerceOrderPayment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceOrderPayment, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CommerceOrderPayment)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CommerceOrderPayment, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CommerceOrderPayment, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CommerceOrderPayment)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CommerceOrderPayment, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CommerceOrderPayment, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CommerceOrderPayment>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CommerceOrderPayment.class.getClassLoader(),
			CommerceOrderPayment.class, ModelWrapper.class);

		try {
			Constructor<CommerceOrderPayment> constructor =
				(Constructor<CommerceOrderPayment>)proxyClass.getConstructor(
					InvocationHandler.class);

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

	private static final Map<String, Function<CommerceOrderPayment, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CommerceOrderPayment, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CommerceOrderPayment, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<CommerceOrderPayment, Object>>();
		Map<String, BiConsumer<CommerceOrderPayment, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<CommerceOrderPayment, ?>>();

		attributeGetterFunctions.put(
			"commerceOrderPaymentId",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getCommerceOrderPaymentId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceOrderPaymentId",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object commerceOrderPaymentIdObject) {

					commerceOrderPayment.setCommerceOrderPaymentId(
						(Long)commerceOrderPaymentIdObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object groupIdObject) {

					commerceOrderPayment.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object companyIdObject) {

					commerceOrderPayment.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object userIdObject) {

					commerceOrderPayment.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object userNameObject) {

					commerceOrderPayment.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object createDateObject) {

					commerceOrderPayment.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object modifiedDateObject) {

					commerceOrderPayment.setModifiedDate(
						(Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"commerceOrderId",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getCommerceOrderId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceOrderId",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object commerceOrderIdObject) {

					commerceOrderPayment.setCommerceOrderId(
						(Long)commerceOrderIdObject);
				}

			});
		attributeGetterFunctions.put(
			"commercePaymentMethodKey",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getCommercePaymentMethodKey();
				}

			});
		attributeSetterBiConsumers.put(
			"commercePaymentMethodKey",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object commercePaymentMethodKeyObject) {

					commerceOrderPayment.setCommercePaymentMethodKey(
						(String)commercePaymentMethodKeyObject);
				}

			});
		attributeGetterFunctions.put(
			"content",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getContent();
				}

			});
		attributeSetterBiConsumers.put(
			"content",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object contentObject) {

					commerceOrderPayment.setContent((String)contentObject);
				}

			});
		attributeGetterFunctions.put(
			"status",
			new Function<CommerceOrderPayment, Object>() {

				@Override
				public Object apply(CommerceOrderPayment commerceOrderPayment) {
					return commerceOrderPayment.getStatus();
				}

			});
		attributeSetterBiConsumers.put(
			"status",
			new BiConsumer<CommerceOrderPayment, Object>() {

				@Override
				public void accept(
					CommerceOrderPayment commerceOrderPayment,
					Object statusObject) {

					commerceOrderPayment.setStatus((Integer)statusObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getCommerceOrderPaymentId() {
		return _commerceOrderPaymentId;
	}

	@Override
	public void setCommerceOrderPaymentId(long commerceOrderPaymentId) {
		_commerceOrderPaymentId = commerceOrderPaymentId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

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

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

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

	@Override
	public long getCommerceOrderId() {
		return _commerceOrderId;
	}

	@Override
	public void setCommerceOrderId(long commerceOrderId) {
		_columnBitmask |= COMMERCEORDERID_COLUMN_BITMASK;

		if (!_setOriginalCommerceOrderId) {
			_setOriginalCommerceOrderId = true;

			_originalCommerceOrderId = _commerceOrderId;
		}

		_commerceOrderId = commerceOrderId;
	}

	public long getOriginalCommerceOrderId() {
		return _originalCommerceOrderId;
	}

	@Override
	public String getCommercePaymentMethodKey() {
		if (_commercePaymentMethodKey == null) {
			return "";
		}
		else {
			return _commercePaymentMethodKey;
		}
	}

	@Override
	public void setCommercePaymentMethodKey(String commercePaymentMethodKey) {
		_commercePaymentMethodKey = commercePaymentMethodKey;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CommerceOrderPayment.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommerceOrderPayment toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CommerceOrderPayment>
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
		CommerceOrderPaymentImpl commerceOrderPaymentImpl =
			new CommerceOrderPaymentImpl();

		commerceOrderPaymentImpl.setCommerceOrderPaymentId(
			getCommerceOrderPaymentId());
		commerceOrderPaymentImpl.setGroupId(getGroupId());
		commerceOrderPaymentImpl.setCompanyId(getCompanyId());
		commerceOrderPaymentImpl.setUserId(getUserId());
		commerceOrderPaymentImpl.setUserName(getUserName());
		commerceOrderPaymentImpl.setCreateDate(getCreateDate());
		commerceOrderPaymentImpl.setModifiedDate(getModifiedDate());
		commerceOrderPaymentImpl.setCommerceOrderId(getCommerceOrderId());
		commerceOrderPaymentImpl.setCommercePaymentMethodKey(
			getCommercePaymentMethodKey());
		commerceOrderPaymentImpl.setContent(getContent());
		commerceOrderPaymentImpl.setStatus(getStatus());

		commerceOrderPaymentImpl.resetOriginalValues();

		return commerceOrderPaymentImpl;
	}

	@Override
	public int compareTo(CommerceOrderPayment commerceOrderPayment) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), commerceOrderPayment.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof CommerceOrderPayment)) {
			return false;
		}

		CommerceOrderPayment commerceOrderPayment = (CommerceOrderPayment)obj;

		long primaryKey = commerceOrderPayment.getPrimaryKey();

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
		CommerceOrderPaymentModelImpl commerceOrderPaymentModelImpl = this;

		commerceOrderPaymentModelImpl._setModifiedDate = false;

		commerceOrderPaymentModelImpl._originalCommerceOrderId =
			commerceOrderPaymentModelImpl._commerceOrderId;

		commerceOrderPaymentModelImpl._setOriginalCommerceOrderId = false;

		commerceOrderPaymentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CommerceOrderPayment> toCacheModel() {
		CommerceOrderPaymentCacheModel commerceOrderPaymentCacheModel =
			new CommerceOrderPaymentCacheModel();

		commerceOrderPaymentCacheModel.commerceOrderPaymentId =
			getCommerceOrderPaymentId();

		commerceOrderPaymentCacheModel.groupId = getGroupId();

		commerceOrderPaymentCacheModel.companyId = getCompanyId();

		commerceOrderPaymentCacheModel.userId = getUserId();

		commerceOrderPaymentCacheModel.userName = getUserName();

		String userName = commerceOrderPaymentCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commerceOrderPaymentCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commerceOrderPaymentCacheModel.createDate = createDate.getTime();
		}
		else {
			commerceOrderPaymentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commerceOrderPaymentCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			commerceOrderPaymentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		commerceOrderPaymentCacheModel.commerceOrderId = getCommerceOrderId();

		commerceOrderPaymentCacheModel.commercePaymentMethodKey =
			getCommercePaymentMethodKey();

		String commercePaymentMethodKey =
			commerceOrderPaymentCacheModel.commercePaymentMethodKey;

		if ((commercePaymentMethodKey != null) &&
			(commercePaymentMethodKey.length() == 0)) {

			commerceOrderPaymentCacheModel.commercePaymentMethodKey = null;
		}

		commerceOrderPaymentCacheModel.content = getContent();

		String content = commerceOrderPaymentCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			commerceOrderPaymentCacheModel.content = null;
		}

		commerceOrderPaymentCacheModel.status = getStatus();

		return commerceOrderPaymentCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CommerceOrderPayment, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CommerceOrderPayment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceOrderPayment, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply((CommerceOrderPayment)this));
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
		Map<String, Function<CommerceOrderPayment, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CommerceOrderPayment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceOrderPayment, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((CommerceOrderPayment)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CommerceOrderPayment>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private long _commerceOrderPaymentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _commerceOrderId;
	private long _originalCommerceOrderId;
	private boolean _setOriginalCommerceOrderId;
	private String _commercePaymentMethodKey;
	private String _content;
	private int _status;
	private long _columnBitmask;
	private CommerceOrderPayment _escapedModel;

}