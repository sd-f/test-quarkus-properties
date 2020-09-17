package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class ExampleResource {


    @ConfigProperty(name = "quarkus.datasource.jdbc.url")
    String bla;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return bla;
    }

}
