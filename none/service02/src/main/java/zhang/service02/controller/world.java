package zhang.service02.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class world {

    @ExceptionHandler(Exception.class)
    public String hah(Exception ex){

        System.out.println("....");
        return "..............................";
    }

}
