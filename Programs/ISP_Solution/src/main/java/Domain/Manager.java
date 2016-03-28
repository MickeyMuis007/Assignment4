package Domain;

import Services.Workable;

/**
 * Created by student on 2016/03/28.
 */
public class Manager {
    private String name;
    private Workable worker;
    public Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }

    public void setWorker(Workable worker) {
        this.worker = worker;
    }
    public String manage(){
        return name + " manage " + worker.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
