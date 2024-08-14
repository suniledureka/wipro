package com.wipro.boot.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		
		http.csrf(csrf -> csrf.disable());
		
		http.httpBasic(Customizer.withDefaults());
		
		SecurityFilterChain securityFilter = http.build();
		return securityFilter;
	}
	
	//--- to configure multiple in-memory users  
	//UserDetailsService --> Core interface which loads user-specific data. 
	@Bean
	public UserDetailsService generateUsers() {
		UserDetails user1 =User.withUsername("admin")
								.password("{noop}12345")
								.roles("ADMIN")
								.build();
		
		var user2 =User.withUsername("sunil")
				.password("{noop}password123#")
				.roles("MANAGER")
				.build();
		/*
		UserDetailsManager userDtlsMgr = new InMemoryUserDetailsManager();
		userDtlsMgr.createUser(user1);
		userDtlsMgr.createUser(user2);
		*/
		
		UserDetailsService userDtlsService = new InMemoryUserDetailsManager(user1, user2);
		
		return userDtlsService;
	}
	
	
	//----- Global CORS Configuration -----
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*")
						.allowedOrigins("http://localhost:3000");
			}
		};
	}
}
