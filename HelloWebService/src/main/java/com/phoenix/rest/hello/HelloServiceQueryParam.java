/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 28th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/helloquery")
public class HelloServiceQueryParam {
	
	@GET
	@Path("/greet")
	@Produces("text/plain")
	public String greetUser(@QueryParam("nm") String name) {
		return "Hello " + name;
	}

	@GET
	@Path("/user")
	@Produces("text/html")
	public Response greetUserWithResponse(@QueryParam("nm") String name) {
		return Response.status(200).entity("<body> <h1> Hello User: " + name + "</h1> </body>").build();
	}
	
	@GET
	@Path("/date")
	@Produces("text/html")
	public Response getDate(@QueryParam("dd") int day, @QueryParam("mm") int month, @QueryParam("yy") int year) {
		return Response.status(200).entity("<body> <h2> Date is : " + LocalDate.of(year, month, day) + "</h2> </body>").build();
	}

}
