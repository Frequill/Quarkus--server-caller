package def;

import def.proxy.TestProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/main")
public class MainResource {

    @RestClient
    TestProxy proxy;

    @GET
    @Path("/testHello")
    @Produces(MediaType.TEXT_PLAIN)
    public Response testHello(){
        String result = proxy.hello();
        System.out.println("TestHello went off!");
        return Response.ok(result).build();
    }




}