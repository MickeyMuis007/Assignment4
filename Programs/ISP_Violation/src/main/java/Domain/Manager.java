package Domain;

import Services.IWorker;

/**
 * Created by student on 2016/03/28.
 */
public class Manager {
    IWorker worker;
    private String name;

    public Manager() {
        name = null;
        worker = null;
    }

    public Manager(String name) {
        this.name = name;
    }

    public void setWorker(IWorker w){
        worker = w;
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
