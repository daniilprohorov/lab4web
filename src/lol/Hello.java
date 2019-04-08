package lol;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Stateless
@LocalBean
public class Hello{
    @EJB private HelloWorld helloWorld;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello() {
        return helloWorld.getMessage();
    }
}
