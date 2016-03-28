package Services.Impl;

import Services.AWorker;

/**
 * Created by student on 2016/03/27.
 */
public class SuperWorker implements AWorker {
    private String title;
    private String id;

    public SuperWorker() {
        title = "SuperWorker";
        id = "";
    }

    public String work(){
        return title + " working";
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
