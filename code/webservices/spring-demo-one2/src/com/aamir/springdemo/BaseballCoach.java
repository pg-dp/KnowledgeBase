package com.aamir.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}
}
