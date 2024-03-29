package ru.bia.test.testrest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * An example resource utilizing JSONB.
 *
 * @author Adam Lindenthal (adam.lindenthal at oracle.com)
 */
@Path("cats")
@Consumes("application/json")
public class JsonbResource {

    private static List<Cat> cats = new ArrayList<>();

    static {
        cats.add(new Cat("Rosa", "semi-british", "tabby", true));
        cats.add(new Cat("Alfred", "semi-british", "ginger", true));
        cats.add(new Cat("Mishan", "british blue", "blue/silver", true));
        cats.add(new Cat("Costa", "common cat", "stracciatella", true));
    }

    @Path("all")
    @GET
    @Produces("application/json")
    public List<Cat> getAll() {
        return cats;
    }


//    @Path("one")
//    @GET
//    @Produces("application/json")
//    public Cat getCat() {
//        return cats.get((int) (Math.round(Math.random() * 3)));
//    }
//
//    @Path("all")
//    @GET
//    @Produces("application/json")
//    public List<Cat> getAll() {
//        return cats;
//    }
//
//    @Path("schroedinger")
//    @GET
//    public String check() {
//        return "The cat is 9x alive!";
//    }
//
//    @Path("add")
//    @POST
//    public Response createCat(Cat cat) {
//        System.out.println("Creating cat.");
//        cats.add(cat);
//        return Response.ok().build();
//    }
//
    @Path("addAll")
    @POST
    public Response createMultiple(List<Cat> addedCats) {
        cats.addAll(addedCats);
        return Response.ok().build();
    }

}

