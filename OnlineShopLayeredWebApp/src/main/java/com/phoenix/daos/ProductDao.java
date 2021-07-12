/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.Product;

public interface ProductDao {
	
	// CRUD Methods
	List<Product> getAllProducts() throws SQLException;
	Product getProductById(int id) throws SQLException;
	void insert(Product product) throws SQLException;
	void update(Product product) throws SQLException;
	void delete(Product product) throws SQLException;

}
