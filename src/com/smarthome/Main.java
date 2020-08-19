package com.smarthome;

public class Main {

	public static void main(String[] args) {
		SmartHome navyaHome = new SmartHome("navyaHome");
		
		Device device1 = new Device("alexa1");
		
		Appliance appliance1 = new Fan("Livingroom Fan");
		Appliance appliance2 = new Light("Livingroom Light");
		Appliance appliance3 = new Tv("Livingroom Tv");
		Appliance appliance4 = new Tv("Livingroom Tv1");
		
		
		System.out.println(device1.addAppliance(appliance1));
		System.out.println(device1.addAppliance(appliance2));
		System.out.println(device1.addAppliance(appliance3));
		System.out.println(device1.addAppliance(appliance4));
	
		
		System.out.println(navyaHome.addDevice(device1));
		System.out.println(navyaHome.addDevice(device1));
		
		System.out.println(device1.removeAppliance("Livingroom Tv1"));
		
		Command command = new Command("Livingroom Fan","SWITCH ON","alexa1");
		
		System.out.println(navyaHome.giveCommand(command));
		
		
		
		
		
		
		
		

	}

}
