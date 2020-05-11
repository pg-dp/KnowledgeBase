package com.aamir.springdemo;

public class MyApp {
	public static void main(String[] args) {
		
		// Creating the object
		Coach thecoach = new TrackCoach();
		
		// Using the object
		System.out.println(thecoach.getDailyWorkout());
	}
}
