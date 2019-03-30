package com.techfun.jdbc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.util.EmployeeRowMapper;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public void insertEmployee(Employee employee) {
		JdbcTemplate.update("INSERT INTO employee(name,age,address) values(?,?,?)", employee.getName(),
				employee.getAge(), employee.getAddress());

	}

	@Override
	public void updateEmployee(Employee employee) {
		JdbcTemplate.update("UPDATE employee SET name = ?,age = ?,address=? " + " WHERE id = ?", employee.getName(),
				employee.getAge(), employee.getAddress(), employee.getId());

	}

	@Override
	public void deleteEmployee(Employee employee) {
		JdbcTemplate.update("DELETE from employee WHERE id = ?", employee.getId());

	}

	@Override
	public List<Employee> selectEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		empList = JdbcTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());
		return empList;
	}

}
