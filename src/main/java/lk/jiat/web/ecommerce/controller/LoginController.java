package lk.jiat.web.ecommerce.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lk.jiat.web.ecommerce.dto.AuthDTO;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/login")
public class LoginController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/auth/login");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginAction(AuthDTO authDTO){
        System.out.println(authDTO.getEmail());
        return  Response.ok().build();
    }
}
