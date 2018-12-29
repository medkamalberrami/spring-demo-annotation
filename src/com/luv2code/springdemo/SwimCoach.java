package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.mail}")
	private String mail;
	
	@Value("${foo.team}")
	private String team;
	

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getMail() {
		return mail;
	}

	public String getTeam() {
		return team;
	}

}
