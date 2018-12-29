package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}

	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * fortuneService = thefortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside setFortune method");

		this.fortuneService = fortuneService;
	}*/
	
	//autowired method
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> inside doSomeCrazyStuff() method");
 
		this.fortuneService = fortuneService;
	}*/
	
	//define my init method
	@PostConstruct 
	public void doMyStartupMethod() {
		
		System.out.println("----> inside my doMyStartupMethod");
	}
	
	
	//define my destroy method
	@PreDestroy
		public void doMyDestroyMethod() {
			
			System.out.println("----> inside my doMyDestroyMethod");
		}

}
