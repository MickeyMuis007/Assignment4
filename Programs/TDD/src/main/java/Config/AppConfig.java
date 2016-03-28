package Config;

import Domain.Dad;
import Domain.Person;
import Domain.Son;
import Services.Impl.Circle;
import Services.Impl.Triangle;
import Services.Shape;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by student on 2016/03/28.
 */
@Configurable
public class AppConfig {
    @Bean(name = "Circle")
    public Shape getCircle(){
        return new Circle();
    }
    @Bean(name = "Triangle")
    public Shape getTriangle(){
        return new Triangle();
    }
    @Bean(name = "Dad")
    public Dad getDad(){
        return new Dad();
    }
    @Bean(name = "Son")
    public Son getSon(){
        return new Son();
    }
    @Bean(name = "Person")
    public Person getPerson(){
        return new Person();
    }

}
