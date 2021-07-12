/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserAlreadyExistException;
import com.phoenix.web.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService {

	private LoginDao ld;
	
	public LoginServiceImpl() {
	
		ld = new LoginDaoImpl();
		
	}
	
	@Override
	public List<User> findAll() throws ServiceException {
		
		try {
			return ld.getAllUsers();
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public User findUserById(String username) throws UserNotFoundException {
		
		try {
			return ld.getUserById(username);
		} catch (SQLException e) {
			throw new UserNotFoundException(e.getMessage());
		}
	}

	@Override
	public void add(User user) throws UserAlreadyExistException{
		
		try {
			ld.insert(user);
		} catch (SQLException e) {
			throw new UserAlreadyExistException(e.getMessage());
		}
	}

	@Override
	public void edit(User user) throws ServiceException {

		try {
			ld.update(user);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void remove(User user) throws ServiceException {
		
		try {
			ld.delete(user);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
		
	}

	
	@Override
	public String changePassword(String newPassword) throws ServiceException {
		
		try {
			User user = new User();
			user.setPassword(newPassword);
			ld.update(user);
			return "Password has been Updated Successfully!";
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		
	}

}
