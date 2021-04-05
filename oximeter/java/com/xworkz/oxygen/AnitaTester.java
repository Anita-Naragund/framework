package com.xworkz.oxygen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.oxygen.component.OxiMetricComponent;

public class AnitaTester {
	
	public static void main(String[] args) {
		String xmlFilePath="first-step.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlFilePath);
		OxiMetricComponent oxi=context.getBean(OxiMetricComponent.class);
		oxi.levelOfOxygen(3);
	}

}
