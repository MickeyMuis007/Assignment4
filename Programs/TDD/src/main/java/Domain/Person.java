package Domain;

/**
 * Created by student on 2016/03/28.
 */
public class Person {
    protected String name;
    protected int age;

    public Person() {
    }

    public String walk(){
        return name + " walking";
    }
    public String talk(){
        return name + " talking";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
