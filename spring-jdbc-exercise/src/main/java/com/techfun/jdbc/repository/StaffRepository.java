package com.techfun.jdbc.repository;

import com.techfun.jdbc.model.Staff;

public interface StaffRepository {

	int insertStaff(Staff staff);

	void updateStaff(Staff staff);
	
	Staff selectStaffInfo(Integer id);

	void deleteStaff(Integer staffId, Integer roleId);

}
