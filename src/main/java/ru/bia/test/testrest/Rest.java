package ru.bia.test.testrest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.JSONP;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.util.List;

@Path("webresourceaccess")
public class Rest {

    @GET
    @Produces("text/html")
    public String getString() {
        return "hello rest\n";
    }

    @GET
    @Produces("text/csv")
    public String getCsv() {
        return "1,2,3\n";
    }

    @Path("add")
    @GET
    //@JSONP
//    @Produces("application/json")
    public Integer[] getJson(
        @QueryParam("ag") Ints ag
    ) throws IOException {

        //Jsonb jsonb = JsonbBuilder.create();
//
        System.out.println(ag.toString());

        for (Integer i: ag.iii) {
            System.out.println(i.toString());
        }
        Integer[] result = {1,2,3};
        return result;
    }
}
