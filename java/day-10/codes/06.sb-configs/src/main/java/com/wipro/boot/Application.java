package com.wipro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.boot.beans.DBConnection;
import com.wipro.boot.beans.Ticket;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		Ticket ticket = context.getBean(Ticket.class);
		System.out.println(ticket);
		System.out.println();
		
		DBConnection dbCon = context.getBean(DBConnection.class);
		System.out.println(dbCon);
	}
}
