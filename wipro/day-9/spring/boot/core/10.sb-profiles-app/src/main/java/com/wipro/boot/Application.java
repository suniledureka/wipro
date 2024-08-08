package com.wipro.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

import com.wipro.boot.beans.DBConfiguration;

@SpringBootApplication
public class Application {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		DBConfiguration dbCon = context.getBean(DBConfiguration.class);
		
		//System.out.println(dbCon);
		
		LOGGER.info("Driver Class: {}", dbCon.getDriverClass());
		LOGGER.info("URL: {}", dbCon.getUrl());
		LOGGER.info("User Name: {}", dbCon.getUname());
		LOGGER.info("Password: {}", dbCon.getPassword());
	}
}
