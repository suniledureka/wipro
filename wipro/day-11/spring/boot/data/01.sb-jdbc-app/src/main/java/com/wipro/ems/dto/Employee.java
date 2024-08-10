package com.wipro.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Float employeeSal;
	@Override
	public String toString() {
		return String.format("Employee [%-5d  %-20s  %.2f]", employeeId ,employeeName, employeeSal);
	}
	
	
}
