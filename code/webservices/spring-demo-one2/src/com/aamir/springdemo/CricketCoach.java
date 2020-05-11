package com.aamir.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside no-args constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method: email");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method: team");
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
