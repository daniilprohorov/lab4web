package lol;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class PointBean {
    public String setPoint(double x, double y, double r){
        return Double.toString(x+y+r);
    }
}
