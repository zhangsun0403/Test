package zhang.service01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class hello {


    @Value("${server.port}")
    private String port;
    @GetMapping("/name")
    public String name() throws InterruptedException {


        TimeUnit.SECONDS.sleep(3);

        return port+"..............";

    }
}
