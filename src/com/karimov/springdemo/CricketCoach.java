package com.karimov.springdemo;

public class CricketCoach implements Coach {

    private FortunService fortunService;


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg");
    }
    
    public void setFortunService(FortunService fortunService) {
        this.fortunService = fortunService;
    }


    @Override
    public String getDailyWorkout() {
    
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        
        return fortunService.getFortune();
    }

}