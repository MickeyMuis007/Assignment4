package Services;

import Domain.DrawingShapes;

/**
 * Created by student on 2016/03/26.
 */
public interface Shape {
    public DrawingShapes draw();
    public void setColor(DrawingShapes shape, String color);
}
