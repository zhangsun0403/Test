package zhang.huancun.durid;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;


@Component
public class shengchengqi implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {

        String name = method.getName();
        String s = Arrays.asList(params).toString();
        String name1 = target.getClass().getName();
        return name+s+name1;
    }
}
