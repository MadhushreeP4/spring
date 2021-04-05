package com.xworkz.di.component;

public class WashingMachine {

	String companyName;
	float capacity;
	Motor motor;
	Power pow;

	public WashingMachine(String companyName, float capacity, Motor motor, Power pow) {
		super();
		System.out.println("created " + this.getClass().getSimpleName());
		this.companyName = companyName;
		this.capacity = capacity;
		this.motor = motor;
		this.pow = pow;
	}

	public void wash() {
		System.out.println("invoked wash");
		if (this.pow.isOn()) {
			this.motor.rotate();
		}
	}

}
