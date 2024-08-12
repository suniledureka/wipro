package com.wipro.boot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.wipro.boot.aop.services.PasswordValidator;
import com.wipro.boot.aop.services.ReportGenerator;

@SpringBootApplication
//@EnableAspectJAutoProxy
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private ReportGenerator repoGen;
	
	@Autowired
	private PasswordValidator passValidator;
	@Override
	public void run(String... args) throws Exception {
		repoGen.generateExcelReport();
		System.out.println();
		
		repoGen.generateExcelReport("wiproData");
		System.out.println();
		
		repoGen.generatePdfReport();
		System.out.println();
		
		passValidator.validatePassword("password123#");
		System.out.println();
		try {
			passValidator.validatePassword("passw");
		}catch(Exception ex) {
			System.out.println("handling exception in Application");
		}
	}

}
