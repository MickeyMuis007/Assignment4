package Domain;

import Services.AWorker;
import Services.Impl.Worker;

/**
 * Created by student on 2016/03/27.
 */
public class Manager {
    private String title;
    private String id;
    AWorker worker;

    public Manager() {
        title = "Manager";
        id = "";
    }

    public void setWorker(AWorker w){
        worker = w;
    }

    public String manage(){
        return title + " manage " + worker.work();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
