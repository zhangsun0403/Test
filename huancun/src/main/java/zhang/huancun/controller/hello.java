package zhang.huancun.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zhang.huancun.Entity.authorities;
import zhang.huancun.mapperscan.qingchu;


import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class hello {




    @Resource
    private qingchu qingchu;

    @GetMapping("/a/{id}")
    public List<authorities> name(@PathVariable("id") String str){

        List<authorities> select = qingchu.select(str);


        return select;
    }

    @GetMapping("/b/{id}")
    public List<authorities> name11(@PathVariable("id") Integer str){

        List<authorities> selecttt = qingchu.selecttt(str);

        return selecttt;
    }
    @GetMapping("/c/{id}")
    public String name11ss(@PathVariable("id") Integer str){

        String name = qingchu.name(str);

        return name;
    }

    @GetMapping("/d/{id}")
    public String name11sdds(@PathVariable("id") Integer str){

        String name = qingchu.name(str);

        return name;
    }

    @GetMapping("/lalala")
    public String sname(){

        return "20000";
    }

}
