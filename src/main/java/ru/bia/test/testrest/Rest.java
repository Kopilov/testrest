package ru.bia.test.testrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("webresourceaccess")
public class Rest {

    @GET
    @Produces("text/html")
    public String getString() {
        return "hello rest";
    }
}
