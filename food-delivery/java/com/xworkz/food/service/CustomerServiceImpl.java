package com.xworkz.food.service;

import com.xworkz.food.entity.CustomerEntity;
import com.xworkz.food.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	CustomerRepository repository;
	
	public CustomerServiceImpl(CustomerRepository repository) {
		System.out.println("created CustomerServiceImpl");
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave");
		if(entity!=null) {
			System.out.println("entity is valid");
			repository.save(entity);
		}else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
