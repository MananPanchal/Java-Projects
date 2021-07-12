/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Factory Method Class
public class DatabaseConfig {
	
	// Factory Method which returns connection based on database
	public static Connection getConnection(String jdbcDriver, String jdbcUrl, String username, String password) throws SQLException, ClassNotFoundException{
		
		// Load JDBC Driver 
		Class.forName(jdbcDriver);
		System.out.println("JDBC Driver is Loaded!");
		
		// Establish  Database Connection
		return DriverManager.getConnection(jdbcUrl, username, password);
		
	}

}
