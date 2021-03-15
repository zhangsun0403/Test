package com.example.demo.FilterZhang;

import javax.servlet.*;
import java.io.IOException;

public class there implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("自定义异常过滤器......");
        int i=10/0;
    }
}
