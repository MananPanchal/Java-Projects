/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.phoenix.models.Product;

public class ProductSetDemo {

	public static void main(String[] args) {
		
		Set<Product> productSet = new HashSet<Product>();
		
		productSet.add(new Product(1002, "Mobile", "Samsung", 23500.00f));
		productSet.add(new Product(1005, "Laptop", "Lenovo", 28700.00f));
		productSet.add(new Product(1006, "Refrigerator", "Whirlpool", 39800.00f));
		productSet.add(new Product(1001, "UHD TV", "Sony", 79999.00f));
		productSet.add(new Product(1002, "Mobile", "Samsung", 23500.00f));

		System.out.println("Before Sorting");
		for(Product product: productSet)
			System.out.println(product);

	}

}
