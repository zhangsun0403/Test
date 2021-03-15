package com.example.demo.FilterZhang;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.stereotype.Component;

@Component
public class authenticationManagerImpl extends ProviderManager {

    /**
     * 认证管理器
     * @param providers
     */
    public authenticationManagerImpl(AuthenticationProvider... providers) {
        super(providers);
        System.out.println("success....");
    }
}
