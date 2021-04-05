package com.xworkz.camera.washingMachine;

public class Power {
	
	private boolean on;
	
	public Power() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean isOn() {
		return on;
	}
}
