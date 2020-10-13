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

import com.liferay.commerce.product.model.CommerceCatalogLocalization;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CommerceCatalogLocalization in entity cache.
 *
 * @author Marco Leo
 * @generated
 */
public class CommerceCatalogLocalizationCacheModel
	implements CacheModel<CommerceCatalogLocalization>, Externalizable,
			   MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CommerceCatalogLocalizationCacheModel)) {
			return false;
		}

		CommerceCatalogLocalizationCacheModel
			commerceCatalogLocalizationCacheModel =
				(CommerceCatalogLocalizationCacheModel)object;

		if ((commerceCatalogLocalizationId ==
				commerceCatalogLocalizationCacheModel.
					commerceCatalogLocalizationId) &&
			(mvccVersion ==
				commerceCatalogLocalizationCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, commerceCatalogLocalizationId);

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
		StringBundler sb = new StringBundler(17);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", commerceCatalogLocalizationId=");
		sb.append(commerceCatalogLocalizationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", commerceCatalogId=");
		sb.append(commerceCatalogId);
		sb.append(", languageId=");
		sb.append(languageId);
		sb.append(", descCatalog=");
		sb.append(descCatalog);
		sb.append(", subCatalog=");
		sb.append(subCatalog);
		sb.append(", imageCatalog=");
		sb.append(imageCatalog);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CommerceCatalogLocalization toEntityModel() {
		CommerceCatalogLocalizationImpl commerceCatalogLocalizationImpl =
			new CommerceCatalogLocalizationImpl();

		commerceCatalogLocalizationImpl.setMvccVersion(mvccVersion);
		commerceCatalogLocalizationImpl.setCommerceCatalogLocalizationId(
			commerceCatalogLocalizationId);
		commerceCatalogLocalizationImpl.setCompanyId(companyId);
		commerceCatalogLocalizationImpl.setCommerceCatalogId(commerceCatalogId);

		if (languageId == null) {
			commerceCatalogLocalizationImpl.setLanguageId("");
		}
		else {
			commerceCatalogLocalizationImpl.setLanguageId(languageId);
		}

		if (descCatalog == null) {
			commerceCatalogLocalizationImpl.setDescCatalog("");
		}
		else {
			commerceCatalogLocalizationImpl.setDescCatalog(descCatalog);
		}

		if (subCatalog == null) {
			commerceCatalogLocalizationImpl.setSubCatalog("");
		}
		else {
			commerceCatalogLocalizationImpl.setSubCatalog(subCatalog);
		}

		if (imageCatalog == null) {
			commerceCatalogLocalizationImpl.setImageCatalog("");
		}
		else {
			commerceCatalogLocalizationImpl.setImageCatalog(imageCatalog);
		}

		commerceCatalogLocalizationImpl.resetOriginalValues();

		return commerceCatalogLocalizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();

		commerceCatalogLocalizationId = objectInput.readLong();

		companyId = objectInput.readLong();

		commerceCatalogId = objectInput.readLong();
		languageId = objectInput.readUTF();
		descCatalog = objectInput.readUTF();
		subCatalog = objectInput.readUTF();
		imageCatalog = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		objectOutput.writeLong(commerceCatalogLocalizationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(commerceCatalogId);

		if (languageId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(languageId);
		}

		if (descCatalog == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descCatalog);
		}

		if (subCatalog == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCatalog);
		}

		if (imageCatalog == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imageCatalog);
		}
	}

	public long mvccVersion;
	public long commerceCatalogLocalizationId;
	public long companyId;
	public long commerceCatalogId;
	public String languageId;
	public String descCatalog;
	public String subCatalog;
	public String imageCatalog;

}