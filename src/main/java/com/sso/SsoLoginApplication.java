package com.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SsoLoginApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoLoginApplication.class, args);
    }
}
