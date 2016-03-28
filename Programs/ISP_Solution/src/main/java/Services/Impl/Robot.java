package Services.Impl;

import Services.Workable;

/**
 * Created by student on 2016/03/28.
 */
public class Robot implements Workable {
    public String name;

    public Robot() {
        name = "";
    }


    public Robot(String name) {
        this.name = name;
    }

    public String work() {
        return name + " working";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
