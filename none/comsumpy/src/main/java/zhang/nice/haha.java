package zhang.nice;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class haha {


    @Bean
    public IRule IRule(){

        return new niub();
    }

//    @Bean
//    public RoundRobinRule ddd(){
//
//        return new RoundRobinRule();
//    }
}
