/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.db;

import java.sql.Connection;
import java.sql.SQLException;

public class OracleConnection {
	
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
		
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "hr";
		
		return DBConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
		
	}

}
