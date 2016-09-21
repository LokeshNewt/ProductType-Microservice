package com.newt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductType {
	@Id
	private String productTypeId;
	// private String ProductName;

	public String getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}

	/*
	 * public String getProductName() { return ProductName; } public void
	 * setProductName(String productName) { ProductName = productName; }
	 */

}
