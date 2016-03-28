package Domain;

import Services.Shape;

import java.util.List;

/**
 * Created by student on 2016/03/27.
 */
public class AreaCalculator {
    public double area(List<Shape> shapes){
        double area = 0;
        for(Shape shape: shapes)
        {
            area += shape.area();
        }
        return area;
    }
}
