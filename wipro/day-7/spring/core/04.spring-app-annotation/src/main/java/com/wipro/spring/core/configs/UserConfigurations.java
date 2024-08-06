package com.wipro.spring.core.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.wipro.spring"})
@PropertySource(value = {"userdetails.properties"})
public class UserConfigurations {	
}
