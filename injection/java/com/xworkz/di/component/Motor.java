package com.xworkz.di.component;

public class Motor {

	private int warrantyPeriod;
	
	public Motor() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public void rotate() {
		System.out.println("motor rotating");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked setWarrantyPeriod");
		this.warrantyPeriod = warrantyPeriod;
	}

}
