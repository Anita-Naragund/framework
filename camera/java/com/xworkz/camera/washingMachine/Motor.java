package com.xworkz.camera.washingMachine;

public class Motor {

	private int warrantyPeriod;

	public Motor() {
		System.out.println("created motor");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked setWarrantyPeriod :"+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}

	public void rotate() {
		System.out.println("motor rotating");
	}

}
