package zhang.hys001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zhang.hys001.openFeign.serviceImpl;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class hello {


    @Resource
    private serviceImpl serviceImpl;

    @GetMapping("/controller")
    public String helloController(@RequestParam("id") Integer id){

        String name = serviceImpl.name(id);

        return name;
    }
}
