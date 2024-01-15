package com.osip.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@EntityScan
@Data
@Document(collection = "Store")
public class Store {

	@Id
	private String storeId;
	private String storeSite;
	private String vendor;
	private String contractor;
	private String materialName;
	private String materialQuantity;
	private String invoiceID;
	private String invoiceDate;
	public String getStoreid() {
		return storeId;
	}
	public void setStoreId(String storeid) {
		this.storeId = storeid;
	}
	public String getStoresite() {
		return storeSite;
	}
	public void setStoresite(String storesite) {
		this.storeSite = storesite;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialQuantity() {
		return materialQuantity;
	}
	public void setMaterialQuantity(String materialQuantity) {
		this.materialQuantity = materialQuantity;
	}
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	
}