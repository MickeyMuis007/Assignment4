package Services.Impl;

import Services.Bird;

/**
 * Created by student on 2016/03/27.
 */
public class Ostrich implements Bird {
    public final String type = "Ostrich";
    public String fly(){
        return type + " don't fly";
    }
    public String eat(){
        return type + " eating";
    }
    public String walk(){
        return type + " walking";
    }
}
