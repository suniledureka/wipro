package com.wipro.boot.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfigurations {
	
	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(request -> request.requestMatchers("/home", "/contact")
													 .permitAll()
													 .anyRequest()
													 .authenticated());
		http.csrf(csrf -> csrf.disable());
		http.formLogin(Customizer.withDefaults());
		
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}
}
