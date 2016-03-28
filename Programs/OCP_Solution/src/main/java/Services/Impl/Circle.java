package Services.Impl;

import Services.Shape;

/**
 * Created by student on 2016/03/27.
 */
public class Circle implements Shape{
   private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
       return radius * radius * 3.14;
   }
}
