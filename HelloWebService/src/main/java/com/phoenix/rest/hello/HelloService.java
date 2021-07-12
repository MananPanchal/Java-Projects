/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 28th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		
		return "Hello World in Plain";
		
	}
	
	@GET
	@Path("/html")
	@Produces("text/html")
	public String sayHTMLHello() {
		
		return "<html> <body> <h2> Hello World in HTML </h2> </body> </html>";
		
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public String sayXMLHello() {
		
		return "<?xml version=\"1.0\"?>" + "<hw> Hello World in XML </hw>";
		
	}

}
