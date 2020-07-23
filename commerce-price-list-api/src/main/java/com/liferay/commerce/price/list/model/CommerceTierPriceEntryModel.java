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

package com.liferay.commerce.price.list.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The base model interface for the CommerceTierPriceEntry service. Represents a row in the &quot;CommerceTierPriceEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.price.list.model.impl.CommerceTierPriceEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.price.list.model.impl.CommerceTierPriceEntryImpl</code>.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceTierPriceEntry
 * @generated
 */
@ProviderType
public interface CommerceTierPriceEntryModel
	extends BaseModel<CommerceTierPriceEntry>, ShardedModel,
			StagedAuditedModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce tier price entry model instance should use the {@link CommerceTierPriceEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce tier price entry.
	 *
	 * @return the primary key of this commerce tier price entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce tier price entry.
	 *
	 * @param primaryKey the primary key of this commerce tier price entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this commerce tier price entry.
	 *
	 * @return the uuid of this commerce tier price entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this commerce tier price entry.
	 *
	 * @param uuid the uuid of this commerce tier price entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the external reference code of this commerce tier price entry.
	 *
	 * @return the external reference code of this commerce tier price entry
	 */
	@AutoEscape
	public String getExternalReferenceCode();

	/**
	 * Sets the external reference code of this commerce tier price entry.
	 *
	 * @param externalReferenceCode the external reference code of this commerce tier price entry
	 */
	public void setExternalReferenceCode(String externalReferenceCode);

	/**
	 * Returns the commerce tier price entry ID of this commerce tier price entry.
	 *
	 * @return the commerce tier price entry ID of this commerce tier price entry
	 */
	public long getCommerceTierPriceEntryId();

	/**
	 * Sets the commerce tier price entry ID of this commerce tier price entry.
	 *
	 * @param commerceTierPriceEntryId the commerce tier price entry ID of this commerce tier price entry
	 */
	public void setCommerceTierPriceEntryId(long commerceTierPriceEntryId);

	/**
	 * Returns the company ID of this commerce tier price entry.
	 *
	 * @return the company ID of this commerce tier price entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce tier price entry.
	 *
	 * @param companyId the company ID of this commerce tier price entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce tier price entry.
	 *
	 * @return the user ID of this commerce tier price entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce tier price entry.
	 *
	 * @param userId the user ID of this commerce tier price entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce tier price entry.
	 *
	 * @return the user uuid of this commerce tier price entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce tier price entry.
	 *
	 * @param userUuid the user uuid of this commerce tier price entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce tier price entry.
	 *
	 * @return the user name of this commerce tier price entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce tier price entry.
	 *
	 * @param userName the user name of this commerce tier price entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce tier price entry.
	 *
	 * @return the create date of this commerce tier price entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce tier price entry.
	 *
	 * @param createDate the create date of this commerce tier price entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce tier price entry.
	 *
	 * @return the modified date of this commerce tier price entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce tier price entry.
	 *
	 * @param modifiedDate the modified date of this commerce tier price entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the commerce price entry ID of this commerce tier price entry.
	 *
	 * @return the commerce price entry ID of this commerce tier price entry
	 */
	public long getCommercePriceEntryId();

	/**
	 * Sets the commerce price entry ID of this commerce tier price entry.
	 *
	 * @param commercePriceEntryId the commerce price entry ID of this commerce tier price entry
	 */
	public void setCommercePriceEntryId(long commercePriceEntryId);

	/**
	 * Returns the price of this commerce tier price entry.
	 *
	 * @return the price of this commerce tier price entry
	 */
	public BigDecimal getPrice();

	/**
	 * Sets the price of this commerce tier price entry.
	 *
	 * @param price the price of this commerce tier price entry
	 */
	public void setPrice(BigDecimal price);

	/**
	 * Returns the promo price of this commerce tier price entry.
	 *
	 * @return the promo price of this commerce tier price entry
	 */
	public BigDecimal getPromoPrice();

	/**
	 * Sets the promo price of this commerce tier price entry.
	 *
	 * @param promoPrice the promo price of this commerce tier price entry
	 */
	public void setPromoPrice(BigDecimal promoPrice);

	/**
	 * Returns the min quantity of this commerce tier price entry.
	 *
	 * @return the min quantity of this commerce tier price entry
	 */
	public int getMinQuantity();

	/**
	 * Sets the min quantity of this commerce tier price entry.
	 *
	 * @param minQuantity the min quantity of this commerce tier price entry
	 */
	public void setMinQuantity(int minQuantity);

	/**
	 * Returns the last publish date of this commerce tier price entry.
	 *
	 * @return the last publish date of this commerce tier price entry
	 */
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this commerce tier price entry.
	 *
	 * @param lastPublishDate the last publish date of this commerce tier price entry
	 */
	public void setLastPublishDate(Date lastPublishDate);

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
	public int compareTo(CommerceTierPriceEntry commerceTierPriceEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceTierPriceEntry> toCacheModel();

	@Override
	public CommerceTierPriceEntry toEscapedModel();

	@Override
	public CommerceTierPriceEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}