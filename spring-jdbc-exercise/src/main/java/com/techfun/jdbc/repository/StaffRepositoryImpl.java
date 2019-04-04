package com.techfun.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.util.StaffRowMapper;

@Repository("staffRepository")
@Transactional
public class StaffRepositoryImpl implements StaffRepository {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public int insertStaff(Staff staff) {
		return JdbcTemplate.update("INSERT INTO staff(id,name,role_id,age,address) values(?,?,?,?,?)", staff.getId(), staff.getName(), staff.getRole_id(),staff.getAge(),
				staff.getAddress());

	}

	@Override
	public void updateStaff(Staff staff) {
		JdbcTemplate.update("UPDATE staff SET name = ?,age = ?,address=? " + " WHERE id = ?", staff.getName(),
				staff.getAge(), staff.getAddress(), staff.getId());

	}

	@Override
	public void deleteStaff(Integer staffId, Integer roleId) {
		JdbcTemplate.update("DELETE from staff WHERE id = ?", staffId);
		JdbcTemplate.update("DELETE from role WHERE role_id = ?", roleId);
	}

	@Override
	public Staff selectStaffInfo(Integer id) {

		Staff staffInfo = new Staff();
		staffInfo = (Staff) JdbcTemplate.queryForObject("SELECT * FROM staff WHERE id=? ", new Object[] { id }, new StaffRowMapper());
		return staffInfo;
	}

}
