package com.smarthome;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Device {
	
	private String name;
	
	public Device(String name) {
	this.name = name;
	}
	
    public String getName() {
		return name;
	}


	private Map<String,Appliance> appliances = new HashMap<>();
    /*map contains key,value.
     *bedroom fan,fanObj 
     * bedroom light ,lightObj
     */
    
    public boolean addAppliance(Appliance appliance) {
    	
    
    	
    	if(appliances.containsKey(appliance.getName())) {
    		return false;
    	
    	}
    	
    	appliances.put(appliance.getName(), appliance);
    	return true;
    }
    
    public boolean removeAppliance(Appliance appliance) {
    	if(appliances.containsKey(appliance.getName())) {
    		appliances.remove(appliance.getName());
    		return true;
    	}
    	return false;
    }
    public boolean removeAppliance(String appliance) {
    	if(appliances.containsKey(appliance)) {
    		appliances.remove(appliance);
    		return true;
    	}
    	return false;
    }
    
    public String executeCommand(Command command) {
    	if(!(command.getDeviceName().equalsIgnoreCase(this.name) && appliances.containsKey(command.getApplianceName()))){
    		
    	
		return "Command not executed by "+name;
		}
    	Appliance appliance = appliances.get(command.getApplianceName());
    	if(appliance instanceof Fan) {
    		Fan fan = (Fan) appliance;
    		if(Constants.fanCommandNames.contains(command.getCommandName())) {
    			if(command.getCommandName().equalsIgnoreCase("SWITCH ON")) {
    				String returnValue = fan.turnOn();
    				System.out.println("Fan Switched on");
    				 return returnValue;
    				
    				}
    			else if(command.getCommandName().equalsIgnoreCase("CHANGE SPEED")) {
    				int newSpeed =Integer.parseInt(command.getGeneralisedVariable());
    			  fan.changeSpeed(newSpeed);
    			}
    			else if(command.getCommandName().equalsIgnoreCase("SWITCH OFF")) {
    				String returnValue = fan.turnOff();
    				System.out.println("fan Switched off");
    				return returnValue;
    				
    			}
    			
    		}
    		
    		
    	}
    	if(appliance instanceof Light) {
    		//Light light =(Light)appliance;
    	//	if(Constants.lightCommandNames.contains(command.))
    		
    	}
    	if(appliance instanceof Tv) {
    		
    	}
		
    	return "";
    	
    }
	

}
