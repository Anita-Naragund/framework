package com.xworkz.camera.component;

public class ClubComponent {
	private String trustName;
	private int totalMembers;
	
	public ClubComponent() {
		System.out.println("Created ClubComponent");
		this.trustName=trustName;
	}

	public ClubComponent(String trustName, int totalMembers) {
		super();
		this.trustName = trustName;
		this.totalMembers = totalMembers;
	}

	public String getTrustName() {
		return trustName;
	}
}
