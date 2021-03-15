package webconfzjk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"controller"})
@EnableWebMvc
public class configyear {

    @Bean
    public CommonsMultipartResolver multipartResolver(){

        return new CommonsMultipartResolver();
    }


}
