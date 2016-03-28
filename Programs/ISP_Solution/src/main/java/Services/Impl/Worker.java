package Services.Impl;

import Services.Feedable;
import Services.Workable;

/**
 * Created by student on 2016/03/28.
 */
public class Worker implements Workable, Feedable {
    private String name;

    public Worker() {
    }

    public Worker(String name) {
        this.name = name;
    }

    public String eat() {
        return name + " eating";
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
