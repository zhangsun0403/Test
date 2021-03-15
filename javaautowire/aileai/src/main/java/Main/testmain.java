package Main;

import Aop.Abcd;
import Aop.a;
import Entity.domain;
import Entity.zjkzhang;
import Webconfig.ConfigWeb;
import applicationLister.first;
import applicationLister.zhang;
import org.junit.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class testmain {


    @Test
    public void dd(){


        AnnotationConfigApplicationContext ioc=
                new AnnotationConfigApplicationContext(ConfigWeb.class);
        BeanWrapperImpl bean = ioc.getBean(BeanWrapperImpl.class);
        first bean1 = ioc.getBean(first.class);
        System.out.println(bean1.getSname());
        bean.setBeanInstance(bean1);
        bean.setPropertyValue("sname","zjk");
        System.out.println(bean1.getSname());
//        bean.setPropertyValue("haonanren","zjk");
        PropertyDescriptor getSname = bean.getPropertyDescriptor("sname");
        Method readMethod = getSname.getReadMethod();
        Method writeMethod = getSname.getWriteMethod();
        System.out.println(readMethod);
        System.out.println(writeMethod);
        TypeDescriptor sname = bean.getPropertyTypeDescriptor("sname");



    }

    @Test
    public void haihaoba(){

        AnnotationConfigApplicationContext ioc=
                new AnnotationConfigApplicationContext(ConfigWeb.class);
        first bean = ioc.getBean(first.class);
        System.out.println(bean.getSname());


    }
    @Test
    public void zjkkk(){


        AnnotationConfigApplicationContext ioc=
                new AnnotationConfigApplicationContext(ConfigWeb.class);
        zjkzhang bean = ioc.getBean(zjkzhang.class);
        bean.dd();


    }
    @Test
    public void hjk() throws NoSuchFieldException, IllegalAccessException {
        AnnotationConfigApplicationContext ioc=
                new AnnotationConfigApplicationContext(ConfigWeb.class);
        first bean = ioc.getBean(first.class);
        Field sss = first.class.getDeclaredField("sss");
        String value = sss.getAnnotation(zhang.class).value();
        sss.setAccessible(true);
        sss.set(bean,value);
        String sss1 = bean.getSss();
        System.out.println(sss1);


    }

    @Test
    public void bbb(){
        int length = "50E94BA82737BCA8F30E79B01C99F498".length();
        System.out.println(length);
    }
}
