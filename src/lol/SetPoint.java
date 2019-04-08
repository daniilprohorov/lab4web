package lol;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/points")
@Stateless
@LocalBean
public class SetPoint {
    @EJB
    private PointBean pb;

    @Path("/setpoint")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.TEXT_HTML})
    public String lol(@QueryParam("x") double x, @QueryParam("y") double y, @QueryParam("r") double r) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
//        double X = Double.parseDouble(x);
//        double Y = Double.parseDouble(y);
//        double R = Double.parseDouble(r);
//        return x+y+r;
        return pb.setPoint(x, y, r);
    }
}
