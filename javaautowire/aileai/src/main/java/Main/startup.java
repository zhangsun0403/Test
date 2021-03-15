package Main;

import Entity.domain;
import Webconfig.ConfigWeb;
import applicationLister.first;
import applicationLister.four;
import applicationLister.trere;
import controller.hellotroller;
import controller.nihaoma;
import org.springframework.beans.BeanWrapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.validation.*;
import service.a;
import service.b;
import service.c;
import sss.fileld;
import sss.haxi;
import sss.heihei;

import java.beans.PropertyEditor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class startup {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        AnnotationConfigApplicationContext ioc=
//                new AnnotationConfigApplicationContext(ConfigWeb.class);
//        DefaultConversionService bean = ioc.getBean(DefaultConversionService.class);
//        System.out.println(bean==null);
//        first beans = ioc.getBean(first.class);
//        String[] beanNamesForType = ioc.getBeanNamesForType(ConversionService.class);
//        System.out.println(Arrays.toString(beanNamesForType));
        zjk o = (zjk) Proxy.newProxyInstance(startup.class.getClassLoader(), new Class[]{zjk.class}, new poxxx(new asc()));
        System.out.println(o.ds());


    }
}
