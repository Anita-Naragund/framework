package com.xworkz.food;

import com.xworkz.food.constants.FoodType;
import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;
import com.xworkz.food.repository.FoodItemRepositoryImpl;
import com.xworkz.food.service.FoodItemService;
import com.xworkz.food.service.FoodItemServiceImpl;

public class FoodItemTester {
	
	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("FridRice", 70, FoodType.NORTHINDIAN, 4, 32);
		FoodItemRepository reps=new FoodItemRepositoryImpl();
		FoodItemService service=new FoodItemServiceImpl(reps);
		service.validateAndSave(entity);
	}

}
