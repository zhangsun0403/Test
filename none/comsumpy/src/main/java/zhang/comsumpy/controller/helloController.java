package zhang.comsumpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloController {


    private String path="http://service01";

    @Autowired
    RestTemplate RestTemplate;

    @GetMapping("/consumpy")
    public String consumpy(){


        String forObject = RestTemplate.getForObject(path+"/name", String.class);


        return forObject;
    }
}
