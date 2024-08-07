package com.wipro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

import com.wipro.boot.beans.DBConfiguration;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		DBConfiguration dbCon = context.getBean(DBConfiguration.class);
		
		System.out.println(dbCon);
		
		//System.out.println(System.getProperties());
	}
	
	@EventListener(ApplicationReadyEvent.class)
	private void doOperationAfterStart() {
		System.out.println("Spring Boot Application Ready");
	}
}
