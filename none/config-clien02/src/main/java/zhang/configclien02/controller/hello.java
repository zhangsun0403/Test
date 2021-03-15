package zhang.configclien02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class hello {

    @Value("${config.info}")
    private String github;

    @GetMapping("/github")
    public String helloGithub(){

        return github;
    }
}
