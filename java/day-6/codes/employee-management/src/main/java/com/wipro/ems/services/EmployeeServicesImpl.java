package com.wipro.ems.services;

import java.util.List;

import com.wipro.ems.dao.EmployeeDAO;
import com.wipro.ems.dao.EmployeeDAOImpl;
import com.wipro.ems.dto.Employee;

public class EmployeeServicesImpl implements EmployeeServices {
	private static EmployeeDAO dao;
	public EmployeeServicesImpl() throws Exception{
		dao = new EmployeeDAOImpl();
	}
	
	@Override
	public void saveEmployee(Employee emp) throws Exception {
		int n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Saved ---###");
		else
			System.out.println("$$$--- Employee could not be Saved ---$$$");
	}

	@Override
	public Employee getEmployeeById(Integer eno) throws Exception {
		Employee emp = dao.findEmployeeById(eno);
		return emp;
	}

	@Override
	public void getAllEmployees() throws Exception {
		List<Employee> employees = dao.findAllEmployees();
		employees.stream().forEach(emp -> {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		});
	}

	@Override
	public void updateEmployeeById(int eno, Employee emp) throws Exception {
		int n = dao.updateEmployee(eno, emp);
		if(n > 0)
			System.out.println("###--- Employee Updated ---###");
		else
			System.err.println("no matching employee to update - " + eno);
	}

	@Override
	public void deleteEmployeeById(int eno) throws Exception {
		int n = dao.deleteEmployeeById(eno);
		if(n > 0)
			System.out.println("###--- Employee Deleted ---###");
		else
			System.err.println("no matching employee to delete - " + eno);
	}

}
