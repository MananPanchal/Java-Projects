/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 23th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("passwd");
		
		PrintWriter out = response.getWriter();
		out.println("<h1> </h1>");
		
		if(uname != null && password != null && uname.equals("John") && password.equals("John123")) {	
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);			
		}
		
		else {						
			out.println("<h4 style = 'color: red; text-align: center;'> Invalid Login! Plz Try Again!! </h4>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);					
		}
		
		out.close();
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
