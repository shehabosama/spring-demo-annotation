package com.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] arr = {"firt fortune service" ,
			"second fortune service",
			"third fortune service"};
	
	Random ran = new Random();
	@Override
	public String getFortune() {
		int index = ran.nextInt(2);
		return arr[index];
	}

}
