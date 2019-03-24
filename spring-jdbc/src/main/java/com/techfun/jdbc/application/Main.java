package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RideService rideService = appContext.getBean("rideService", RideService.class);
		// TODO Auto-generated method stub

		testCreateRide(rideService);
		// testUpdateRide(rideService);
		// testDeleteRide(rideService);
	}

	private static void testCreateRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setName("Phyo Paing");
		ride.setDuration(15);
		rideService.createRide(ride);
		System.out.println("Process Successful completed!");
	}

	private static void testUpdateRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setName("Pyae Phyo");
		ride.setDuration(11);
		ride.setId(1);

		rideService.updateRide(ride);
		System.out.println("Process Successful completed!");
	}

	private static void testDeleteRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setId(2);

		rideService.deleteRide(ride);
		System.out.println("Process Successful completed!");
	}
}
