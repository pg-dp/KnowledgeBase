package com.aamir.springdemo;

public class TrackCoach implements Coach {
	
	
private FortuneService fortuneservice;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5km daily";
	}

	@Override
	public String getDailyFortune() {
		return "Hello Aamir "+fortuneservice.getFortune();
	}

}
