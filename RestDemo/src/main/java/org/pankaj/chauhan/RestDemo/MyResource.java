package org.pankaj.chauhan.RestDemo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

	
// Change A	b
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/get/{id}")
    public String getIt(@PathParam("id") long id,@QueryParam("name") String name) {
        return "Got id! "+id+" "+name;
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void postmethod(){
    	
    }
    
}
