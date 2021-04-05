package com.xworkz.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.components.bio.BioMetricComponent;

public class SpringTester {

	public static void main(String[] args) {
		String xmlPath="first-step.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlPath);
		BioMetricComponent objectCreatedFromSpring=spring.getBean(BioMetricComponent.class);
		objectCreatedFromSpring.facialRecognition(false);
	}

}
