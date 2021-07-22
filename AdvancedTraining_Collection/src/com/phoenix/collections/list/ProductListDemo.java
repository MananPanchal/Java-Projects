/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.ProductBrandComparator;
import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.models.Product;

public class ProductListDemo {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1002, "Mobile", "Samsung", 23500.00f));
		productList.add(new Product(1005, "Laptop", "Lenovo", 28700.00f));
		productList.add(new Product(1006, "Refrigerator", "Whirlpool", 39800.00f));
		productList.add(new Product(1001, "UHD TV", "Sony", 79999.00f));
		productList.add(new Product(1002, "Mobile", "Samsung", 23500.00f));

		System.out.println("Before Sorting");
		for(Product product: productList)
			System.out.println(product);
		
		System.out.println();
		
		Collections.sort(productList);
		System.out.println("Sorting According to id in Ascending Order");
		for(Product product: productList)
			System.out.println(product);
		
		System.out.println();
		
		Collections.sort(productList, Collections.reverseOrder());
		System.out.println("Sorting According to id in Descending Order");
		for(Product product: productList)
			System.out.println(product);

		System.out.println();
		
		Comparator<Product> cNm = new ProductNameComparator();
		Collections.sort(productList, cNm);
		System.out.println("Sorting According to Name in Ascending Order");
		for(Product product: productList)
			System.out.println(product);
		
		System.out.println();
		
		// Collections.sort(productList, cNm.reversed());
		Collections.sort(productList, Collections.reverseOrder(cNm));
		System.out.println("Sorting According to Name in Descending Order");
		for(Product product: productList)
			System.out.println(product);
		
		System.out.println();
		
		Comparator<Product> cBr = new ProductBrandComparator();
		Collections.sort(productList, cBr);
		System.out.println("Sorting According to Brand in Ascending Order");
		for(Product product: productList)
			System.out.println(product);
		
		System.out.println();
		
		Collections.sort(productList, cBr.reversed());
		System.out.println("Sorting According to Brand in Descending Order");
		for(Product product: productList)
			System.out.println(product);
		
		
		
	}

}
