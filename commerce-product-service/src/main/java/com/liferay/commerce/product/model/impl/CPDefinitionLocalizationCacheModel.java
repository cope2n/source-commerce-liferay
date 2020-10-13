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

import com.liferay.commerce.product.model.CPDefinitionLocalization;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CPDefinitionLocalization in entity cache.
 *
 * @author Marco Leo
 * @generated
 */
public class CPDefinitionLocalizationCacheModel
	implements CacheModel<CPDefinitionLocalization>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CPDefinitionLocalizationCacheModel)) {
			return false;
		}

		CPDefinitionLocalizationCacheModel cpDefinitionLocalizationCacheModel =
			(CPDefinitionLocalizationCacheModel)object;

		if ((cpDefinitionLocalizationId ==
				cpDefinitionLocalizationCacheModel.
					cpDefinitionLocalizationId) &&
			(mvccVersion == cpDefinitionLocalizationCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, cpDefinitionLocalizationId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", cpDefinitionLocalizationId=");
		sb.append(cpDefinitionLocalizationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", CPDefinitionId=");
		sb.append(CPDefinitionId);
		sb.append(", languageId=");
		sb.append(languageId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", shortDescription=");
		sb.append(shortDescription);
		sb.append(", description=");
		sb.append(description);
		sb.append(", metaTitle=");
		sb.append(metaTitle);
		sb.append(", metaDescription=");
		sb.append(metaDescription);
		sb.append(", metaKeywords=");
		sb.append(metaKeywords);
		sb.append(", overview=");
		sb.append(overview);
		sb.append(", introduction=");
		sb.append(introduction);
		sb.append(", features=");
		sb.append(features);
		sb.append(", solutions=");
		sb.append(solutions);
		sb.append(", customerStory=");
		sb.append(customerStory);
		sb.append(", benefits=");
		sb.append(benefits);
		sb.append(", functions=");
		sb.append(functions);
		sb.append(", partners=");
		sb.append(partners);
		sb.append(", relatedPlatforms=");
		sb.append(relatedPlatforms);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CPDefinitionLocalization toEntityModel() {
		CPDefinitionLocalizationImpl cpDefinitionLocalizationImpl =
			new CPDefinitionLocalizationImpl();

		cpDefinitionLocalizationImpl.setMvccVersion(mvccVersion);
		cpDefinitionLocalizationImpl.setCpDefinitionLocalizationId(
			cpDefinitionLocalizationId);
		cpDefinitionLocalizationImpl.setCompanyId(companyId);
		cpDefinitionLocalizationImpl.setCPDefinitionId(CPDefinitionId);

		if (languageId == null) {
			cpDefinitionLocalizationImpl.setLanguageId("");
		}
		else {
			cpDefinitionLocalizationImpl.setLanguageId(languageId);
		}

		if (name == null) {
			cpDefinitionLocalizationImpl.setName("");
		}
		else {
			cpDefinitionLocalizationImpl.setName(name);
		}

		if (shortDescription == null) {
			cpDefinitionLocalizationImpl.setShortDescription("");
		}
		else {
			cpDefinitionLocalizationImpl.setShortDescription(shortDescription);
		}

		if (description == null) {
			cpDefinitionLocalizationImpl.setDescription("");
		}
		else {
			cpDefinitionLocalizationImpl.setDescription(description);
		}

		if (metaTitle == null) {
			cpDefinitionLocalizationImpl.setMetaTitle("");
		}
		else {
			cpDefinitionLocalizationImpl.setMetaTitle(metaTitle);
		}

		if (metaDescription == null) {
			cpDefinitionLocalizationImpl.setMetaDescription("");
		}
		else {
			cpDefinitionLocalizationImpl.setMetaDescription(metaDescription);
		}

		if (metaKeywords == null) {
			cpDefinitionLocalizationImpl.setMetaKeywords("");
		}
		else {
			cpDefinitionLocalizationImpl.setMetaKeywords(metaKeywords);
		}

		if (overview == null) {
			cpDefinitionLocalizationImpl.setOverview("");
		}
		else {
			cpDefinitionLocalizationImpl.setOverview(overview);
		}

		if (introduction == null) {
			cpDefinitionLocalizationImpl.setIntroduction("");
		}
		else {
			cpDefinitionLocalizationImpl.setIntroduction(introduction);
		}

		if (features == null) {
			cpDefinitionLocalizationImpl.setFeatures("");
		}
		else {
			cpDefinitionLocalizationImpl.setFeatures(features);
		}

		if (solutions == null) {
			cpDefinitionLocalizationImpl.setSolutions("");
		}
		else {
			cpDefinitionLocalizationImpl.setSolutions(solutions);
		}

		if (customerStory == null) {
			cpDefinitionLocalizationImpl.setCustomerStory("");
		}
		else {
			cpDefinitionLocalizationImpl.setCustomerStory(customerStory);
		}

		if (benefits == null) {
			cpDefinitionLocalizationImpl.setBenefits("");
		}
		else {
			cpDefinitionLocalizationImpl.setBenefits(benefits);
		}

		if (functions == null) {
			cpDefinitionLocalizationImpl.setFunctions("");
		}
		else {
			cpDefinitionLocalizationImpl.setFunctions(functions);
		}

		if (partners == null) {
			cpDefinitionLocalizationImpl.setPartners("");
		}
		else {
			cpDefinitionLocalizationImpl.setPartners(partners);
		}

		if (relatedPlatforms == null) {
			cpDefinitionLocalizationImpl.setRelatedPlatforms("");
		}
		else {
			cpDefinitionLocalizationImpl.setRelatedPlatforms(relatedPlatforms);
		}

		cpDefinitionLocalizationImpl.resetOriginalValues();

		return cpDefinitionLocalizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		mvccVersion = objectInput.readLong();

		cpDefinitionLocalizationId = objectInput.readLong();

		companyId = objectInput.readLong();

		CPDefinitionId = objectInput.readLong();
		languageId = objectInput.readUTF();
		name = objectInput.readUTF();
		shortDescription = objectInput.readUTF();
		description = (String)objectInput.readObject();
		metaTitle = objectInput.readUTF();
		metaDescription = objectInput.readUTF();
		metaKeywords = objectInput.readUTF();
		overview = objectInput.readUTF();
		introduction = objectInput.readUTF();
		features = objectInput.readUTF();
		solutions = objectInput.readUTF();
		customerStory = objectInput.readUTF();
		benefits = objectInput.readUTF();
		functions = objectInput.readUTF();
		partners = objectInput.readUTF();
		relatedPlatforms = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		objectOutput.writeLong(cpDefinitionLocalizationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(CPDefinitionId);

		if (languageId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(languageId);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (shortDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shortDescription);
		}

		if (description == null) {
			objectOutput.writeObject("");
		}
		else {
			objectOutput.writeObject(description);
		}

		if (metaTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(metaTitle);
		}

		if (metaDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(metaDescription);
		}

		if (metaKeywords == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(metaKeywords);
		}

		if (overview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(overview);
		}

		if (introduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(introduction);
		}

		if (features == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(features);
		}

		if (solutions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(solutions);
		}

		if (customerStory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerStory);
		}

		if (benefits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(benefits);
		}

		if (functions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(functions);
		}

		if (partners == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partners);
		}

		if (relatedPlatforms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relatedPlatforms);
		}
	}

	public long mvccVersion;
	public long cpDefinitionLocalizationId;
	public long companyId;
	public long CPDefinitionId;
	public String languageId;
	public String name;
	public String shortDescription;
	public String description;
	public String metaTitle;
	public String metaDescription;
	public String metaKeywords;
	public String overview;
	public String introduction;
	public String features;
	public String solutions;
	public String customerStory;
	public String benefits;
	public String functions;
	public String partners;
	public String relatedPlatforms;

}