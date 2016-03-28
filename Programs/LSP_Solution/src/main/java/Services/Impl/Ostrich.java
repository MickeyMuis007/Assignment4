package Services.Impl;

import Services.Bird;
import Services.NonFlyingBirds;

/**
 * Created by student on 2016/03/27.
 */
public class Ostrich implements NonFlyingBirds{
    private final String type = "Ostrich";
    public String eat(){
        return type + " eating";
    }
    public String walk(){
        return type + " walking";
    }

    public String getType() {
        return type;
    }
}
