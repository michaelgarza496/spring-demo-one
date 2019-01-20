package com.michael.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private static String fortunes[] = new String[3];
	
	public HappyFortuneService() {
		fortunes[0] = "Today is your very lucky day";
		fortunes[1] = "You have to poop!";
		fortunes[2] = "ohh... you know...";
	}
	
	@Override
	public String getDailyFortune() {
		return fortunes[new Random().nextInt(3)];
	}

}
