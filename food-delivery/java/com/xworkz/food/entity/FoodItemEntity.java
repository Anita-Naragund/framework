package com.xworkz.food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.food.constants.FoodType;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="foodDelivery")
public class FoodItemEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	@Column(name="PRICE")
	@NonNull
	private int price;
	
	@Column(name="FOOD_TYPE")
	@NonNull
	private FoodType foodtype;
	
	@Column(name="QUANTITY")
	@NonNull
	private int quantity;
	
	@Column(name="DISCOUNT")
	@NonNull
	private int discount;
	
	public FoodItemEntity() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	public FoodItemEntity(int id, @NonNull String name, @NonNull int price, @NonNull FoodType foodtype,
			@NonNull int quantity, @NonNull int discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.foodtype = foodtype;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [id=" + id + ", name=" + name + ", price=" + price + ", foodtype=" + foodtype
				+ ", quantity=" + quantity + ", discount=" + discount + "]";
	}

	
	
}
