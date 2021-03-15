package com.example.demo.dao;

import com.example.demo.Entity.users;
import com.example.demo.scanmappers.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usersdao {


    @Autowired
    private userMapper userMapper;

    @Autowired
    private PasswordEncoder PasswordEncoder;

    public String dataInsert(users users){

        boolean extist = extist(users);
        if(!extist){
            String s=users.getPassword();
            s=PasswordEncoder.encode(s);
            users.setPassword(s);
            userMapper.insert(users);
            return "注册成功....";
        }


        return "用户已经注册...";
    }

    @Cacheable(value = {"map"},key = "#users.username")
    public boolean extist(users users){
        List<users> select = userMapper.select(users.getUsername());
        if(select.size()==0||select==null){
            return false;
        }
        return true;
    }

}
