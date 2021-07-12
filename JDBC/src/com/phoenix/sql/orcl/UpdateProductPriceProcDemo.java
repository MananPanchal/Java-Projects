/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.sql.orcl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.phoenix.dbconfig.OracleConnection;

public class UpdateProductPriceProcDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			con = OracleConnection.getOracleConnection();
			
			CallableStatement cstmt = con.prepareCall("{call update_product_price(?,?)}");
			cstmt.setInt(1, 3001);
			cstmt.setFloat(2, 2000.00f);
			
			cstmt.execute();
			
			System.out.println("PL/SQL Stored Procedure executed successfully!!");
			
			
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
