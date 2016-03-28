package Services;


import java.util.ArrayList;

/**
 * Created by student on 2016/03/27.
 */
public class AreaCaclculator {

    public double area(ArrayList shapes){
        double area = 0;
        for ( int i = 0; i < shapes.size();i++){
            if(shapes.get(i).getClass().equals(Rectangle.class)) {
                Rectangle rectangle = (Rectangle)shapes.get(i);
                area += rectangle.area();
            }
            else
            {
                Circle circle = (Circle)shapes.get(i);
                area += circle.area();
            }
        }
        return area;
    }
}
