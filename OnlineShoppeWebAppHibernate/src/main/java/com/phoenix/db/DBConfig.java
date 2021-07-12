/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	
	public static Connection getConnection(String jdbcDriver, String jdbcUrl, String dbUser, String dbPassword) throws ClassNotFoundException, SQLException {
		
		// Load JDBC Driver 
		Class.forName(jdbcDriver);
		System.out.println("JDBC Driver is Loaded!");
		
		// Establish  Database Connection
		return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
	}
}
