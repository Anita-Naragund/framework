package com.xworkz.food;

import com.xworkz.food.constants.HotelVendorType;
import com.xworkz.food.entity.HotelVendorEntity;
import com.xworkz.food.repository.HotelVendorRepository;
import com.xworkz.food.repository.HotelVendorRepositoryImpl;
import com.xworkz.food.service.HotelVendorService;
import com.xworkz.food.service.HotelVendorServiceImpl;

public class HotelTester {

	public static void main(String[] args) {
		HotelVendorEntity entity=new HotelVendorEntity("Kavya", "Gadag", 6, 7890675432f, HotelVendorType.WHOLESALERS);
		HotelVendorRepository reps=new HotelVendorRepositoryImpl();
		HotelVendorService service=new HotelVendorServiceImpl(reps);
		service.validateAndSave(entity);

	}

}
