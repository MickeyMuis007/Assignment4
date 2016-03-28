package Services.Impl;

import Services.Feedable;
import Services.Workable;

/**
 * Created by student on 2016/03/28.
 */
public class SuperWorker implements Feedable, Workable {
    private String name;


    public SuperWorker() {
    }

    public SuperWorker(String name) {
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
