/*
 *	Author : manan.panchal@stltech.in
 *	Creation Time : 7th July, 2021
 *	Version : 2.0
 *	Copyright : Sterlite Technologies Ltd.
 *	Description : It is a POJO Class which 
 *				acts as Persistent class 
 *				or Entity class in Hibernate. 
 *				It uses JPA Annotation.
 */

package com.phoenix.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT1")
public class Product {
	
	// Attributes or instance variables
	@Id 
	@GeneratedValue(generator = "increment")
	@Column(name = "Id")
	private int productId;
	
	@Column(name = "NAME")
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
