package com.smarthome;

import java.util.HashSet;
import java.util.Set;

public class Constants {
	
	
	static Set<String> fanCommandNames = addFanCommands();
	static Set<String> lightCommandNames = addLightCommands();
	static Set<String> tvCommandNames = addTvCommands();

	private static  Set<String> addFanCommands() {
		Set<String> set = new HashSet<>();
		set.add("SWITCH ON");
		set.add("SWITCH OFF");
		set.add("CHANGE SPEED");
		return set;
	}
	
	private static  Set<String> addLightCommands() {
		Set<String> set = new HashSet<>();
		set.add("SWITCH ON");
		set.add("SWITCH OFF");
		return set;
	}
	
	private static  Set<String> addTvCommands() {
		Set<String> set = new HashSet<>();
		set.add("SWITCH ON");
		set.add("SWITCH OFF");
		set.add("CHANGE VOLUME");
		return set;
	}

}
