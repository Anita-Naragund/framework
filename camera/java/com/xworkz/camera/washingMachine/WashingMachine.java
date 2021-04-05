package com.xworkz.camera.washingMachine;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private Motor motor;
	private Power pow;

	public WashingMachine(String companyName,float capacity) {
		System.out.println("created " + this.getClass().getSimpleName());
		System.out.println("company name is :"+companyName);
		System.out.println("capacity is :"+capacity);
	}
	
	public void setMotor(Motor motor) {
		System.out.println("invoked setMotor :"+motor);
		this.motor = motor;
	}
	
	public void setPow(Power pow) {
		System.out.println("invoked setPow :"+pow);
		this.pow = pow;
	}

	public void wash() {
		System.out.println("invoked wash");
		if (pow.isOn()) {
			System.out.println("Power is on...");
			this.motor.rotate();
		}
	}

}
