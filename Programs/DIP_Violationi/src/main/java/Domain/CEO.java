package Domain;

/**
 * Created by student on 2016/03/27.
 */
public class CEO {
    private String title;
    private String id;

    public CEO() {
        title = "CEO";
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
