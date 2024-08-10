package com.wipro.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.wipro.ems.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values(" + emp.getEmployeeId() + ",'" + emp.getEmployeeName() + "',"
				+ emp.getEmployeeSal() + ")";
		int employeesSaved = jt.update(sql);
		return employeesSaved;
	}

	@Override
	public Integer updateEmployee(int id, Employee emp) {
		String sql = "update emp set ename='" + emp.getEmployeeName() + "', sal=" + emp.getEmployeeSal()
				+ " where empno=" + id;
		int employeesUpdated = jt.update(sql);
		return employeesUpdated;
	}

	@Override
	public Integer deleteEmployeeById(int eid) {
		String sql = "delete from emp where empno=" + eid;
		int employeesDeleted = jt.update(sql);
		return employeesDeleted;
	}

	@Override
	public Employee findEmployeeById(int eid) {
		Employee emp = null;

		String sql = "select ename, sal from emp where empno=" + eid;
		try {
			emp = jt.queryForObject(sql, new RowMapper<Employee>() {

				@Override
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);
					return new Employee(eid, name, sal);
				}

			});
		} catch (Exception ex) {}
		return emp;
	}

	@Override
	public List<Employee> findAllEmployees() {
		String sql = "select * from emp";
		
		List<Employee> employees = jt.query(sql, new ResultSetExtractor<List<Employee>>() {

					@Override
					public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<Employee> empList = new ArrayList<Employee>();
						while(rs.next()) {
							int id = rs.getInt(1);
							String name = rs.getString(2);
							float sal = rs.getFloat(3);
							
							Employee emp = new Employee(id, name, sal);	
							empList.add(emp);
						}
						return empList;
					}
					
				});
		
		return employees;
	}

}
