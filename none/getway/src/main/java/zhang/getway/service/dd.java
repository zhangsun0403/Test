package zhang.getway.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class dd {


    @GetMapping("/test")
    public String ddname(){

        return "success";
    }
}
