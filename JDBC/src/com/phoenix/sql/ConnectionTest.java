/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.sql;

import java.sql.Connection;
import java.sql.SQLException;

import com.phoenix.dbconfig.DatabaseConfig;

public class ConnectionTest {

	public static void main(String[] args) {
		
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "hr";
		Connection con = null;
		
		try {
			con = DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
			System.out.println("Database Connection is Established!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
