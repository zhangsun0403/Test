package controller;

import Entity.domain;
import org.springframework.beans.factory.annotation.Autowired;
import service.a;
import service.play;

public class nihaoma {


    play play;

    public nihaoma(play play) {
        this.play=play;
    }

    public void dd(){
        System.out.println(123);
    }
    public void close(){

        play.play();
        System.out.println(play.getSanme());
        System.out.println("销毁----");
    }
}
