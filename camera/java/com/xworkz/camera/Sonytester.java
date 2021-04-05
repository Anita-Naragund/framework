package com.xworkz.camera;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera.products.ITCProducts;

public class Sonytester {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ITCProducts itc=context.getBean(ITCProducts.class);
		itc.displayDetails();
		
		PropertyPlaceholderConfigurer property=new PropertyPlaceholderConfigurer();
		
	}

}
