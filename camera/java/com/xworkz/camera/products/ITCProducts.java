package com.xworkz.camera.products;

public class ITCProducts {
	
	private String name;
	private String type;
	private String expiryDate;
	
	public ITCProducts(String name) {
		super();
		System.out.println("created "+this.getClass().getSimpleName());
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void displayDetails() {
		System.out.println("name is "+this.name);
		System.out.println("type is "+this.type);
		System.out.println("expiry date is "+this.expiryDate);
	}

}
