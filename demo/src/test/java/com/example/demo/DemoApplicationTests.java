package com.example.demo;

import com.example.demo.Entity.authorities;
import com.example.demo.Entity.users;
import com.example.demo.scanmappers.authoritiesMapper;
import com.example.demo.scanmappers.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	userMapper userMapper;

	@Autowired
	authoritiesMapper authoritiesMapper;

	@Test
	void contextLoads() {

		List<users> select = userMapper.select("123");
		System.out.println(Arrays.toString(select.toArray()));

	}
	@Test
	void contextLoaddds() {

		List<authorities> select = authoritiesMapper.select("123");
		System.out.println(Arrays.toString(select.toArray()));
	}

}
