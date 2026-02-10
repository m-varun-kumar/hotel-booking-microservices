
package com.ecommerce.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
 @Bean
 SecurityFilterChain filter(HttpSecurity http) throws Exception {
  http.csrf().disable().authorizeHttpRequests(a -> a.anyRequest().permitAll());
  return http.build();
 }
}
