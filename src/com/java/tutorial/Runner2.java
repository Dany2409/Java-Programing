package com.java.tutorial;
//Method with Agruments and constructor
public class Runner2  {
	public static void main(String[] args) {
		System.out.println("Plumber calling....");
		Plumber Navin= new Plumber(      );
		Navin.Fixtap();
		System.out.println("---------------------------------------------------------------------");
		Navin.Fixtap(200);
		System.out.println("---------------------------------------------------------------------");
		Plumber Abhishek= new Plumber();
		Abhishek.Fixtap();
	}

}
