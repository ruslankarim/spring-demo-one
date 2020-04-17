package com.karimov.springdemo;

public class HappyFortuneService implements FortunService {

	@Override
	public String getFortune() {
		return "Today is lucky day!";
	}

}
