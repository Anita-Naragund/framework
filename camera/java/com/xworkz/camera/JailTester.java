package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera.component.JailComponent;

public class JailTester {

	public static void main(String[] args) {
		String xmlFilePath="first-step.xml";
		String xmlFilePath2="second-step.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlFilePath,xmlFilePath2);
		JailComponent jail=context.getBean(JailComponent.class);
		System.out.println(context.getBeanDefinitionCount());
		jail.punishment("Jivavadi");

	}

}
