/*
 *	Author : manan.panchal@stltech.in
 *	Creation Time : 7th July, 2021
 *	Version : 1.0
 *	Copyright : Sterlite Technologies Ltd.
 *	Description : It is a POJO Class which 
 *				acts as Persistent class 
 *				or Entity class in Hibernate 
 */

package com.phoenix.entities;

public class Product {
	
	// Attributes or instance variables
	private int productId;
	private String productName;
	private String brand;
	private float price;
	
	// Default Constructor
	public Product() {
		
	}

	// Parameterized Constructor
	public Product(int productId, String productName, String brand, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}

	// Setter-Getter Methods
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// toString Method
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + "]";
	}
	
}
