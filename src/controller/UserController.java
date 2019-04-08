package controller;

import beans.UserBean;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Stateless
@LocalBean
public class UserController {
    @EJB
    private UserBean userBean;

    @Path("/create")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public String createUser(@QueryParam("username") String username,
                             @QueryParam("password") String password){
//        return userBean.createUser(username, password);;
        return userBean.createUser("123", "321");
    }

}
