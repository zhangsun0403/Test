package com.example.demo.dao;

import com.example.demo.Entity.authorities;
import com.example.demo.Entity.users;
import com.example.demo.scanmappers.authoritiesMapper;
import com.example.demo.scanmappers.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class authoritiesdao {

    @Autowired
    private authoritiesMapper authoritiesMapper;

    public String dataInsert(authorities authorities ){

        boolean extist = extist(authorities);
        if(!extist){
            authoritiesMapper.insert(authorities);
            return "用户角色设置成功....";
        }


        return "用户已经设置角色...";
    }

    @Cacheable(value = {"mapdd"},key = "#authorities.username")
    public boolean extist(authorities authorities ){
        List<authorities> select = authoritiesMapper.select(authorities.getUsername());
        if(select!=null||select.size()==0){
            return false;
        }
        return true;
    }
}
