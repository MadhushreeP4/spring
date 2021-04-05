package com.xworkz.di.component;

public class Power {
	
	private boolean on;
	
	public Power() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	public boolean isOn() {
		System.out.println("invoked isOn");
		if(on) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setOn(boolean on) {
		System.out.println("invoked setOn");
		this.on = on;
	}

}
