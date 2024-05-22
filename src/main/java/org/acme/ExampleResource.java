package org.acme;

import org.jboss.logging.Logger;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
@Path("/testdata")
public class ExampleResource {
	
	private static final Logger LOG = Logger.getLogger(ExampleResource.class);

    @POST
	@Path("/testjson")
    @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
    public String hello(FormData formData) {
		

		 LOG.info("/testdata/testjson call happend");
		 System.out.println("/testdata/testjson call happend");
		 LOG.info("Received data: " + formData.toString());
		System.out.println("Received data: " + formData.toString());

        return "{\"TestDataKey\":\"Test Data Value\"}";
    }
}

