package controller;

import Entity.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import service.a;
import service.b;
import service.play;

@Component
public class hellotroller {



    @Bean
    @Description("11111111111111")
    public nihaoma nihaoma(play play){

        return new nihaoma(play);
    }

    @Bean
    public a aa(){

        return new b();
    }

    @Bean
    public play play(){

        return new play();
    }


}
