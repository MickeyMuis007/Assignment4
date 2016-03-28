package Services.Impl;

import Services.Bird;
import Services.FlyingBird;

/**
 * Created by student on 2016/03/27.
 */
public class Owl implements FlyingBird{
    private final String type = "Owl";
    public String eat(){
        return type + " eating";
    }
    public String walk(){
        return type + " walking";
    }
    public String fly(){
        return type + " flying";
    }
}
