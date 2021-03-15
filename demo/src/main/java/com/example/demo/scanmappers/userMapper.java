package com.example.demo.scanmappers;

import com.example.demo.Entity.authorities;
import com.example.demo.Entity.users;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public interface userMapper {

    List<users> select(String username);

    void insert(users users);
}
