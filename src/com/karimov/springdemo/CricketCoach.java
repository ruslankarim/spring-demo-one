package com.karimov.springdemo;

public class CricketCoach implements Coach {

    private FortunService fortunService;

    private String email;
    private String team; 


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg");
    }
    
    public void setFortunService(FortunService fortunService) {
        this.fortunService = fortunService;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: inside setEmail");
        this.email = email;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
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