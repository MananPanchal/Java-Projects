
/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 28th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */
package com.phoenix.rest.hello;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {
	
	@POST
	@Path("/add")
	@Produces("text/html")
	public Response addProfile(@FormParam("name") String name, @FormParam("age") int age, @FormParam("city") String city) {
		return Response.status(200).entity("<body bgcolor=skyblue> <h3 style='text-align: center;'> User Profile is Created Successfully <br>" + "Name : " + name + "<br> Age : " + age + "<br> City : " + city + "</h3> </body>").build();
	}

}
