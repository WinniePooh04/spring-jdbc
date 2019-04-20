package com.techfun.jdbc.service;

import com.techfun.jdbc.model.Staff;

public interface StaffService {

	void insertStaff(Staff staff) throws Exception;

	void updateStaff(Staff staff);
	
	Staff selectStaffInfo(Integer id);

	void deleteStaff(Integer staffId, Integer roleId);
}
