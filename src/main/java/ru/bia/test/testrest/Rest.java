package ru.bia.test.testrest;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("webresourceaccess")
public class Rest {

    @GET
    @Produces("text/html")
    @Path("")
    public String getString() {
        return "hello rest\n";
    }

    @GET
    @Produces("text/csv")
    @Path("")
    public String getCsv() {
        return "1,2,3\n";
    }

    @GET
    @Produces("application/json")
    public Integer[] getJson() {
        Integer[] result = {1,2,3};
        return result;
    }
}
