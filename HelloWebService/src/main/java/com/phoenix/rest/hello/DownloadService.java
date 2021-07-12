/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 28th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.rest.hello;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/downloads")
public class DownloadService {
	
	@GET
	@Path("/textfile")
	@Produces("text/plain")
	public Response getTextFile() {
		
		File file = new File("/home/sterlite/Bin/binFile");
		
		return Response.ok(file).header("Content-Disposition", "attachment; filename='hello_client.txt'").build();
				
	}
	
	@GET
	@Path("/odt")
	@Produces("application/odt")
	public Response getPdfFile() {
		
		File file = new File("/home/sterlite/Bin/binFIle.odt");
		
		return Response.ok(file).header("Content-Disposition", "attachment; filename='hello_client.odt'").build();
		
	}
	
	@GET
	@Path("/photo")
	@Produces("image/jpg")
	public Response getImage() {
		
		File file = new File("/home/sterlite/Bin/margueriteFlower.jpg");
		
		return Response.ok(file).header("Content-Disposition", "attachment; filename='hello_client.jpg'").build();
		
	}
}
