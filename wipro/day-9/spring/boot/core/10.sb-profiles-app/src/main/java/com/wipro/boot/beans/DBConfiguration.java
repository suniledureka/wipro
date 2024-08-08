package com.wipro.boot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "jdbc")
public class DBConfiguration {
	private String driverClass;
	private String url;
	private String uname;
	private String password;
}
