package com.xworkz.food;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.constants.FoodType;
import com.xworkz.food.constants.HotelVendorType;
import com.xworkz.food.entity.CustomerEntity;
import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.entity.HotelVendorEntity;
import com.xworkz.food.service.CustomerServiceImpl;
import com.xworkz.food.service.FoodItemServiceImpl;
import com.xworkz.food.service.HotelVendorService;

public class SpringTester {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		FoodItemServiceImpl foodService=context.getBean(FoodItemServiceImpl.class);
		FoodItemEntity entity=new FoodItemEntity(1,"Dosa", 40, FoodType.NORTHINDIAN, 02, 20);
		foodService.validateAndSave(entity);
		
		/*
		 * CustomerServiceImpl costService=context.getBean(CustomerServiceImpl.class);
		 * CustomerEntity entity1=new CustomerEntity(1,"Anita", "Bangalore", 5,
		 * 7890675432f, "anita.xworkz@gmail.com", "female");
		 * costService.validateAndSave(entity1);
		 * 
		 * HotelVendorService vendor=context.getBean(HotelVendorService.class);
		 * HotelVendorEntity hotel=new HotelVendorEntity(1,"Trupti", "Bagalkot", 6,
		 * 8906543219f,HotelVendorType.RETAILERS); vendor.validateAndSave(hotel);
		 */
		
		
	}

}
