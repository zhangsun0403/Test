package hello.world.webconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = {"hello.world.commpent"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class haha {


}
