package com.example.demo.scanmappers;

import com.example.demo.Entity.authorities;
import com.example.demo.Entity.users;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface authoritiesMapper {

    List<authorities> select(String username);

    void insert(authorities users);
}
