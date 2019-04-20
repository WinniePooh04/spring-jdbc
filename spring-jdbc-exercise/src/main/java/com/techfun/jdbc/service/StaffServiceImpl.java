package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.repository.StaffRepository;

@Service("staffService")
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public void insertStaff(Staff staff) {
		staffRepository.insertStaff(staff);
	}

	@Override
	public void updateStaff(Staff staff) {
		staffRepository.updateStaff(staff);

	}

	@Override
	public void deleteStaff(Integer staffId, Integer roleId) {
		staffRepository.deleteStaff(staffId, roleId);

	}

	@Override
	public Staff selectStaffInfo(Integer id) {
		return staffRepository.selectStaffInfo(id);
	}

}
