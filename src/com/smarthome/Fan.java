package com.smarthome;

import java.util.HashSet;
import java.util.Set;

public class Fan extends Appliance{
	
	public Fan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int speed = 0;//range 0 to 5

	public String changeSpeed(int newSpeed) {
		if(newSpeed <= 5 && newSpeed >= 0) {
			this.speed = newSpeed;
			return "speed set to newSpeed";
		   }
	
	      return "Speed not in range";
	
	}
	
	}

	
	


