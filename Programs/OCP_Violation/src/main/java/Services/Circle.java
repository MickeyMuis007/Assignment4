package Services;

/**
 * Created by student on 2016/03/27.
 */
public class Circle {

    public Circle() {
    }

    public Circle(double r){
        radius = r;

    }
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return radius*radius*3.14;
    }

}
