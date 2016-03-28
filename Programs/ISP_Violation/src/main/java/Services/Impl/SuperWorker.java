package Services.Impl;

import Services.IWorker;

/**
 * Created by student on 2016/03/28.
 */
public class SuperWorker implements IWorker {
    private String name;

    public SuperWorker() {
        name = null;
    }

    public SuperWorker(String name) {
        this.name = name;
    }

    public String work() {
        return name + " working";
    }

    public String eat() {
        return name + " eating";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
