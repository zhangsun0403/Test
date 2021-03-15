package Main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class poxxx implements InvocationHandler {

    Object asc;
    public poxxx(Object asc) {
        this.asc=asc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("--------------------");
        Object invoke = method.invoke(asc, args);


        return 30;
    }
}
