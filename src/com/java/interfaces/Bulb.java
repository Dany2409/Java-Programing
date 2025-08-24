package com.java.interfaces;

//import com.java.interfaces.LightGivingEquipment;

public abstract class Bulb implements LightGivingEquipment{
	
	public void throwABC() {
		System.out.println("I am throwing light, i am a bulb");
	}
	
	public void throwHeat() {
		System.out.println("I am throwing heat, i am a bulb");
	}

}


