package com.hcentive.automation.commonutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GenericUtils {
	
	
	public static String getPropertyValue(String key){

		Properties prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream("config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
//	public static void main(String [] args)
//	{
//		System.out.println(getPropertyValue("appURL"));
//	}
}
