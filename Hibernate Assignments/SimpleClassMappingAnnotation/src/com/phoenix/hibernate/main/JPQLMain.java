/*
 *	Author : manan.panchal@stltech.in
 *	Creation Time : 8th July, 2021
 *	Version : 2.0
 *	Copyright : Sterlite Technologies Ltd.
 *	Description : It is used to perform database
 *				operations using JPQL.
 */

package com.phoenix.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;

public class JPQLMain {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		// Hibernate Query using JPQL - Object Oriented Query Language
		// Works on Persistent class and it's attributes only
		// Does not understand table and column names
		
		// Selecting all queries
		// Query query = session.createQuery("from Product");
		
		// Selecting with where clause
		// Query query = session.createQuery("from Product p where p.price >= 50000.00f");
		// Query query = session.createQuery("from Product p where p.brand = 'Samsung'");
		// Query query = session.createQuery("from Product p where p.productName = 'Laptop'");
		// Query query = session.createQuery("from Product p where p.productName = 'Laptop' and p.brand='Lenovo'");
		// Query query = session.createQuery("from Product p where p.price between 40000 and 80000");
		// Query query = session.createQuery("from Product p where p.productName like 'M%'");
		// Query query = session.createQuery("from Product p where p.productName like '_a%'");
		// Query query = session.createQuery("from Product p where p.brand is null");
		// Query query = session.createQuery("from Product p where p.brand is not null");
		
		// Selecting with order by clause
		// Query query = session.createQuery("from Product p order by p.price");
		// Query query = session.createQuery("from Product p order by p.price desc");
		// Query query = session.createQuery("from Product p order by p.productName, p.price desc");
		
		// Selecting with where and order by clause
		// Query query = session.createQuery("from Product p where p.price <= 50000.00 order by p.price");
		// Query query = session.createQuery("from Product p where p.price <= 50000.00 and p.brand like '%a%' order by p.price desc");
		
		
	/*	List<Product> productList = query.getResultList();
		
		for(Product product: productList)
			System.out.println(product);
	*/
		
		// Projection - Selecting Particular fields (columns) in JPQL
		// Query query = session.createQuery("select p.productName, p.price from Product p");
		// Query query = session.createQuery("select p.brand, p.productName, p.price from Product p");
		// Query query = session.createQuery("select p.productId, p.productName, p.price from Product p where p.price > 50000.00 and p.price < 80000.00");
		// Query query = session.createQuery("select p.productId, p.productName, p.price from Product p where p.price > 50000.00 and p.price < 80000.00 order by p.productName");
		
	/*	// Collection of array of objects in Object[]
		List<Object[]> objList = query.getResultList();
		for(Object[]obArr: objList) {
			// System.out.println("Product Name: " + obArr[0] + "\t Price : "+ obArr[1]);			
			for(Object ob: obArr) {				
				System.out.print(ob + "\t");				
			}			
			System.out.println();			
		}
	*/
		
	/*	// Single Result Output 
		Query query3 = session.createQuery("Select max(p.price) from Product p");	
		float maxPrice = (float) query3.getSingleResult();
		System.out.println("Maximum Price : " + maxPrice);
		
		Query query4 = session.createQuery("Select min(p.price) from Product p");	
		float minPrice = (float) query4.getSingleResult();
		System.out.println("Minimum Price : " + minPrice);
		
		Query query1 = session.createQuery("Select sum(p.price) from Product p");
		double totalPrice = (double) query1.getSingleResult();
		System.out.println("Total Price : " + totalPrice);
		
		Query query2 = session.createQuery("Select avg(p.price) from Product p");
		double avgPrice = (double) query2.getSingleResult();
		System.out.println("Average Price : " + avgPrice);
	*/
		
		// Selecting With Group By Clause
		// Query query = session.createQuery("select p.brand, count(*) from Product p group by p.brand");
		// Query query = session.createQuery("select p.brand, count(*) from Product p group by p.brand order by p.brand");
		// Query query = session.createQuery("select p.brand, count(*) as c from Product p group by p.brand order by c");
		Query query = session.createQuery("select p.brand, count(*) as c from Product p group by p.brand having p.brand like '%n%' order by c");
		
		
		List<Object[]> objList = query.getResultList();
		for(Object[]obArr: objList) {			
			for(Object ob: obArr) {				
				System.out.print(ob + "\t");				
			}			
			System.out.println();			
		}
		
		tx.commit();
		session.close();
		
	}

}
