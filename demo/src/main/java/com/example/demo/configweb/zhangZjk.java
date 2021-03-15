package com.example.demo.configweb;

import com.example.demo.FilterZhang.one;
import com.example.demo.FilterZhang.there;
import com.example.demo.FilterZhang.two;
import com.example.demo.controller.toker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Random;
import java.util.UUID;

@Configuration
@EnableWebSecurity
public class zhangZjk extends WebSecurityConfigurerAdapter{


    @Resource
    private DataSource dataSource;


    @Autowired
    private toker toker;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(PasswordEncoder());
    }

    @Bean
    public PasswordEncoder PasswordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login/zjk")
                .defaultSuccessUrl("/success")
                .permitAll();


            http.authorizeRequests()
                    .antMatchers("/hello").authenticated()
                    .anyRequest().permitAll();
            http.csrf().ignoringAntMatchers("/login","/","/haole").csrfTokenRepository(toker);
            http.addFilterAt(one(), UsernamePasswordAuthenticationFilter.class);
            http.addFilterAt(two, ExceptionTranslationFilter.class);
            http.rememberMe()
                    .tokenValiditySeconds(200000)
                    .key("zhang-zjk");
            http.logout().logoutUrl("/logout")
                    .logoutSuccessUrl("/").deleteCookies("zhang-zjk").permitAll();


//            http.requiresChannel().antMatchers("/test")
//                    .requiresSecure(); //发送的请求会自动转化为https请求[安全请求]
//            http.requiresChannel().antMatchers("/test")
//                .requiresInsecure();//发送的请求会自动转化为http请求




    }

    @Resource
    private two two;
    @Bean
    public one one(){


        return new one();
    }

//    @Bean
//    public two two(AuthenticationEntryPoint authenticationEntryPoint){
//
//        return new two(authenticationEntryPoint);
//    }
//    @Bean
//    public there there(){
//
//        return new there();
//    }

//    @Bean
//    public HttpStatusEntryPoint HttpStatusEntryPoint(){
//        return new HttpStatusEntryPoint(HttpStatus.BAD_GATEWAY);

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }



}
