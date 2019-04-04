package com.techfun.jdbc.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public interface EmployeeRepository {

	void insertEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

	List<Employee> selectEmployee();

	void insertEmployeeAndRide(Employee employee, Ride ride);
}
