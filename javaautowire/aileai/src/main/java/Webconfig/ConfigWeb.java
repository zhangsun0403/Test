package Webconfig;

import Entity.zjkzhang;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.annotation.*;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.theme.FixedThemeResolver;
import org.springframework.web.servlet.theme.SessionThemeResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import sss.heihei;
import applicationLister.first;
import applicationLister.four;
import applicationLister.trere;
import applicationLister.two;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import webMVC.LanJiqi;
import webMVC.MvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"Aop","webMVC","applicationLister"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import(value ={MvcConfigurer.class, zjkzhang.class} )
public  class ConfigWeb {



    @Bean
    public ResourceBundleThemeSource themeSource(){
        ResourceBundleThemeSource m=new ResourceBundleThemeSource();
        m.setBasenamePrefix("theme.");

        return m;
    }
    @Bean
    public FixedThemeResolver themeResolver(){
        FixedThemeResolver c=new FixedThemeResolver();
        c.setDefaultThemeName("theme");
        return c;
    }

    @Bean
    public MessageSource messageSource(){

        ResourceBundleMessageSource m=new ResourceBundleMessageSource();
        m.setBasename("il8n/messages");
        return m;
    }

    @Bean
    public trere trere(){

        return new trere("trere");
    }
    @Bean
    public two two(){

        return new two();
    }
    @Bean
    public four four(){
        return new four();
    }

    @Bean
    public heihei heihei(){
        return new heihei();
    }
    @Bean
    public BeanWrapperImpl beanWrapper(){

        return new BeanWrapperImpl();
    }


}
