package Services.Impl;

import Services.IWorker;

/**
 * Created by student on 2016/03/28.
 */
public class Robot implements IWorker {
    private String name;

    public Robot() {
        name = null;
    }

    public Robot(String name) {
        this.name = name;
    }

    public String work() {
        return name + " working";
    }

    public String eat() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
