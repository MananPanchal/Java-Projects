/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.sql.orcl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.phoenix.dbconfig.OracleConnection;

public class GetEmployeesDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			con = OracleConnection.getOracleConnection();
			
			String sql = "SELECT employee_id, first_name, salary FROM EMPLOYEES";
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int empId = rs.getInt(1);
				String firstName = rs.getString(2);
				float sal = rs.getFloat("salary");
				
				System.out.println("Emp Id : " + empId + "\t First Name : " + firstName + "\t Salary : " + sal);
				
			}
			
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
