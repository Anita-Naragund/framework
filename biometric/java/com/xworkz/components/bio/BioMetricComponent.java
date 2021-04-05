package com.xworkz.components.bio;

public class BioMetricComponent {
	
	public BioMetricComponent() {
		System.out.println("created BioMetricComponent");
	}

	public void facialRecognition(boolean what) {
		System.out.println("invoked facialRecognition");
		System.out.println("args1: "+what);
		
	}
}
