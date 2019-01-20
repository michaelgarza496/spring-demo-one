package com.michael.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create object
		Coach theCoach = new BasketballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
