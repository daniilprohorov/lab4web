package lol;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloWorld {
    public String getMessage(){
        return "HELLO WORLD";
    }
}
