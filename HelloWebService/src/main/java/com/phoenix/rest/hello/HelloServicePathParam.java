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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/helloparam")
public class HelloServicePathParam {
	
	@GET
	@Path("/{nm}")
	@Produces("text/plain")
	public String greetUser(@PathParam("nm") String name) {
		return "Hello " + name;
	}

	@GET
	@Path("/user/{nm}")
	@Produces("text/html")
	public Response greetUserWithResponse(@PathParam("nm") String name) {
		return Response.status(200).entity("<body> <h1> Hello User : " + name + "</h1> </body>").build();
	}

	@GET
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces("text/html")
	public Response getDate(@PathParam("dd") int day, @PathParam("mm") int month, @PathParam("yy") int year) {
		ResponseBuilder builder = Response.status(200);
		builder = builder.entity("<body> <h2> Date is : " + LocalDate.of(year, month, day) + "</h2> </body>");
		Response res = builder.build();
		return res;
	}
}
