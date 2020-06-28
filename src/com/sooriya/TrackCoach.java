package com.sooriya;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
