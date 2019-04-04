package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);

		// insertEmployee(employeeService);
		// updateEmployee(employeeService);
		// deleteEmployee(employeeService);
		// selectEmployee(employeeService);
		insertEmployeeAndRide(employeeService);
	}

	private static void insertEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setName("John123");
		emp.setAge(35);
		emp.setAddress("Tarmwe");

		employeeService.insertEmployee(emp);
		System.out.println("Insert record successfully");
	}

	private static void updateEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setName("John Lwin");
		emp.setAge(33);
		emp.setAddress("ShweGonDaing");
		emp.setId(1);

		employeeService.updateEmployee(emp);
		System.out.println("Update record successfully");
	}

	private static void deleteEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setId(2);

		employeeService.deleteEmployee(emp);
		System.out.println("Delete record successfully");
	}

	private static void selectEmployee(EmployeeService employeeService) {

		List<Employee> empList = employeeService.selectEmployee();
		for (Employee emp : empList) {
			System.out.println("Employee Name:" + emp.getName());
			System.out.println("Age:" + emp.getAge());
			System.out.println("Address:" + emp.getAddress());
		}
	}

	private static void insertEmployeeAndRide(EmployeeService employeeService) {

		Employee emp = new Employee();
		emp.setName("John666");
		emp.setAge(35);
		emp.setAddress("Tarmwe");

		Ride ride = new Ride();
		ride.setName("John Smith666");
		ride.setDuration(18);

		employeeService.insertEmployeeAndRide(emp, ride);
		System.out.println("Insert both records successfully");
	}

}
