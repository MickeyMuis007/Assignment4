package Config;

import Services.Bird;
import Services.Impl.Crow;
import Services.Impl.Ostrich;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/27.
 */
@Configuration
public class AppConfig {
    @Bean(name = "Ostrich")
    public Bird getOstrich(){
        return new Ostrich();
    }
    @Bean(name = "Crow")
    public Bird getCrow(){
        return new Crow();
    }
}
