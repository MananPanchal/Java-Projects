/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 23th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.products;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		// Retrieve HttpSession or no session
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			
			String user = (String) session.getAttribute("user");
			
			// Get Session id of ProductServlet
			System.out.println("Session id of ProductServlet : " + session.getId());
			
			
			out.println("<body style = 'background: skyblue;'>" + "<h2 style = 'text-align: center;'>" + " Hey "+ user + ", Purchase Products that you want! </h2> </body>");
						
		}
		else
			out.println("<body style = 'background: skyblue;'>" + "<h2 style = 'text-align: center;'>" + "Sorry, There is No Session! </h2> </body>");
		
		
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
