package com.xworkz.food.service;

import com.xworkz.food.entity.HotelVendorEntity;
import com.xworkz.food.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	HotelVendorRepository repository;
	
	public HotelVendorServiceImpl(HotelVendorRepository repository) {
		System.out.println("created HotelVendorServiceImpl");
		this.repository=repository;	
	}
	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
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
