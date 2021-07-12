/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;

public interface LoginDao {
	
	// CRUD Methods
	List<User> getAllUsers() throws SQLException;
	User getUserById(String username) throws SQLException;
	void insert(User user) throws SQLException;
	void update(User user) throws SQLException;
	void delete(User user) throws SQLException;
	
}
