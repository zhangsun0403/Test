package webMVC;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class hellozjk {


    @ExceptionHandler
    @ResponseBody
    public String name(RuntimeException ex){
        System.out.println(ex);

        return "yichang****";
    }
}
