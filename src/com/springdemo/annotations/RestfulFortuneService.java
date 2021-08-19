package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class RestfulFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "i am a restful fortune service";
	}

}
