/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.db.OracleConnection;

public class ProductDaoImpl implements ProductDao {
	
	private static Connection con;
	
	static {
		
		try {
			con = OracleConnection.getOracleConnection();
			System.out.println("Oracle Database Connection is Established!");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		String sql = "SELECT * FROM Product1";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Product> products = new ArrayList<Product>();
		
		while(rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			products.add(product);
		}
		return products;
	}

	@Override
	public Product getProductById(int id) throws SQLException {
		
		String sql = "SELECT * FROM Product1 WHERE id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			return product;
		}
		else
			return null;
	}

	@Override
	public void insert(Product product) throws SQLException {
		
		String sql = "INSERT INTO Product1 VALUES (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, product.getId());
		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getBrand());
		pstmt.setFloat(4, product.getPrice());
		
		int updateCount = pstmt.executeUpdate();

		if(updateCount > 0)
			System.out.println("New Product has been Added Successfully!");
		else
			System.out.println("Sorry! New Product could not be Added Successfully!");

	}

	@Override
	public void update(Product product) throws SQLException {
		
		String sql = "UPDATE Product1 SET name=?, brand=?, price=? WHERE id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, product.getName());
		pstmt.setString(2, product.getBrand());
		pstmt.setFloat(3, product.getPrice());
		pstmt.setInt(4, product.getId());
		
		int updateCount = pstmt.executeUpdate();

		if(updateCount > 0)
			System.out.println("Product has been Updated Successfully!");
		else
			System.out.println("Sorry! But Product could not be Updated!");


	}

	@Override
	public void delete(Product product) throws SQLException {
		
		String sql = "DELETE FROM Product1 WHERE id=?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, product.getId());
				
		int updateCount = pstmt.executeUpdate();

		if(updateCount > 0)
			System.out.println("Product has been Deleted Successfully!");
		else
			System.out.println("Sorry! But Product could not be Deleted!");

	}

}
