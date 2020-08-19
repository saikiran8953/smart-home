package com.smarthome;

public class Tv extends Appliance {
	
	public Tv(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int volume = 1; //0 to 100

	public int getVolume() {
		
		return volume;
	}

	public String changeVolume(int volume) {
		if(volume >= 0 && volume <= 100) {
		this.volume = volume;
		return "volume has changed";
		}
	   return "volume not in range";

}
}
