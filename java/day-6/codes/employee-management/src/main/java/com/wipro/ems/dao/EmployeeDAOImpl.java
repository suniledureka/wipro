package com.wipro.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wipro.ems.configs.ConnectionFactory;
import com.wipro.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Integer saveEmployee(Employee emp) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		String sql = "insert into emp values(" + emp.getEmployeeId() + ",'" + emp.getEmployeeName() + "', " + emp.getEmployeeSal() + ")";
		try {
			int n = st.executeUpdate(sql);
			return n;
		}catch(Exception ex) {
			System.err.println("ERROR: " + ex.getMessage());
		}
		st.close();
		con.close();
		return 0;
	}

	@Override
	public Integer updateEmployee(int eno, Employee emp) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		int n = 0;
		if(eno == emp.getEmployeeId()) {
			String sql = "update emp set ename='" + emp.getEmployeeName()+"', sal="+emp.getEmployeeSal() + 
							"where empno=" + eno;
			n = st.executeUpdate(sql);
		}
		st.close();
		con.close();
		return n;
	}

	@Override
	public Integer deleteEmployeeById(int eid) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		String sql = "delete from emp where empno="+eid;
		int n = st.executeUpdate(sql);
		st.close();
		con.close();
		return n;
	}

	@Override
	public Employee findEmployeeById(int eid) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		Employee emp =  null;
		
		String sql = "select ename, sal from emp where empno="+eid;
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			emp = new Employee(eid, name, sal);
		}
		st.close();
		con.close();
		return emp;
	}

	@Override
	public List<Employee> findAllEmployees() throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		List<Employee> empsList = new ArrayList<Employee>();
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(eno, name, sal);
			empsList.add(emp);
		}
		st.close();
		con.close();
		return empsList;
	}

}
