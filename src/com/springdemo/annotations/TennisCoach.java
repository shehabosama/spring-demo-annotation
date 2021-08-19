package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//you can call it with specific name like the bellow comment
//@Component("thatSillyCoach")
// you can alse call it by the default name by calling the name of the class with lower case of the first character
@Component
//life cycle scope the singleton scope make on instance of the object if you create it more tan one time but in the prototype scope every time you create object will create new object 
//@Scope("prototype")
public class TennisCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	//direct injection by injection filed
	@Autowired
	//@Qualifier("databaseFortuneService")
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("i am in constructor TennisCoach...");
	}
	/* dependency injection by annotation with constructor
	//dependency
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	/* dependency injection by annotation with setter
	@Autowired
	public void setFortuneService(FortuneService fortuneService) { 
		this.fortuneService = fortuneService;
	}*/
	
	/* dependency injection by annotation with Any function name
	@Autowired
	public void doSomeCrizyStuff(@Qualifier("randomFortuneService") FortuneService fortuneService) { 
		System.out.println("i am here ...");
		this.fortuneService = fortuneService;
	}*/


	
	@Override
	public String getDialyWorkout() {
		
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println("i am inside the doMyStartupStuff");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("i am inside the doMyCleanupStuff");
	}
	//define my destroy method
}
