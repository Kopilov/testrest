package ru.bia.test.testrest;

import javax.ws.rs.*;
import java.io.IOException;

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

    @GET
    @Produces("application/json")
    public Integer[] getJson(
        @QueryParam("ag") Ints ag
    ) throws IOException {

        System.out.println(ag.toString());

        for (Integer i: ag.iii) {
            System.out.println(i.toString());
        }
        Integer[] result = {1,2,3};
        return result;
    }
}
