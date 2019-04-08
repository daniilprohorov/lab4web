package beans;



import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import entity.User;

import java.awt.*;

@Stateless
public class UserBean {

    @PersistenceContext(unitName = "test")
    private EntityManager em;


    public String createUser(String username, String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        try {
//            em.getTransaction().begin();
            em.persist(user);
//            em.getTransaction().commit();
//            em.close();
            return "lol";
        }
        catch (Exception e)  {
            return e.toString();
        }
//        return "lol";
    }
}
