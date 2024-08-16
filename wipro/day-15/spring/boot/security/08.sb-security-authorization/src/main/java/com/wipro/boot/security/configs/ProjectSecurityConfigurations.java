package com.wipro.boot.security.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfigurations {
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Bean
	public UserDetailsService manageUsers(){
		UserDetails user1 =  User.withUsername("admin")
					 			 .password(encoder.encode("1234"))
					 			 .roles("ADMIN")
					 			 .build();
		
		UserDetails user2 =  User.builder()
					 			 .username("sunil")
					 			 .password(encoder.encode("1234"))	
					 			 .roles("MANAGER")
					 			 .build();	

		UserDetails user3 =  User.builder()
					 			 .username("sanjay")
					 			 .password("1234")	
					 			 .passwordEncoder(pass -> encoder.encode(pass))
					 			 .roles("CLERK")
					 			 .authorities("CLERK")
					 			 .build();		

		UserDetailsManager users = new InMemoryUserDetailsManager(user1, user2, user3);
		//return users;
		
		return new InMemoryUserDetailsManager(user1, user2, user3);	
	}
	
	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(request -> request.requestMatchers("/home", "/contact")
													 .permitAll()
													 .requestMatchers("/admin/**").hasRole("ADMIN")
													 .requestMatchers("/manager").hasAnyRole("ADMIN", "MANAGER")
													 .requestMatchers("/clerk").hasAnyAuthority("CLERK")
													 .anyRequest()
													 .authenticated());
		http.csrf(csrf -> csrf.disable());
		http.formLogin(Customizer.withDefaults());		
		
		http.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}
}
