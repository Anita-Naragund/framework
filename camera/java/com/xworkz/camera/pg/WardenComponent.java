package com.xworkz.camera.pg;

public class WardenComponent {
	
	private String name;
	
	public WardenComponent() {
		System.out.println("created WardenComponent");
	}
	
	public void suplyFood() {
		System.out.println("invoked suplyFood");
	}
	
	public void setName(String name) {
		System.out.println("invoked setName :"+name);
		this.name = name;
	}

}
