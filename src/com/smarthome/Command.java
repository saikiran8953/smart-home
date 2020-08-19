package com.smarthome;

public class Command {
	
	private String applianceName;//bathroom fan,mater bed room fan,living room light,kitchen light
	private String commandName;//switch on ,swith off,increase volume,change Speed
	private String deviceName;//alexa1,googlehome1,alexa2,googlehome2
	private String generalisedVariable = null;
	
	public Command(String applianceName,String commandName,String deviceName) {
		this.applianceName = applianceName;
		this.commandName = commandName;
		this.deviceName = deviceName;
	}
	public Command(String applianceName,String commandName,String deviceName,String generalisedVariable) {
		this.applianceName = applianceName;
		this.commandName = commandName;
		this.deviceName = deviceName;
		this.generalisedVariable = generalisedVariable;
	}
	

	public String getApplianceName() {
		return applianceName;
	}

    public String getCommandName() {
		return commandName;
	}

	public String getDeviceName() {
		return deviceName;
	}
	public String getGeneralisedVariable() {
		return generalisedVariable;
	}

	

}
