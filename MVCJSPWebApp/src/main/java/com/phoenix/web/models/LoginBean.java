/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 25th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.web.models;

public class LoginBean {
	
	private String username;
	private String password;
	
	// Setter - Getter Methods
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Logic
	public boolean isValid() {
		
		if(username != null && password != null && username.equals("John") && password.equals("John123"))
			return true;
		else
			return false;
		
	}
	
	

}
