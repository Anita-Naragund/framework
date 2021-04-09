package com.xworkz.food;

import com.xworkz.food.entity.CustomerEntity;
import com.xworkz.food.repository.CustomerRepository;
import com.xworkz.food.repository.CustomerRepositoryImpl;
import com.xworkz.food.service.CustomerService;
import com.xworkz.food.service.CustomerServiceImpl;

public class CustomerTester {
	
	public static void main(String[] args) {
		CustomerEntity entity=new CustomerEntity(3,"Anita", "Rajajinagar Bangalore", 5, 7985413655f,
				"anitavn022@gmail.com", "female");
		CustomerRepository reps=new CustomerRepositoryImpl(null);
		CustomerService service=new CustomerServiceImpl(reps);
		service.validateAndSave(entity);
	}

}
