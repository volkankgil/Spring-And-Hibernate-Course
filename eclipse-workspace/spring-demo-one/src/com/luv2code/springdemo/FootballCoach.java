package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "footballer turn around twenty times." ;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
