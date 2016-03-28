package Config;

import Services.Impl.Circle;
import Services.Impl.Rectangle;
import Services.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/27.
 */
@Configuration
public class AppConfig {
    @Bean(name = "Rectangle")
    public Shape getRectangle(){
        return new Rectangle();
    }
    @Bean(name = "Circle")
    public Shape getCircle(){
        return new Circle();
    }
}
