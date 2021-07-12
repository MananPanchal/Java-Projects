/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.sql.orcl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.phoenix.dbconfig.OracleConnection;

public class AddProductDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			con = OracleConnection.getOracleConnection();
			
			String sql = "INSERT INTO PRODUCT1 (id, name, brand, price) VALUES (?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 8902);
			pstmt.setString(2, "Laptop");
			pstmt.setString(3, "HP");
			pstmt.setFloat(4, 34500.00f);
			
			int updateCount = pstmt.executeUpdate();
			
			if(updateCount > 0)
				System.out.println("New Product added Successfully!");
			else
				System.out.println("SOrry! Product could not be added!!");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
