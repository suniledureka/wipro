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

class EmployeeServicesTest {
	
	static EmployeeServicesImpl empService;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		empService = new EmployeeServicesImpl();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		empService = null;
	}

	@Test
	void testGetEmployeeNameById() {
		//create a mock object for EmployeeDAO
		EmployeeDAO mockDaoObj = Mockito.mock(EmployeeDAO.class);
		
		//inject mock object to service component
		empService.setDao(mockDaoObj);
		
		//--setting the behaviour for mock object 
		Mockito.when(mockDaoObj.findEmployeeNameById(101)).thenReturn("Sanjay");
		Mockito.when(mockDaoObj.findEmployeeNameById(102)).thenReturn("Praveen");
		
		int eid = 101;
		String ename = empService.getEmployeeNameById(eid);
		assertNotNull(ename);
	}

	@Test
	public void testFindAllNames() {
		EmployeeDAO mockObj = Mockito.mock(EmployeeDAO.class);
		empService.setDao(mockObj);
		
		List<String> names = Arrays.asList("Employee-1", "Employee-2");
		Mockito.when(mockObj.findEmployeeNames()).thenReturn(names); //recording
		
		
		List<String> empNames = empService.findAllNames();
		System.out.println(empNames);
		assertNotNull(empNames);
	}	
}
