package com.wipro.boot.aop.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ReportGenerator {
	
	public void generateExcelReport() {
		System.out.println("\u001B[31mlogic to generate EXCEL report!!!!\033[0m");
	}
	
	public boolean generateExcelReport(String fileName) {
		System.out.println("\u001B[31mlogic to generate EXCEL report with custom fileName!!!!\033[0m");
		//return true;
		return new Random().nextBoolean();
	}
	
	public void generatePdfReport() {
		System.out.println("\u001B[31mlogic to generate PDF report!!!!\033[0m");
	}	
}
