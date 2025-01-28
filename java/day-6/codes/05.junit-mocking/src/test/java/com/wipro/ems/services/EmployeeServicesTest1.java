package com.wipro.ems.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.wipro.ems.dao.EmployeeDAO;
import com.wipro.ems.services.impl.EmployeeServicesImpl;

class EmployeeServicesTest1 {
	
	static EmployeeServicesImpl empService;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		empService = new EmployeeServicesImpl();
		
		//create a mock object for EmployeeDAO
		EmployeeDAO mockDaoObj = Mockito.mock(EmployeeDAO.class);
		
		//inject mock object to service component
		empService.setDao(mockDaoObj);
		
		//--setting the behaviour for mock object 
		Mockito.when(mockDaoObj.findEmployeeNameById(101)).thenReturn("Sanjay");
		Mockito.when(mockDaoObj.findEmployeeNameById(102)).thenReturn("Praveen");
		
		List<String> names = Arrays.asList("Employee-1", "Employee-2");
		Mockito.when(mockDaoObj.findEmployeeNames()).thenReturn(names); //recording
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		empService = null;
	}

	@Test
	void testGetEmployeeNameById() {
		
		int eid = 101;
		String ename = empService.getEmployeeNameById(eid);
		assertNotNull(ename);
	}

	@Test
	public void testFindAllNames() {		
		List<String> empNames = empService.findAllNames();
		System.out.println(empNames);
		assertNotNull(empNames);
	}	
}
