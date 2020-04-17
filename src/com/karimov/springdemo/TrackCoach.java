package com.karimov.springdemo;

public class TrackCoach implements Coach {

	private FortunService fortuneService;

	public TrackCoach() {
		System.out.println("Cricket in constructor");
	}

	public TrackCoach(FortunService fortuneService) {
		System.out.println("Cricket in setter");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
}

