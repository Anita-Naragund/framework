package com.xworkz.camera.component;

public class InsuranceComponent {
	
	public InsuranceComponent() {
		System.out.println("created InsuranceComponent");
	}
	
	public void policy(String name) {
		System.out.println("invoked policy");
		System.out.println("args1: "+name);
	}

}
