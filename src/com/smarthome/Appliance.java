package com.smarthome;

public class Appliance {
	
	private String name;
	private boolean isOn ;
	
	public Appliance(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isOn() {
		return isOn;
	}

	public String turnOn() {
		if(isOn == true ) {
			return "Already switched on";
			
		}
		isOn = true;
		return "switched on";
		
	}
	
	public String turnOff() {
		if(isOn == false) {
			return "Already Switched off";
		}
		isOn = false;
		return "successfully switched off";
		
	}

	@Override
	public boolean equals(Object arg0) {
	if(arg0 instanceof Appliance) {
		Appliance appliance= (Appliance)arg0;
		if(appliance.getName() == this.name) {
			return true;
		}
	}
	    return false;
	
	}

	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	
	
	

}
