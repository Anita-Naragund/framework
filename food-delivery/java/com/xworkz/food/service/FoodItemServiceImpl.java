package com.xworkz.food.service;

import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
	
	private FoodItemRepository repository;
	
	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("created :"+this.getClass().getSimpleName());
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave");
		if(entity!=null) {
			System.out.println("Entity is not null");
			repository.save(entity);
		}else {
			System.out.println("entity is null");
		}
		return false;
	}

}
