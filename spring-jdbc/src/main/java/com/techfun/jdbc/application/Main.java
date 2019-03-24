package com.techfun.jdbc.application;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		//testCreateRide(ride);
		testUpdateRide(ride);
		testDeleteRide(ride);		
	}
	
	private static void testCreateRide(Ride ride) {
		ride.setName("Phyo Paing");
		ride.setDuration(15);
		
		RideService rideService = new RideServiceImpl();
		rideService.createRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testUpdateRide(Ride ride) {
		ride.setName("Pyae Phyo");
		ride.setDuration(11);
		ride.setId(1);
		
		RideService rideService = new RideServiceImpl();
		rideService.updateRide(ride);
		System.out.println("Process Successful completed!");
	}
	
	private static void testDeleteRide(Ride ride) {
		ride.setId(2);
		
		RideService rideService = new RideServiceImpl();
		rideService.deleteRide(ride);
		System.out.println("Process Successful completed!");
	}
}
