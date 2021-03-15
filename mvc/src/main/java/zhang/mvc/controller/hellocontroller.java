package zhang.mvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zhang.mvc.Entity.users;

import javax.validation.Valid;

@RestController
public class hellocontroller {

    @GetMapping("/a")
    public users nameaa(@Valid users users){


        return users;
    }
}
