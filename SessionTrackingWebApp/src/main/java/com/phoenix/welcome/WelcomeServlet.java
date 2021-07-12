/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 23th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("uname");
		
		// Get HttpSession
		HttpSession session = request.getSession();
				
		// Set Session Timeout
		// session.setMaxInactiveInterval(3);
		
		// Get Session id of WelcomeServet
		System.out.println("Session id of WelcomeServlet : " + session.getId());
		
		// Store Client's Data
		session.setAttribute("user", user);
		
		//  Encode url using URL rewriting
		String url = response.encodeURL("products");
		
		PrintWriter out = response.getWriter();
		
		out.println("<body style = 'background: skyblue;'>" + "<h2 style = 'text-align: center;'>" + " Hey "+ user + ", Welcome to the Flipkart </h2>" + "</body>");
		
		// Display Session Time out
		out.println("<h3> Session Time Out : " + session.getMaxInactiveInterval() + "</h3>");
		
		// Link to the ProductServlet
		out.println("<h2> So for go to the shopping <a href='"+ url +"'> Click </a> </h2>");
				
		
		
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
