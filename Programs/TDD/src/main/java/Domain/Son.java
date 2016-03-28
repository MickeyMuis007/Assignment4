package Domain;

/**
 * Created by student on 2016/03/28.
 */
public class Son extends Dad {
    protected String dance;

    public Son() {
    }

    public Son(String name, int age, String sing, String dance) {
        super(name, age, sing);
        this.dance = dance;
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }
}
