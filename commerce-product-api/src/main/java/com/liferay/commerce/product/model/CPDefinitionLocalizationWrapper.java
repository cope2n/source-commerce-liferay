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
 * This class is a wrapper for {@link CPDefinitionLocalization}.
 * </p>
 *
 * @author Marco Leo
 * @see CPDefinitionLocalization
 * @generated
 */
public class CPDefinitionLocalizationWrapper
	implements CPDefinitionLocalization,
			   ModelWrapper<CPDefinitionLocalization> {

	public CPDefinitionLocalizationWrapper(
		CPDefinitionLocalization cpDefinitionLocalization) {

		_cpDefinitionLocalization = cpDefinitionLocalization;
	}

	@Override
	public Class<?> getModelClass() {
		return CPDefinitionLocalization.class;
	}

	@Override
	public String getModelClassName() {
		return CPDefinitionLocalization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put(
			"cpDefinitionLocalizationId", getCpDefinitionLocalizationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("CPDefinitionId", getCPDefinitionId());
		attributes.put("languageId", getLanguageId());
		attributes.put("name", getName());
		attributes.put("shortDescription", getShortDescription());
		attributes.put("description", getDescription());
		attributes.put("metaTitle", getMetaTitle());
		attributes.put("metaDescription", getMetaDescription());
		attributes.put("metaKeywords", getMetaKeywords());
		attributes.put("overview", getOverview());
		attributes.put("introduction", getIntroduction());
		attributes.put("features", getFeatures());
		attributes.put("solutions", getSolutions());
		attributes.put("customerStory", getCustomerStory());
		attributes.put("benefits", getBenefits());
		attributes.put("functions", getFunctions());
		attributes.put("partners", getPartners());
		attributes.put("relatedPlatforms", getRelatedPlatforms());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long cpDefinitionLocalizationId = (Long)attributes.get(
			"cpDefinitionLocalizationId");

		if (cpDefinitionLocalizationId != null) {
			setCpDefinitionLocalizationId(cpDefinitionLocalizationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long CPDefinitionId = (Long)attributes.get("CPDefinitionId");

		if (CPDefinitionId != null) {
			setCPDefinitionId(CPDefinitionId);
		}

		String languageId = (String)attributes.get("languageId");

		if (languageId != null) {
			setLanguageId(languageId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String shortDescription = (String)attributes.get("shortDescription");

		if (shortDescription != null) {
			setShortDescription(shortDescription);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String metaTitle = (String)attributes.get("metaTitle");

		if (metaTitle != null) {
			setMetaTitle(metaTitle);
		}

		String metaDescription = (String)attributes.get("metaDescription");

		if (metaDescription != null) {
			setMetaDescription(metaDescription);
		}

		String metaKeywords = (String)attributes.get("metaKeywords");

		if (metaKeywords != null) {
			setMetaKeywords(metaKeywords);
		}

		String overview = (String)attributes.get("overview");

		if (overview != null) {
			setOverview(overview);
		}

		String introduction = (String)attributes.get("introduction");

		if (introduction != null) {
			setIntroduction(introduction);
		}

		String features = (String)attributes.get("features");

		if (features != null) {
			setFeatures(features);
		}

		String solutions = (String)attributes.get("solutions");

		if (solutions != null) {
			setSolutions(solutions);
		}

		String customerStory = (String)attributes.get("customerStory");

		if (customerStory != null) {
			setCustomerStory(customerStory);
		}

		String benefits = (String)attributes.get("benefits");

		if (benefits != null) {
			setBenefits(benefits);
		}

		String functions = (String)attributes.get("functions");

		if (functions != null) {
			setFunctions(functions);
		}

		String partners = (String)attributes.get("partners");

		if (partners != null) {
			setPartners(partners);
		}

		String relatedPlatforms = (String)attributes.get("relatedPlatforms");

		if (relatedPlatforms != null) {
			setRelatedPlatforms(relatedPlatforms);
		}
	}

	@Override
	public Object clone() {
		return new CPDefinitionLocalizationWrapper(
			(CPDefinitionLocalization)_cpDefinitionLocalization.clone());
	}

	@Override
	public int compareTo(CPDefinitionLocalization cpDefinitionLocalization) {
		return _cpDefinitionLocalization.compareTo(cpDefinitionLocalization);
	}

	/**
	 * Returns the benefits of this cp definition localization.
	 *
	 * @return the benefits of this cp definition localization
	 */
	@Override
	public String getBenefits() {
		return _cpDefinitionLocalization.getBenefits();
	}

	/**
	 * Returns the company ID of this cp definition localization.
	 *
	 * @return the company ID of this cp definition localization
	 */
	@Override
	public long getCompanyId() {
		return _cpDefinitionLocalization.getCompanyId();
	}

	/**
	 * Returns the cp definition ID of this cp definition localization.
	 *
	 * @return the cp definition ID of this cp definition localization
	 */
	@Override
	public long getCPDefinitionId() {
		return _cpDefinitionLocalization.getCPDefinitionId();
	}

	/**
	 * Returns the cp definition localization ID of this cp definition localization.
	 *
	 * @return the cp definition localization ID of this cp definition localization
	 */
	@Override
	public long getCpDefinitionLocalizationId() {
		return _cpDefinitionLocalization.getCpDefinitionLocalizationId();
	}

	/**
	 * Returns the customer story of this cp definition localization.
	 *
	 * @return the customer story of this cp definition localization
	 */
	@Override
	public String getCustomerStory() {
		return _cpDefinitionLocalization.getCustomerStory();
	}

	/**
	 * Returns the description of this cp definition localization.
	 *
	 * @return the description of this cp definition localization
	 */
	@Override
	public String getDescription() {
		return _cpDefinitionLocalization.getDescription();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cpDefinitionLocalization.getExpandoBridge();
	}

	/**
	 * Returns the features of this cp definition localization.
	 *
	 * @return the features of this cp definition localization
	 */
	@Override
	public String getFeatures() {
		return _cpDefinitionLocalization.getFeatures();
	}

	/**
	 * Returns the functions of this cp definition localization.
	 *
	 * @return the functions of this cp definition localization
	 */
	@Override
	public String getFunctions() {
		return _cpDefinitionLocalization.getFunctions();
	}

	/**
	 * Returns the introduction of this cp definition localization.
	 *
	 * @return the introduction of this cp definition localization
	 */
	@Override
	public String getIntroduction() {
		return _cpDefinitionLocalization.getIntroduction();
	}

	/**
	 * Returns the language ID of this cp definition localization.
	 *
	 * @return the language ID of this cp definition localization
	 */
	@Override
	public String getLanguageId() {
		return _cpDefinitionLocalization.getLanguageId();
	}

	/**
	 * Returns the meta description of this cp definition localization.
	 *
	 * @return the meta description of this cp definition localization
	 */
	@Override
	public String getMetaDescription() {
		return _cpDefinitionLocalization.getMetaDescription();
	}

	/**
	 * Returns the meta keywords of this cp definition localization.
	 *
	 * @return the meta keywords of this cp definition localization
	 */
	@Override
	public String getMetaKeywords() {
		return _cpDefinitionLocalization.getMetaKeywords();
	}

	/**
	 * Returns the meta title of this cp definition localization.
	 *
	 * @return the meta title of this cp definition localization
	 */
	@Override
	public String getMetaTitle() {
		return _cpDefinitionLocalization.getMetaTitle();
	}

	/**
	 * Returns the mvcc version of this cp definition localization.
	 *
	 * @return the mvcc version of this cp definition localization
	 */
	@Override
	public long getMvccVersion() {
		return _cpDefinitionLocalization.getMvccVersion();
	}

	/**
	 * Returns the name of this cp definition localization.
	 *
	 * @return the name of this cp definition localization
	 */
	@Override
	public String getName() {
		return _cpDefinitionLocalization.getName();
	}

	/**
	 * Returns the overview of this cp definition localization.
	 *
	 * @return the overview of this cp definition localization
	 */
	@Override
	public String getOverview() {
		return _cpDefinitionLocalization.getOverview();
	}

	/**
	 * Returns the partners of this cp definition localization.
	 *
	 * @return the partners of this cp definition localization
	 */
	@Override
	public String getPartners() {
		return _cpDefinitionLocalization.getPartners();
	}

	/**
	 * Returns the primary key of this cp definition localization.
	 *
	 * @return the primary key of this cp definition localization
	 */
	@Override
	public long getPrimaryKey() {
		return _cpDefinitionLocalization.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cpDefinitionLocalization.getPrimaryKeyObj();
	}

	/**
	 * Returns the related platforms of this cp definition localization.
	 *
	 * @return the related platforms of this cp definition localization
	 */
	@Override
	public String getRelatedPlatforms() {
		return _cpDefinitionLocalization.getRelatedPlatforms();
	}

	/**
	 * Returns the short description of this cp definition localization.
	 *
	 * @return the short description of this cp definition localization
	 */
	@Override
	public String getShortDescription() {
		return _cpDefinitionLocalization.getShortDescription();
	}

	/**
	 * Returns the solutions of this cp definition localization.
	 *
	 * @return the solutions of this cp definition localization
	 */
	@Override
	public String getSolutions() {
		return _cpDefinitionLocalization.getSolutions();
	}

	@Override
	public int hashCode() {
		return _cpDefinitionLocalization.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cpDefinitionLocalization.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cpDefinitionLocalization.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cpDefinitionLocalization.isNew();
	}

	/**
	 * Sets the benefits of this cp definition localization.
	 *
	 * @param benefits the benefits of this cp definition localization
	 */
	@Override
	public void setBenefits(String benefits) {
		_cpDefinitionLocalization.setBenefits(benefits);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cpDefinitionLocalization.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this cp definition localization.
	 *
	 * @param companyId the company ID of this cp definition localization
	 */
	@Override
	public void setCompanyId(long companyId) {
		_cpDefinitionLocalization.setCompanyId(companyId);
	}

	/**
	 * Sets the cp definition ID of this cp definition localization.
	 *
	 * @param CPDefinitionId the cp definition ID of this cp definition localization
	 */
	@Override
	public void setCPDefinitionId(long CPDefinitionId) {
		_cpDefinitionLocalization.setCPDefinitionId(CPDefinitionId);
	}

	/**
	 * Sets the cp definition localization ID of this cp definition localization.
	 *
	 * @param cpDefinitionLocalizationId the cp definition localization ID of this cp definition localization
	 */
	@Override
	public void setCpDefinitionLocalizationId(long cpDefinitionLocalizationId) {
		_cpDefinitionLocalization.setCpDefinitionLocalizationId(
			cpDefinitionLocalizationId);
	}

	/**
	 * Sets the customer story of this cp definition localization.
	 *
	 * @param customerStory the customer story of this cp definition localization
	 */
	@Override
	public void setCustomerStory(String customerStory) {
		_cpDefinitionLocalization.setCustomerStory(customerStory);
	}

	/**
	 * Sets the description of this cp definition localization.
	 *
	 * @param description the description of this cp definition localization
	 */
	@Override
	public void setDescription(String description) {
		_cpDefinitionLocalization.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_cpDefinitionLocalization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cpDefinitionLocalization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cpDefinitionLocalization.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the features of this cp definition localization.
	 *
	 * @param features the features of this cp definition localization
	 */
	@Override
	public void setFeatures(String features) {
		_cpDefinitionLocalization.setFeatures(features);
	}

	/**
	 * Sets the functions of this cp definition localization.
	 *
	 * @param functions the functions of this cp definition localization
	 */
	@Override
	public void setFunctions(String functions) {
		_cpDefinitionLocalization.setFunctions(functions);
	}

	/**
	 * Sets the introduction of this cp definition localization.
	 *
	 * @param introduction the introduction of this cp definition localization
	 */
	@Override
	public void setIntroduction(String introduction) {
		_cpDefinitionLocalization.setIntroduction(introduction);
	}

	/**
	 * Sets the language ID of this cp definition localization.
	 *
	 * @param languageId the language ID of this cp definition localization
	 */
	@Override
	public void setLanguageId(String languageId) {
		_cpDefinitionLocalization.setLanguageId(languageId);
	}

	/**
	 * Sets the meta description of this cp definition localization.
	 *
	 * @param metaDescription the meta description of this cp definition localization
	 */
	@Override
	public void setMetaDescription(String metaDescription) {
		_cpDefinitionLocalization.setMetaDescription(metaDescription);
	}

	/**
	 * Sets the meta keywords of this cp definition localization.
	 *
	 * @param metaKeywords the meta keywords of this cp definition localization
	 */
	@Override
	public void setMetaKeywords(String metaKeywords) {
		_cpDefinitionLocalization.setMetaKeywords(metaKeywords);
	}

	/**
	 * Sets the meta title of this cp definition localization.
	 *
	 * @param metaTitle the meta title of this cp definition localization
	 */
	@Override
	public void setMetaTitle(String metaTitle) {
		_cpDefinitionLocalization.setMetaTitle(metaTitle);
	}

	/**
	 * Sets the mvcc version of this cp definition localization.
	 *
	 * @param mvccVersion the mvcc version of this cp definition localization
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		_cpDefinitionLocalization.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the name of this cp definition localization.
	 *
	 * @param name the name of this cp definition localization
	 */
	@Override
	public void setName(String name) {
		_cpDefinitionLocalization.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_cpDefinitionLocalization.setNew(n);
	}

	/**
	 * Sets the overview of this cp definition localization.
	 *
	 * @param overview the overview of this cp definition localization
	 */
	@Override
	public void setOverview(String overview) {
		_cpDefinitionLocalization.setOverview(overview);
	}

	/**
	 * Sets the partners of this cp definition localization.
	 *
	 * @param partners the partners of this cp definition localization
	 */
	@Override
	public void setPartners(String partners) {
		_cpDefinitionLocalization.setPartners(partners);
	}

	/**
	 * Sets the primary key of this cp definition localization.
	 *
	 * @param primaryKey the primary key of this cp definition localization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cpDefinitionLocalization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cpDefinitionLocalization.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the related platforms of this cp definition localization.
	 *
	 * @param relatedPlatforms the related platforms of this cp definition localization
	 */
	@Override
	public void setRelatedPlatforms(String relatedPlatforms) {
		_cpDefinitionLocalization.setRelatedPlatforms(relatedPlatforms);
	}

	/**
	 * Sets the short description of this cp definition localization.
	 *
	 * @param shortDescription the short description of this cp definition localization
	 */
	@Override
	public void setShortDescription(String shortDescription) {
		_cpDefinitionLocalization.setShortDescription(shortDescription);
	}

	/**
	 * Sets the solutions of this cp definition localization.
	 *
	 * @param solutions the solutions of this cp definition localization
	 */
	@Override
	public void setSolutions(String solutions) {
		_cpDefinitionLocalization.setSolutions(solutions);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CPDefinitionLocalization>
		toCacheModel() {

		return _cpDefinitionLocalization.toCacheModel();
	}

	@Override
	public CPDefinitionLocalization toEscapedModel() {
		return new CPDefinitionLocalizationWrapper(
			_cpDefinitionLocalization.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cpDefinitionLocalization.toString();
	}

	@Override
	public CPDefinitionLocalization toUnescapedModel() {
		return new CPDefinitionLocalizationWrapper(
			_cpDefinitionLocalization.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cpDefinitionLocalization.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CPDefinitionLocalizationWrapper)) {
			return false;
		}

		CPDefinitionLocalizationWrapper cpDefinitionLocalizationWrapper =
			(CPDefinitionLocalizationWrapper)object;

		if (Objects.equals(
				_cpDefinitionLocalization,
				cpDefinitionLocalizationWrapper._cpDefinitionLocalization)) {

			return true;
		}

		return false;
	}

	@Override
	public CPDefinitionLocalization getWrappedModel() {
		return _cpDefinitionLocalization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cpDefinitionLocalization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cpDefinitionLocalization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cpDefinitionLocalization.resetOriginalValues();
	}

	private final CPDefinitionLocalization _cpDefinitionLocalization;

}