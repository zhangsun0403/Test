package spring.mianshi.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class hello implements ApplicationContextAware{


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
