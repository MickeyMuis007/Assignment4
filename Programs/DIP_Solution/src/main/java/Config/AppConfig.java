package Config;

import Services.AWorker;
import Services.Impl.SuperWorker;
import Services.Impl.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/27.
 */
@Configuration
public class AppConfig {
    @Bean(name = "SuperWorker")
    public AWorker getSuperWorker(){
        return new SuperWorker();
    }
    @Bean(name = "Worker")
    public AWorker getWorker(){
        return new Worker();
    }
}
