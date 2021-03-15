package com.example.demo.FilterZhang;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class four implements AuthenticationEntryPoint {
    private  HttpStatus httpStatus;


    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {

        System.out.println(httpStatus.value());
        response.setStatus(httpStatus.value());

    }
    public void dd(HttpServletResponse response){
        System.out.println(httpStatus.value());
        response.setStatus(httpStatus.value());
    }
}
