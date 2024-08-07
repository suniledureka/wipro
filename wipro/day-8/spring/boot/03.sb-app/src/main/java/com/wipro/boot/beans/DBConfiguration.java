package com.wipro.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
//@ConfigurationProperties
//@PropertySource(value = "dbconfig.properties")
@ConfigurationProperties(prefix = "jdbc")
@PropertySource(value = "classpath:dbconfig.properties")
public class DBConfiguration {
	//@Value("${driverClass}")
	private String driverClass;
	private String url;
	private String uname;
	private String password;
}
