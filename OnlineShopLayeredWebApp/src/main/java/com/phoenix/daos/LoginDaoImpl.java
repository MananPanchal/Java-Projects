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

import com.phoenix.data.User;
import com.phoenix.db.OracleConnection;

public class LoginDaoImpl implements LoginDao{

	
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
	public User getUserById(String username) throws SQLException { 
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM login WHERE username=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		}
		else
			return null;
	}

	@Override
	public List<User> getAllUsers() throws SQLException {
		
		String sql = "SELECT * FROM login";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<User> users = new ArrayList<User>();
		while(rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			users.add(user);
		}
		return users;
	}

	@Override
	public void insert(User user) throws SQLException {
		
		String sql = "INSERT INTO login (username, password) VALUES (?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		int updateCount = pstmt.executeUpdate();
		if(updateCount > 0)
			System.out.println("New User added Successfully!");
		else
			System.out.println("Sorry! User could not be Created!!");
		
	}

	@Override
	public void update(User user) throws SQLException {
		
		String sql = "UPDATE login SET password = ? WHERE username = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getUsername());
		int updateCount = pstmt.executeUpdate();
		if(updateCount > 0)
			System.out.println("User's Password Updated Successfully!");
		else
			System.out.println("Sorry! User's Password could not be Updated!!");
		
		
	}

	@Override
	public void delete(User user) throws SQLException {

		String sql = "DELETE FROM login WHERE username=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		int updateCount = pstmt.executeUpdate();
		if(updateCount > 0)
			System.out.println("User Deleted Successfully!");
		else
			System.out.println("Sorry! User could not be Deleted!!");
		
	}

}

	