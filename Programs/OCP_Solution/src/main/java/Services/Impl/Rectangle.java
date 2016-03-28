package Services.Impl;

import Services.Shape;

/**
 * Created by student on 2016/03/27.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

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
        return width * height;

    }
}
