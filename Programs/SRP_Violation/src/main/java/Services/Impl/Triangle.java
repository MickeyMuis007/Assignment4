package Services.Impl;

import Domain.DrawingShapes;
import Services.Shape;

/**
 * Created by student on 2016/03/26.
 */
public class Triangle implements Shape{


    public DrawingShapes draw(){

        DrawingShapes shape = new DrawingShapes();
        shape.setType("Triangle");
        return shape;
    }

    public void setColor(DrawingShapes shapes, String color) {
        shapes.setColor(color);
    }
}
