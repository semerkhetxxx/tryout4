package idv.tryout.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import idv.tryout.service.TryoutService;
import idv.tryout.service.TryoutServiceFactory;

@Configuration 
public class Config {   

    @Bean
    public TryoutService tryoutService() {
        return TryoutServiceFactory.getService();
    }

}
