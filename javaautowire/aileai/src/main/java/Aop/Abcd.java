package Aop;

import applicationLister.first;
import org.springframework.stereotype.Component;

@Component
public class Abcd implements AopInterface{
    @Override
    public  Integer dds(Integer money) {
        System.out.println("我是一个小宝贝，咿呀咿呀---"+money);


        return money;
    }

    @Override
    public void ddss() {
        System.out.println("---------------");

    }

    public void haha(){
        System.out.println("非spring管理的bean");
    }
}
