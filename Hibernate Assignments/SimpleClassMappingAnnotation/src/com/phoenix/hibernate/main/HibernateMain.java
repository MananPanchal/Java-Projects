/*
 *	Author : manan.panchal@stltech.in
 *	Creation Time : 7th July, 2021
 *	Version : 2.0
 *	Copyright : Sterlite Technologies Ltd.
 *	Description : It is used to perform database
 *				operations using Hibernate Framework
 */

package com.phoenix.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;

public class HibernateMain {

	public static void main(String[] args) {
		
		// Create Configuration Object and read Hibernate Configuration
		Configuration cfg = new Configuration().configure();
		
		// Build SessionFactory (Singleton & Heavyweight Class)
		SessionFactory factory = cfg.buildSessionFactory();
		
		// Establish Database Connection
		Session ss = factory.openSession();
		
		// Obtain Hibernate Transaction
		Transaction tx = ss.beginTransaction();
		
		// Code for Database Operations - CRUD
		
		// Get Database Row as an object
		// Product product = ss.get(Product.class, 21); No Row		
	/*	 Product product = ss.get(Product.class, 3001); 
		 System.out.println(product); */
		 
		
	/*	// Insert an Object as a new row
		 Product p = new Product(1001, "LED TV", "Samsung", 150000.00f);
		 ss.save(p); */
		
		
		// Product p = ss.load(Product.class, 21); No row
	/*	Product p = ss.load(Product.class, 1001);
		System.out.println("Product Id: " + p.getProductId());
		System.out.println("Name: " + p.getProductName());
		System.out.println("Brand: " + p.getBrand());
		System.out.println("Price: " + p.getPrice()); */
		
		
		// Update row price using an object
		
	/*	Product p = ss.get(Product.class, 1001); 
		if(p != null) {
			p.setPrice(p.getPrice() + 3000.00f); 
			p.setBrand("Sony"); ss.update(p); 
		}
		else System.out.println("Sorry! Product is not found!!");
		 
		 p = ss.get(Product.class, 1001); 
		 if(p != null) 
		 	System.out.println(p); 
		 else
		 	System.out.println("Sorry! Product is not found!!"); */
			
		
		
		// Delete a row using an object
	/*	Product p = ss.get(Product.class, 1001);
		if(p != null) {
			ss.delete(p);
		} else
			System.out.println("Sorry! Product is not found!!");
	*/	
		
		Product p = new Product();
		p.setProductName("Desktop Computer");
		p.setBrand("Dell");
		p.setPrice(52500.00f);
		ss.save(p);
		
		
		// Commit Transaction
		tx.commit();
		
		// Close Session (Database Connection)
		ss.close();

	}

}
