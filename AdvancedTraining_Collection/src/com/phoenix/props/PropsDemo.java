/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.props;

import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		props.setProperty("username", "John");
		props.setProperty("password", "John123");
		
		String uname = props.getProperty("username");
		String pwd = props.getProperty("password");
		
		System.out.println(uname);
		System.out.println(pwd);

	}

}
