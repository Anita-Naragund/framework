package com.xworkz.food.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.food.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	private SessionFactory factory;
	public CustomerRepositoryImpl(SessionFactory factory) {
		this.factory=factory;
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save");
		System.out.println("entity :"+entity);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
	
	

}
