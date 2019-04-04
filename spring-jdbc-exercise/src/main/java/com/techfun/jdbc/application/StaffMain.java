package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.service.StaffService;

public class StaffMain {

	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StaffService staffService = appContext.getBean("staffService", StaffService.class);

		insertStaffInfo(staffService);
		// updateStaffInfo(staffService);
		// deleteStaffInfo(staffService);
	}

	private static void insertStaffInfo(StaffService staffService) throws Exception {
		Staff staff = new Staff();
		staff.setName("Myint Myint");
		staff.setAge(25);
		staff.setAddress("Hlaing");
		staff.setRole_id(1);
		staff.setId(3);

		int result = staffService.insertStaff(staff);
		if (result > 0) {
			System.out.println("Insert record successfully");
		} else {
			System.out.print("Duplicate staff: you can't insert");
		}
	}

	private static void updateStaffInfo(StaffService staffService) {
		Staff staff = new Staff();
		staff.setName("Aye Aye Updated");
		staff.setAge(33);
		staff.setAddress("ShweGonDaing");
		staff.setId(1);

		staffService.updateStaff(staff);
		System.out.println("Update record successfully");

		Staff updateInfo = staffService.selectStaffInfo(1);
		System.out.println("Updated name " + updateInfo.getName());
		System.out.println("Updated age " + updateInfo.getAge());
		System.out.println("Updated address " + updateInfo.getAddress());
	}

	private static void deleteStaffInfo(StaffService staffService) {

		Staff staffInfo = staffService.selectStaffInfo(2);
		staffService.deleteStaff(2, staffInfo.getRole_id());
		System.out.println("Delete record successfully");
	}

}
