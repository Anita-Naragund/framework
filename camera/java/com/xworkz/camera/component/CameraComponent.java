package com.xworkz.camera.component;

public class CameraComponent {
	public CameraComponent() {
		System.out.println("created CameraComponent");
	}
	
	
	public void capture(String what) {
		System.out.println("invoked capture");
		System.out.println("args1 :"+what);
	}

}
