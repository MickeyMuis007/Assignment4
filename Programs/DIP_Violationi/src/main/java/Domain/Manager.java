package Domain;

/**
 * Created by student on 2016/03/27.
 */
public class Manager {
    private String title;
    private String id;
    Worker worker;

    public Manager() {
        title = "Manager";
        id = "";
        worker = null;
    }

    public void setWorker(Worker w){
        worker = w;
    }
    public String manage(){
        return title + " manage " + worker.work();
    }
}
