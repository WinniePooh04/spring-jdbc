package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void insertEmployee(Employee employee) {
		employeeRepository.insertEmployee(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.deleteEmployee(employee);

	}

	@Override
	public List<Employee> selectEmployee() {
		return employeeRepository.selectEmployee();

	}

	@Override
	public void insertEmployeeAndRide(Employee employee, Ride ride) {
		employeeRepository.insertEmployeeAndRide(employee, ride);

	}

}
