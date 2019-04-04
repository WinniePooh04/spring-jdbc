package com.techfun.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techfun.jdbc.model.Staff;

public class StaffRowMapper implements RowMapper<Staff> {

	@Override
	public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {

		Staff staff = new Staff();
		staff.setId(rs.getInt("id"));
		staff.setName(rs.getString("name"));
		staff.setAge(rs.getInt("age"));
		staff.setAddress(rs.getString("address"));
		return staff;
	}

}
