package com.techfun.jdbc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.util.RideRowMapper;

@Repository
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	public void createRide(Ride ride) {

		JdbcTemplate.update("INSERT INTO ride(name,duration) values(?,?)", ride.getName(), ride.getDuration());
		
		System.out.println("Test Transaction");
	}

	public void updateRide(Ride ride) {

		JdbcTemplate.update("UPDATE ride SET name = ?,duration = ? " + " WHERE id = ?", ride.getName(),
				ride.getDuration(), ride.getId());

	}

	public void deleteRide(Ride ride) {

		JdbcTemplate.update("DELETE from ride WHERE id = ?", ride.getId());

	}

	@Override
	public List<Ride> selectRide() {
		
		List<Ride> rideList = new ArrayList<Ride>();
		rideList = JdbcTemplate.query("SELECT * FROM ride", new RideRowMapper());
		return rideList;
	}

}
