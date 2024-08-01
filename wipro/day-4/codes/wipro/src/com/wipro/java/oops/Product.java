package com.wipro.java.oops;

public class Product {
	private Integer productId;
	private String productName;
	
	public Integer getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}
