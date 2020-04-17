package com.karimov.springdemo;

public class BaseballCoach implements Coach {
	
	private FortunService fortuneService;

	public BaseballCoach(FortunService fortunService) {
		this.fortuneService = fortunService;
	}

	@Override
	 public String getDailyWorkout() {
		 return "Spend 30 minutes on batting practice";
	 }

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
