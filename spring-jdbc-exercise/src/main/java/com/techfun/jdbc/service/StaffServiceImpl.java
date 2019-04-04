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
	public int insertStaff(Staff staff) {
		int result = 0;
		try {
			result = staffRepository.insertStaff(staff);
		} catch (Exception e) {
			String errMsg = e.getMessage();
			System.out.println(errMsg);
		}
		return result;
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
