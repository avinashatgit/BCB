package com.hcentive.automation.commonutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class GenericUtils {
	
	
	static Logger mainLogger = LogManager.getLogger(GenericUtils.class.getName());

	
	public static String getPropertyValue(String key){
		
		
		Properties prop = new Properties();
		try {
			FileInputStream f = new FileInputStream("c:/config.xml");
			prop.loadFromXML(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	public static void main(String [] args)
	{
		BasicConfigurator.configure();
		
		//Create a console appender and attach it to our mainLogger
		ConsoleAppender appender = new ConsoleAppender();
		
		mainLogger.addAppender(appender);
		mainLogger.info("This is just a logger line");
		
		System.out.println(getPropertyValue("appURLA"));
	}
}
