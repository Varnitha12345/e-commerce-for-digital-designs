package lk.jiat.web.ecommerce.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/contact")
public class ContactController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/contact");
    }
}
