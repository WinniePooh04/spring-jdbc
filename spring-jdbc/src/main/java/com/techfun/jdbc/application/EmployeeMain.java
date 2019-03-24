package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);

		insertEmployee(employeeService);
		//updateEmployee(employeeService);
		//deleteEmployee(employeeService);
	}

	private static void insertEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setName("John123");
		emp.setAge(35);
		emp.setAddress("Tarmwe");

		employeeService.insertEmployee(emp);
	}

	private static void updateEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setName("John Lwin");
		emp.setAge(35);
		emp.setAddress("ShweGonDaing");
		emp.setId(1);

		employeeService.updateEmployee(emp);
	}

	private static void deleteEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setId(2);

		employeeService.deleteEmployee(emp);
	}
}
