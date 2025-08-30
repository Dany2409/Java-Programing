package com.java.tutorial;

public class Plumber
{
	public  Plumber() 
	{
		System.out.println("Displaying no Agrument for constructor ");
	}
	public  Plumber(int screwDriverCount) 
	{
		System.out.println("Displaying with Agrument for constructor ");
		System.out.println("Displaying screwDriver Count "+screwDriverCount);
	}
	
	public void Fixtap() 
	{
		System.out.println("Tap is fixed....");
	}
	public void Fixtap(int money) 
	{
		System.out.println("plubler has taken " + money+" Rupes");
		System.out.println("Tap is Fixed After taking  "+ money +" Rupes");

	}
}
