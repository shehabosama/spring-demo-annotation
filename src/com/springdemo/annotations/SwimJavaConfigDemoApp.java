package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring confige file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container 
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		// call a method on the bean 		
		System.out.println(theCoach.getDialyWorkout());
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
	
		//colse context
		context.close();

	}

}
