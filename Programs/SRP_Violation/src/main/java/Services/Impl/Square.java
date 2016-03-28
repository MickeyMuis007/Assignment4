package Services.Impl;

import Domain.DrawingShapes;
import Services.Shape;

/**
 * Created by student on 2016/03/26.
 */
public class Square implements Shape{

    public DrawingShapes draw(){
        DrawingShapes shape = new DrawingShapes();
        shape.setType("Square");
        return shape;
    }
    public void setColor(DrawingShapes shape, String color){
        shape.setColor(color);
    }
}
