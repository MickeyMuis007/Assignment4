package Config;

import Services.Impl.ShapeColor;
import Services.Impl.Square;
import Services.Impl.Triangle;
import Services.Shape;
import org.springframework.context.annotation.Bean;

/**
 * Created by student on 2016/03/26.
 */
public class AppConfig {
    @Bean(name = "Triangle")
    public Shape getTraingle(){
        return new Triangle();
    }
    @Bean(name = "Square")
    public Shape getSquare(){
        return new Square();
    }
    @Bean(name = "ShapeColor")
    public ShapeColor getShapeColor(){
        return new ShapeColor();
    }
}
