package Domain;

/**
 * Created by student on 2016/03/28.
 */
public class Dad extends Person {
    protected String sing;
    protected int dependence;

    public Dad() {
    }

    public Dad(String name,int age, String sing) {
        this.name = name;
        this.age = age;
        this.sing = sing;
    }

    public Dad(String name, int age, String sing, int dependence) {
        this.name = name;
        this.age = age;
        this.sing = sing;
        this.dependence = dependence;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public int getDependence() {
        return dependence;
    }

    public void setDependence(int dependence) {
        this.dependence = dependence;
    }
}
