package Services.Impl;

import Services.Bird;

/**
 * Created by student on 2016/03/27.
 */
public class Crow implements Bird {
    private final String type = "Crow";
    public String fly(){
        return type + " flying";
    }
    public String eat(){
        return type + " eating";
    }
    public String walk(){
        return type + " walking";
    }
}
