<!-- 

/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 25th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body bgcolor="skyblue">

	<%@ include file="header.html" %>

	<%
		HttpSession ss = request.getSession(false);
		
		if(ss != null){ %>
			
			<h2 style="text-align: center;"> Welcome <em style="color: purple;"> <%= ss.getAttribute("user") %> </em>  , Purchase the Products that you want! </h2>
			
	<%	}
		else{ %>
		
			<h2 style="text-align: center; color: red"> Sorry! Your Session is Expired! </h2>
	
	<%	}	%>

	<%@ include file="footer.html" %>
	
</body>
</html>