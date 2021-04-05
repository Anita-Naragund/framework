package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera.component.CameraComponent;

public class SpringTester {
	public static void main(String[] args) {
		
		String xmlFileName="first-step.xml";
		
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		CameraComponent camera=spring.getBean(CameraComponent.class);
		camera.capture("SunSet");
	}

}
