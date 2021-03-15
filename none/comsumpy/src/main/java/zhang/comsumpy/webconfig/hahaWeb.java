package zhang.comsumpy.webconfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class hahaWeb {

    @Bean
    @LoadBalanced
    public RestTemplate RestTemplate(){

        return new RestTemplate();
    }
}
