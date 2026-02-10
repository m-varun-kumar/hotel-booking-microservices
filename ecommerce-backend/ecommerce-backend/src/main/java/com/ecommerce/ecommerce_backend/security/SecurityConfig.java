package com.ecommerce.ecommerce_backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disables CSRF
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/**").permitAll() // allow all requests
                )
                .httpBasic(Customizer.withDefaults()); // optional: basic auth

        return http.build();
    }
}