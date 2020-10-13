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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CommerceCatalogLocalization}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceCatalogLocalization
 * @generated
 */
public class CommerceCatalogLocalizationWrapper
	implements CommerceCatalogLocalization,
			   ModelWrapper<CommerceCatalogLocalization> {

	public CommerceCatalogLocalizationWrapper(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		_commerceCatalogLocalization = commerceCatalogLocalization;
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceCatalogLocalization.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceCatalogLocalization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put(
			"commerceCatalogLocalizationId",
			getCommerceCatalogLocalizationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("commerceCatalogId", getCommerceCatalogId());
		attributes.put("languageId", getLanguageId());
		attributes.put("descCatalog", getDescCatalog());
		attributes.put("subCatalog", getSubCatalog());
		attributes.put("imageCatalog", getImageCatalog());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long commerceCatalogLocalizationId = (Long)attributes.get(
			"commerceCatalogLocalizationId");

		if (commerceCatalogLocalizationId != null) {
			setCommerceCatalogLocalizationId(commerceCatalogLocalizationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long commerceCatalogId = (Long)attributes.get("commerceCatalogId");

		if (commerceCatalogId != null) {
			setCommerceCatalogId(commerceCatalogId);
		}

		String languageId = (String)attributes.get("languageId");

		if (languageId != null) {
			setLanguageId(languageId);
		}

		String descCatalog = (String)attributes.get("descCatalog");

		if (descCatalog != null) {
			setDescCatalog(descCatalog);
		}

		String subCatalog = (String)attributes.get("subCatalog");

		if (subCatalog != null) {
			setSubCatalog(subCatalog);
		}

		String imageCatalog = (String)attributes.get("imageCatalog");

		if (imageCatalog != null) {
			setImageCatalog(imageCatalog);
		}
	}

	@Override
	public Object clone() {
		return new CommerceCatalogLocalizationWrapper(
			(CommerceCatalogLocalization)_commerceCatalogLocalization.clone());
	}

	@Override
	public int compareTo(
		CommerceCatalogLocalization commerceCatalogLocalization) {

		return _commerceCatalogLocalization.compareTo(
			commerceCatalogLocalization);
	}

	/**
	 * Returns the commerce catalog ID of this commerce catalog localization.
	 *
	 * @return the commerce catalog ID of this commerce catalog localization
	 */
	@Override
	public long getCommerceCatalogId() {
		return _commerceCatalogLocalization.getCommerceCatalogId();
	}

	/**
	 * Returns the commerce catalog localization ID of this commerce catalog localization.
	 *
	 * @return the commerce catalog localization ID of this commerce catalog localization
	 */
	@Override
	public long getCommerceCatalogLocalizationId() {
		return _commerceCatalogLocalization.getCommerceCatalogLocalizationId();
	}

	/**
	 * Returns the company ID of this commerce catalog localization.
	 *
	 * @return the company ID of this commerce catalog localization
	 */
	@Override
	public long getCompanyId() {
		return _commerceCatalogLocalization.getCompanyId();
	}

	/**
	 * Returns the desc catalog of this commerce catalog localization.
	 *
	 * @return the desc catalog of this commerce catalog localization
	 */
	@Override
	public String getDescCatalog() {
		return _commerceCatalogLocalization.getDescCatalog();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _commerceCatalogLocalization.getExpandoBridge();
	}

	/**
	 * Returns the image catalog of this commerce catalog localization.
	 *
	 * @return the image catalog of this commerce catalog localization
	 */
	@Override
	public String getImageCatalog() {
		return _commerceCatalogLocalization.getImageCatalog();
	}

	/**
	 * Returns the language ID of this commerce catalog localization.
	 *
	 * @return the language ID of this commerce catalog localization
	 */
	@Override
	public String getLanguageId() {
		return _commerceCatalogLocalization.getLanguageId();
	}

	/**
	 * Returns the mvcc version of this commerce catalog localization.
	 *
	 * @return the mvcc version of this commerce catalog localization
	 */
	@Override
	public long getMvccVersion() {
		return _commerceCatalogLocalization.getMvccVersion();
	}

	/**
	 * Returns the primary key of this commerce catalog localization.
	 *
	 * @return the primary key of this commerce catalog localization
	 */
	@Override
	public long getPrimaryKey() {
		return _commerceCatalogLocalization.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceCatalogLocalization.getPrimaryKeyObj();
	}

	/**
	 * Returns the sub catalog of this commerce catalog localization.
	 *
	 * @return the sub catalog of this commerce catalog localization
	 */
	@Override
	public String getSubCatalog() {
		return _commerceCatalogLocalization.getSubCatalog();
	}

	@Override
	public int hashCode() {
		return _commerceCatalogLocalization.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _commerceCatalogLocalization.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _commerceCatalogLocalization.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _commerceCatalogLocalization.isNew();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_commerceCatalogLocalization.setCachedModel(cachedModel);
	}

	/**
	 * Sets the commerce catalog ID of this commerce catalog localization.
	 *
	 * @param commerceCatalogId the commerce catalog ID of this commerce catalog localization
	 */
	@Override
	public void setCommerceCatalogId(long commerceCatalogId) {
		_commerceCatalogLocalization.setCommerceCatalogId(commerceCatalogId);
	}

	/**
	 * Sets the commerce catalog localization ID of this commerce catalog localization.
	 *
	 * @param commerceCatalogLocalizationId the commerce catalog localization ID of this commerce catalog localization
	 */
	@Override
	public void setCommerceCatalogLocalizationId(
		long commerceCatalogLocalizationId) {

		_commerceCatalogLocalization.setCommerceCatalogLocalizationId(
			commerceCatalogLocalizationId);
	}

	/**
	 * Sets the company ID of this commerce catalog localization.
	 *
	 * @param companyId the company ID of this commerce catalog localization
	 */
	@Override
	public void setCompanyId(long companyId) {
		_commerceCatalogLocalization.setCompanyId(companyId);
	}

	/**
	 * Sets the desc catalog of this commerce catalog localization.
	 *
	 * @param descCatalog the desc catalog of this commerce catalog localization
	 */
	@Override
	public void setDescCatalog(String descCatalog) {
		_commerceCatalogLocalization.setDescCatalog(descCatalog);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_commerceCatalogLocalization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_commerceCatalogLocalization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_commerceCatalogLocalization.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the image catalog of this commerce catalog localization.
	 *
	 * @param imageCatalog the image catalog of this commerce catalog localization
	 */
	@Override
	public void setImageCatalog(String imageCatalog) {
		_commerceCatalogLocalization.setImageCatalog(imageCatalog);
	}

	/**
	 * Sets the language ID of this commerce catalog localization.
	 *
	 * @param languageId the language ID of this commerce catalog localization
	 */
	@Override
	public void setLanguageId(String languageId) {
		_commerceCatalogLocalization.setLanguageId(languageId);
	}

	/**
	 * Sets the mvcc version of this commerce catalog localization.
	 *
	 * @param mvccVersion the mvcc version of this commerce catalog localization
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		_commerceCatalogLocalization.setMvccVersion(mvccVersion);
	}

	@Override
	public void setNew(boolean n) {
		_commerceCatalogLocalization.setNew(n);
	}

	/**
	 * Sets the primary key of this commerce catalog localization.
	 *
	 * @param primaryKey the primary key of this commerce catalog localization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_commerceCatalogLocalization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_commerceCatalogLocalization.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the sub catalog of this commerce catalog localization.
	 *
	 * @param subCatalog the sub catalog of this commerce catalog localization
	 */
	@Override
	public void setSubCatalog(String subCatalog) {
		_commerceCatalogLocalization.setSubCatalog(subCatalog);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<CommerceCatalogLocalization> toCacheModel() {

		return _commerceCatalogLocalization.toCacheModel();
	}

	@Override
	public CommerceCatalogLocalization toEscapedModel() {
		return new CommerceCatalogLocalizationWrapper(
			_commerceCatalogLocalization.toEscapedModel());
	}

	@Override
	public String toString() {
		return _commerceCatalogLocalization.toString();
	}

	@Override
	public CommerceCatalogLocalization toUnescapedModel() {
		return new CommerceCatalogLocalizationWrapper(
			_commerceCatalogLocalization.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _commerceCatalogLocalization.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CommerceCatalogLocalizationWrapper)) {
			return false;
		}

		CommerceCatalogLocalizationWrapper commerceCatalogLocalizationWrapper =
			(CommerceCatalogLocalizationWrapper)object;

		if (Objects.equals(
				_commerceCatalogLocalization,
				commerceCatalogLocalizationWrapper.
					_commerceCatalogLocalization)) {

			return true;
		}

		return false;
	}

	@Override
	public CommerceCatalogLocalization getWrappedModel() {
		return _commerceCatalogLocalization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _commerceCatalogLocalization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _commerceCatalogLocalization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_commerceCatalogLocalization.resetOriginalValues();
	}

	private final CommerceCatalogLocalization _commerceCatalogLocalization;

}