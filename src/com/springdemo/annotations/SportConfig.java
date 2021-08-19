package com.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
// till spring this class is the config class
@Configuration
// to make this file known by spring 
@ComponentScan("com.springdemo.annotations")
// to define the properties file in the config java file
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFotruneService();
	}
	
	@Bean
	public Coach swimCoach() {
		//inject the sad fortuneService
		return new SwimCoach(sadFortuneService());
	}
}

