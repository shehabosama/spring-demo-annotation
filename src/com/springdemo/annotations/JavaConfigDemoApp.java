package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring confige file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container 
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		TennisCoach theTennisCoach = context.getBean("tennisCoach",TennisCoach.class);
		// call a method on the bean 		
		System.out.println(theCoach.getDialyWorkout());
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theTennisCoach.getEmail());
		System.out.println(theTennisCoach.getTeam());
		//colse context
		context.close();

	}

}
