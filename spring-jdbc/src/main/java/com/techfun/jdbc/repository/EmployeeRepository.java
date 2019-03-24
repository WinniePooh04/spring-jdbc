package com.techfun.jdbc.repository;

import com.techfun.jdbc.model.Employee;

public interface EmployeeRepository {

	void insertEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
}
