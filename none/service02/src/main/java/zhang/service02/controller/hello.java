package zhang.service02.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class hello {



    @Value("${server.port}")
    private String port;

    private Random r=new Random();
    @GetMapping("/name/{id}")
    @HystrixCommand(fallbackMethod ="getName",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "3000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "10")

    })
    public String name(@PathVariable("id") Integer id,HttpServletRequest request,String red) throws InterruptedException {



        TimeUnit.SECONDS.sleep(r.nextInt(3));



        return red+"..............success..."+"    ";

    }

    public String getName(Integer id,HttpServletRequest request,String red){


        return "     /name的回退方法......."+red;
    }
}
