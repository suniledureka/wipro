package com.wipro.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.wipro.filters.JwtAuthenticationFilter;
import com.wipro.services.JwtAuthenticationEntryPoint;

@Configuration
public class SecurityConfig {
    @Autowired
    private JwtAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
        		.authorizeHttpRequests(request -> request
        				.requestMatchers("/welcome").authenticated()
        				.requestMatchers("/auth/login").permitAll()
        				.anyRequest()
        				.authenticated());
                
         http.exceptionHandling(ex -> ex.authenticationEntryPoint(point));
         
         http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        
         return http.build();
    }


}
