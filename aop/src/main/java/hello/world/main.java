package hello.world;

import hello.world.commpent.beforeMs;
import hello.world.commpent.cos;
import hello.world.webconfig.haha;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {

        ApplicationContext ioc=new AnnotationConfigApplicationContext(haha.class);
        beforeMs bean = ioc.getBean(beforeMs.class);
        bean.before();
    }
}
