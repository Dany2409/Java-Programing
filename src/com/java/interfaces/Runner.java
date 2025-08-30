package com.java.interfaces;

import com.java.tutorial1.*;

public class Runner {

	public static void main(String[] args) {
//		Bulb b = new LED();
//		Bulb b = new Bulb();
		LED l = new LED();
		l.throwLight();
		l.throwHeat();
		Plumber p = new Plumber();
		p.fixTap();

	}

}
