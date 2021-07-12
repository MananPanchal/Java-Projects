<!-- 

/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 25th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

 -->

<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<jsp:setProperty property="username" name="ob" param="uname"/>
<jsp:setProperty property="password" name="ob" param="passwd"/>


<%
	// Logic
	
	if(ob.isValid()) { %>
		<jsp:forward page="welcome.jsp">
			<jsp:param value="Java" name="James Gosling"/>
			<jsp:param value="Python" name="Guido Van Rossum"/>
		</jsp:forward>
	
<%	}
	else{ %>
		<h2 style="color:red;text-align: center;"> Invalid Login! Plz Try Again </h2>
		<jsp:include page="/login.html"/>
		
<%	}

%>
