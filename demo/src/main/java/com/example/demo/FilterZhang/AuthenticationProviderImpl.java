package com.example.demo.FilterZhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Resource
    AuthenticationManagerBuilder authenticationManagerBuilder;

    /**
     * 验证....
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username=(String)authentication.getPrincipal();
        String password=(String)authentication.getCredentials();
        UserDetailsService defaultUserDetailsService = authenticationManagerBuilder.getDefaultUserDetailsService();
        UserDetails userDetails = defaultUserDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken ok=new UsernamePasswordAuthenticationToken(userDetails.getUsername(),userDetails.getPassword());


        return ok;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
