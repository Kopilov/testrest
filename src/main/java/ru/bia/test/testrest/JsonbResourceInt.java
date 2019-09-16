package ru.bia.test.testrest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * An example resource utilizing JSONB with array of primitives.
 *
 */
@Path("ints")
@Consumes("application/json")
public class JsonbResourceInt {

    private static List<Integer> ints = new ArrayList<>();

    static {
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
    }

    @Path("all")
    @GET
    @Produces("application/json")
    public List<Integer> getAll() {
        return ints;
    }

    @Path("addAll")
    @POST
    public Response createMultiple(List<Integer> addedInts) {
        ints.addAll(addedInts);
        return Response.ok().build();
    }

}

