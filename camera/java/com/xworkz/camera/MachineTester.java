package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera.washingMachine.WashingMachine;

public class MachineTester {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("machine.xml");
		WashingMachine machine=context.getBean(WashingMachine.class);
		machine.wash();
	}

}
