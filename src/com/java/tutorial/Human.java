package com.java.tutorial;

final public class Human 
{
	static  int eyes=2;


public static void main(String[] args) {
		Human a = new Human();
		a.eyes=3;
		Human b = new Human();
		System.out.println(b.eyes);
		System.out.println(a.eyes);
	}
}
