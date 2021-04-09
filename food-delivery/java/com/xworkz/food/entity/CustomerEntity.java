package com.xworkz.food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="customer")
public class CustomerEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	@Column(name="LOCATION")
	@NonNull
	private String location;
	
	@Column(name="RATING")
	@NonNull
	private int rating;
	
	@Column(name="PHONE")
	@NonNull
	private float phoneNo;
	
	@Column(name="EMAIL")
	@NonNull
	private String email;
	
	@Column(name="GENDER")
	@NonNull
	private String gender;
	
	public CustomerEntity() {
		System.out.println("created CustomerEntity");
	}

	public CustomerEntity(int id,String name, String location, int rating, float phoneNo, String email, String gender) {
		super();
		this.id=id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(phoneNo);
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(phoneNo) != Float.floatToIntBits(other.phoneNo))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public float getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(float phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
