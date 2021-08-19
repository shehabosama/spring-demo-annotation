package com.springdemo.annotations;

import javax.annotation.PostConstruct;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDialyWorkout() {
		// TODO Auto-generated method stub
		return "prictice to float on the water";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	@PostConstruct
	public void test() {
		System.out.println("the test for make sure if annotation appear anywhere or not");
	}

}
