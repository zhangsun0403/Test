package zhang.stream001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zhang.stream001.stream.daoImpl;

import javax.annotation.Resource;

@RestController
public class hello {

    @Resource
    private daoImpl daoImpl;

    @GetMapping("/send")
    public String sendMessage(){
        daoImpl.send();
        return null;
    }
}
