package Aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspestjZjk {

//    @After(value = "execution(public Integer Aop.AopInterface.dds(Integer))&&args(money)")
//    @Before("zjk()")
    @Autowired
    Abcd aaa;

    @Around(value = "execution(public Integer Aop.AopInterface.dds(..))")
    public void haha(ProceedingJoinPoint ps) throws Throwable {
        System.out.println("还好吧----");
        ((a)aaa).dd();
        Object proceed = ps.proceed();
        System.out.println(1236454);

    }
    @DeclareParents(value ="Aop.AopInterface+",defaultImpl = b.class)
    public static a a;

    @Pointcut(value = "within(Aop..*)&&this(a)")
    public void zjk(a a){
        a.dd();
        System.out.println(1233);
    }






    public Integer dds(Integer money) {
        System.out.println("--------------AOP");
        return money;
    }
}
