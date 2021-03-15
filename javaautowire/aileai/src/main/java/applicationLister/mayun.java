package applicationLister;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;


public class mayun implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        if(bean instanceof first){
            first first=(first)bean;
            Field sss = null;
            try {
                sss = first.getClass().getDeclaredField("sss");

            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            String value = sss.getAnnotation(zhang.class).value();

            first.setSss(value);



        }
        return bean;
    }
}
