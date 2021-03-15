package zhang.consumpy02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zhang.consumpy02.openfeign.Aoliao;

import javax.annotation.Resource;

@RestController
public class helloController {

    @Resource
    Aoliao aoliao;

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Integer id) throws InterruptedException {


        String name = aoliao.name(id);

        return name;
    }
}
