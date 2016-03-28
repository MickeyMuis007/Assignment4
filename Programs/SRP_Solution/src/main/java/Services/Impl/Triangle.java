package Services.Impl;

import Domain.DrawingShape;
import Services.Shape;

/**
 * Created by student on 2016/03/26.
 */
public class Triangle implements Shape{
    public DrawingShape draw(){
        DrawingShape shape = new DrawingShape();
        shape.setType("Triangle");
        return shape;
    }
}
