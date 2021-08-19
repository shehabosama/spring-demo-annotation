package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n pointting to the same object: "+ result);
		System.out.println("\n Memory location for  theCoach: "+ theCoach);
		System.out.println("\n Memory location for  alphaCoach: "+ alphaCoach);
		
		context.close();
	}
}
