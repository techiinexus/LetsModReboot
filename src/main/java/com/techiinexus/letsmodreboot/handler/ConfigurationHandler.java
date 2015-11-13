package com.techiinexus.letsmodreboot.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration configuration;
	
	public static void init(File configFile){
		// Create the config file
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		
		try {
			configuration.load();
			configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config value").getBoolean(true);
		}
		catch (Exception e){
			//Log the exception
		}
		finally {
			if (configuration.hasChanged()){
				configuration.save();
			}
		}
		
		System.out.println("Configuration Test: " + configValue);
	}
}
