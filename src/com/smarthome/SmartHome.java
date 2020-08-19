package com.smarthome;


import java.util.HashMap;

import java.util.Map;

public class SmartHome {
	private Map<String,Device> listOfDevices = new HashMap<>();
	private String name;
	
	public SmartHome(String name) {
		this.name = name;
	}
	
	public boolean addDevice(Device nDevice ) {
	  if(! listOfDevices.containsValue(nDevice)) {
		  listOfDevices.put(nDevice.getName(), nDevice);
		  return true;
	  }
	  return false;  
	  }
	
	public boolean removeDevice(String deviceName) {
		if(listOfDevices.containsKey(deviceName)) {
			listOfDevices.remove(deviceName);
			return true;
		}
		return false;
	}
	
	public String giveCommand(Command command ) {
		Device device = listOfDevices.get(command.getDeviceName());
		return device.executeCommand(command);
		
		
			
		
	}
	

}
