package com.lti.runtimepolymorphism;

interface Vehicle {
	public void start();
	public void stop();
}
class Car implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void drive() {
		System.out.println("Car Driving");
	}
}
class Bike implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Bike started");
	}
	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}
	
	public void ride() {
		System.out.println("Riding Bike");
	}
}

public class Demo {
	public static void main(String[] args) {
		Vehicle v1;
		v1 = new Car();
		//v1 = new Bike();
		v1.start();
		v1.stop();
		//v1.drive(); error
		//v1.ride() ; error
	}
}
