package Services;

/**
 * Created by student on 2016/03/27.
 */
public class Rectangle {

    public Rectangle(double a, double b)
    {
        height = b;
        width = a;
    }

    public Rectangle() {
    }

    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return height * width;
    }
    private double height;

}
