package zhang.mvc.webconfif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zhang.mvc.lanjieqi.intercept001;

import javax.annotation.Resource;

@Configuration
public class web implements WebMvcConfigurer{

    @Resource
    private intercept001 intercept001;



    @Override
    public void addInterceptors(InterceptorRegistry registry) {



    }




}
