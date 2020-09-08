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

package com.liferay.commerce.product.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommerceCatalog service. Represents a row in the &quot;CommerceCatalog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.product.model.impl.CommerceCatalogModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.product.model.impl.CommerceCatalogImpl</code>.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceCatalog
 * @generated
 */
@ProviderType
public interface CommerceCatalogModel
	extends AuditedModel, BaseModel<CommerceCatalog>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce catalog model instance should use the {@link CommerceCatalog} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce catalog.
	 *
	 * @return the primary key of this commerce catalog
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce catalog.
	 *
	 * @param primaryKey the primary key of this commerce catalog
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the external reference code of this commerce catalog.
	 *
	 * @return the external reference code of this commerce catalog
	 */
	@AutoEscape
	public String getExternalReferenceCode();

	/**
	 * Sets the external reference code of this commerce catalog.
	 *
	 * @param externalReferenceCode the external reference code of this commerce catalog
	 */
	public void setExternalReferenceCode(String externalReferenceCode);

	/**
	 * Returns the commerce catalog ID of this commerce catalog.
	 *
	 * @return the commerce catalog ID of this commerce catalog
	 */
	public long getCommerceCatalogId();

	/**
	 * Sets the commerce catalog ID of this commerce catalog.
	 *
	 * @param commerceCatalogId the commerce catalog ID of this commerce catalog
	 */
	public void setCommerceCatalogId(long commerceCatalogId);

	/**
	 * Returns the company ID of this commerce catalog.
	 *
	 * @return the company ID of this commerce catalog
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce catalog.
	 *
	 * @param companyId the company ID of this commerce catalog
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce catalog.
	 *
	 * @return the user ID of this commerce catalog
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce catalog.
	 *
	 * @param userId the user ID of this commerce catalog
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce catalog.
	 *
	 * @return the user uuid of this commerce catalog
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce catalog.
	 *
	 * @param userUuid the user uuid of this commerce catalog
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce catalog.
	 *
	 * @return the user name of this commerce catalog
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce catalog.
	 *
	 * @param userName the user name of this commerce catalog
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce catalog.
	 *
	 * @return the create date of this commerce catalog
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce catalog.
	 *
	 * @param createDate the create date of this commerce catalog
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce catalog.
	 *
	 * @return the modified date of this commerce catalog
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce catalog.
	 *
	 * @param modifiedDate the modified date of this commerce catalog
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this commerce catalog.
	 *
	 * @return the name of this commerce catalog
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this commerce catalog.
	 *
	 * @param name the name of this commerce catalog
	 */
	public void setName(String name);

	/**
	 * Returns the desc catalog of this commerce catalog.
	 *
	 * @return the desc catalog of this commerce catalog
	 */
	@AutoEscape
	public String getDescCatalog();

	/**
	 * Sets the desc catalog of this commerce catalog.
	 *
	 * @param descCatalog the desc catalog of this commerce catalog
	 */
	public void setDescCatalog(String descCatalog);

	/**
	 * Returns the sub catalog of this commerce catalog.
	 *
	 * @return the sub catalog of this commerce catalog
	 */
	@AutoEscape
	public String getSubCatalog();

	/**
	 * Sets the sub catalog of this commerce catalog.
	 *
	 * @param subCatalog the sub catalog of this commerce catalog
	 */
	public void setSubCatalog(String subCatalog);

	/**
	 * Returns the image catalog of this commerce catalog.
	 *
	 * @return the image catalog of this commerce catalog
	 */
	@AutoEscape
	public String getImageCatalog();

	/**
	 * Sets the image catalog of this commerce catalog.
	 *
	 * @param imageCatalog the image catalog of this commerce catalog
	 */
	public void setImageCatalog(String imageCatalog);

	/**
	 * Returns the commerce currency code of this commerce catalog.
	 *
	 * @return the commerce currency code of this commerce catalog
	 */
	@AutoEscape
	public String getCommerceCurrencyCode();

	/**
	 * Sets the commerce currency code of this commerce catalog.
	 *
	 * @param commerceCurrencyCode the commerce currency code of this commerce catalog
	 */
	public void setCommerceCurrencyCode(String commerceCurrencyCode);

	/**
	 * Returns the catalog default language ID of this commerce catalog.
	 *
	 * @return the catalog default language ID of this commerce catalog
	 */
	@AutoEscape
	public String getCatalogDefaultLanguageId();

	/**
	 * Sets the catalog default language ID of this commerce catalog.
	 *
	 * @param catalogDefaultLanguageId the catalog default language ID of this commerce catalog
	 */
	public void setCatalogDefaultLanguageId(String catalogDefaultLanguageId);

	/**
	 * Returns the system of this commerce catalog.
	 *
	 * @return the system of this commerce catalog
	 */
	public boolean getSystem();

	/**
	 * Returns <code>true</code> if this commerce catalog is system.
	 *
	 * @return <code>true</code> if this commerce catalog is system; <code>false</code> otherwise
	 */
	public boolean isSystem();

	/**
	 * Sets whether this commerce catalog is system.
	 *
	 * @param system the system of this commerce catalog
	 */
	public void setSystem(boolean system);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CommerceCatalog commerceCatalog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceCatalog> toCacheModel();

	@Override
	public CommerceCatalog toEscapedModel();

	@Override
	public CommerceCatalog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}