package hello.world.commpent;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspectMs {

    @Pointcut(value = "execution(* hello.world.commpent.beforeMs.before(..))")
    public void dd(){

    }


    @Before(value = "dd()")
    public void hhaa(){

        System.out.println("------------------");
    }
}
