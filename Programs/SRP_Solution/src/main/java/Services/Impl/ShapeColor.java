package Services.Impl;

import Domain.DrawingShape;
import Services.Color;

/**
 * Created by student on 2016/03/26.
 */
public class ShapeColor implements Color{
    public void setShapeColor(DrawingShape shape, String color){
        shape.setColor(color);
    }

}
