package com.xworkz.food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.food.constants.HotelVendorType;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="hotel")
public class HotelVendorEntity {

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
	
	@Column(name="HOTEL_TYPE")
	@NonNull
	private HotelVendorType hotelvendortype;

	public HotelVendorEntity() {
		System.out.println("Created HotelVendorEntity");
	}

	public HotelVendorEntity(int id,String name, String location, int rating, float phoneNo, HotelVendorType hotelvendortype) {
		super();
		this.id=id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.hotelvendortype = hotelvendortype;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo="
				+ phoneNo + ", hotelvendortype=" + hotelvendortype + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotelvendortype == null) ? 0 : hotelvendortype.hashCode());
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
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (hotelvendortype != other.hotelvendortype)
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

	public HotelVendorType getHotelvendortype() {
		return hotelvendortype;
	}

	public void setHotelvendortype(HotelVendorType hotelvendortype) {
		this.hotelvendortype = hotelvendortype;
	}
}
