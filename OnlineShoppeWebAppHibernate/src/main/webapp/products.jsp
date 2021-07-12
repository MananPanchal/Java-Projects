<!-- 

/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" import="java.util.List,com.phoenix.data.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<style type="text/css">
	table{
		border-collapse: collapse;
	}
	.th{
		border: 2px solid black;
		padding: 15px;
	}
	.td{
		border: 1px solid black;
		padding: 10px;
	}
	
</style>
</head>
<body bgcolor="skyblue">

	<%@ include file="header.html" %>

	<%
		HttpSession ss = request.getSession(false);
		
		if(ss != null){ %>
			
			<h2 style="text-align: center;"> Welcome <em style="color: purple;"> <%= ss.getAttribute("user") %> </em>  , Purchase the Products that you want! </h2>
			
			<% List<Product> products = (List<Product>)ss.getAttribute("products"); %>
			
			<div class="container" style="padding-left: 30%">
				<table style="text-align: center;" border="3px solid black">
					<tr class="tr">
						<th class="th"> Product Id </th>
						<th class="th"> Name </th>
						<th class="th"> Brand </th>
						<th class="th"> Price </th>
					</tr>
					
					<% for(Product product: products) { %>
						<tr class="tr"> 
							<td class="td"> <%= product.getId() %> </td>
							<td class="td"> <%= product.getName() %> </td>
							<td class="td"> <%= product.getBrand() %> </td>
							<td class="td"> <%= product.getPrice() %> </td>
						</tr>
					<% } %>
				</table>
			</div>
			
	<%	}
		else{ %>
		
			<h2 style="text-align: center; color: red; margin-bottom: 25%"> Sorry! Your Session is Expired! </h2>
	
	<%	}	%>

	<%@ include file="footer.html" %>
	
</body>
</html>