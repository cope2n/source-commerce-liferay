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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Marco Leo
 * @generated
 */
public class CommerceCatalogLocalizationSoap implements Serializable {

	public static CommerceCatalogLocalizationSoap toSoapModel(
		CommerceCatalogLocalization model) {

		CommerceCatalogLocalizationSoap soapModel =
			new CommerceCatalogLocalizationSoap();

		soapModel.setMvccVersion(model.getMvccVersion());
		soapModel.setCommerceCatalogLocalizationId(
			model.getCommerceCatalogLocalizationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCommerceCatalogId(model.getCommerceCatalogId());
		soapModel.setLanguageId(model.getLanguageId());
		soapModel.setDescCatalog(model.getDescCatalog());
		soapModel.setSubCatalog(model.getSubCatalog());
		soapModel.setImageCatalog(model.getImageCatalog());

		return soapModel;
	}

	public static CommerceCatalogLocalizationSoap[] toSoapModels(
		CommerceCatalogLocalization[] models) {

		CommerceCatalogLocalizationSoap[] soapModels =
			new CommerceCatalogLocalizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CommerceCatalogLocalizationSoap[][] toSoapModels(
		CommerceCatalogLocalization[][] models) {

		CommerceCatalogLocalizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CommerceCatalogLocalizationSoap
				[models.length][models[0].length];
		}
		else {
			soapModels = new CommerceCatalogLocalizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CommerceCatalogLocalizationSoap[] toSoapModels(
		List<CommerceCatalogLocalization> models) {

		List<CommerceCatalogLocalizationSoap> soapModels =
			new ArrayList<CommerceCatalogLocalizationSoap>(models.size());

		for (CommerceCatalogLocalization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new CommerceCatalogLocalizationSoap[soapModels.size()]);
	}

	public CommerceCatalogLocalizationSoap() {
	}

	public long getPrimaryKey() {
		return _commerceCatalogLocalizationId;
	}

	public void setPrimaryKey(long pk) {
		setCommerceCatalogLocalizationId(pk);
	}

	public long getMvccVersion() {
		return _mvccVersion;
	}

	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	public long getCommerceCatalogLocalizationId() {
		return _commerceCatalogLocalizationId;
	}

	public void setCommerceCatalogLocalizationId(
		long commerceCatalogLocalizationId) {

		_commerceCatalogLocalizationId = commerceCatalogLocalizationId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCommerceCatalogId() {
		return _commerceCatalogId;
	}

	public void setCommerceCatalogId(long commerceCatalogId) {
		_commerceCatalogId = commerceCatalogId;
	}

	public String getLanguageId() {
		return _languageId;
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public String getDescCatalog() {
		return _descCatalog;
	}

	public void setDescCatalog(String descCatalog) {
		_descCatalog = descCatalog;
	}

	public String getSubCatalog() {
		return _subCatalog;
	}

	public void setSubCatalog(String subCatalog) {
		_subCatalog = subCatalog;
	}

	public String getImageCatalog() {
		return _imageCatalog;
	}

	public void setImageCatalog(String imageCatalog) {
		_imageCatalog = imageCatalog;
	}

	private long _mvccVersion;
	private long _commerceCatalogLocalizationId;
	private long _companyId;
	private long _commerceCatalogId;
	private String _languageId;
	private String _descCatalog;
	private String _subCatalog;
	private String _imageCatalog;

}