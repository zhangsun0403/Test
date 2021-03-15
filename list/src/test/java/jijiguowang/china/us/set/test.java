package jijiguowang.china.us.set;

import jijiguowang.china.us.Entity.domain;
import org.junit.Test;

import java.util.Random;

public class test {

    @Test
    public void dddd(){

        setup up=new setup();

        Random r=new Random();

        for (int i=0;i<1000;i++){
            up.add(new domain(r.nextInt(5),r.nextInt(3)+""));
        }
        up.BianLi();

    }
}
