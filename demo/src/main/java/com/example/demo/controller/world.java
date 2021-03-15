package com.example.demo.controller;

import com.example.demo.Entity.authorities;
import com.example.demo.Entity.users;
import com.example.demo.dao.Usersdao;
import com.example.demo.dao.authoritiesdao;
import com.example.demo.scanmappers.authoritiesMapper;
import com.example.demo.scanmappers.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class world {

    @Autowired
    private authoritiesdao authoritiesdao;

    @Autowired
    private Usersdao Usersdao;


    @RequestMapping("/success")
    public String name(){

        return "success";
    }
    @GetMapping(value = {"/","/login"})
    public String namess(){

        return "index";
    }
    @RequestMapping("/yichang")
    public String string(){

        return "yichang";
    }

    private authorities a=new authorities();
    private String authority="pp";
    @RequestMapping("/haole")  //注册....
    public String haole(users users, Model m){


        String s = Usersdao.dataInsert(users);


        a.setUsername(users.getUsername());
        a.setAuthority(authority);
        String s1 = authoritiesdao.dataInsert(a);
        m.addAttribute("dataInsert",s+":::"+s1);


        return "haole";
    }

    @RequestMapping("/test/name")
    public String testName(){

        return "haole";
    }

    @RequestMapping("/logout/sname")
    public String ssooo(){

        return "logout";
    }

}
