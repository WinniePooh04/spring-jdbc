package com.techfun.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;

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

}
