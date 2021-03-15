package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


public class play implements a{

    @Value("zhangshan")
    private String sanme;

    public String getSanme() {
        return sanme;
    }

    public void play(){
        System.out.println("服务提供者");
    }
}
