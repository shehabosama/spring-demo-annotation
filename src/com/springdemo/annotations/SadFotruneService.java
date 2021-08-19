package com.springdemo.annotations;

public class SadFotruneService implements FortuneService {

	@Override
	public String getFortune() {
		return "i am sad fortune service";
	}

}
