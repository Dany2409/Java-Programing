package com.java.tutorial1;

public class Plumber {
	
	public Plumber() {
		System.out.println("Displaying from no-argument constructor");
	}
	
	public Plumber(int screwdriverCount) {
		System.out.println("Displaying Screwdriver count : "+screwdriverCount);
	}
	
	public void fixTap() {
		System.out.println("Tap is fixed..");
	}
	
	public void fixTap(int money) {
		System.out.println("Money taken.." + money);
		System.out.println("Money taken.." + "money");
	}
	
	public int fixTap1(int money) {
		System.out.println("Returning change");
		return 5;
		
	}
	
}
