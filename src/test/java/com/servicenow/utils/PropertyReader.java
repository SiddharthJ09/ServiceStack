package com.servicenow.utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	
	
	public static String get(String property) throws IOException{
		
		Properties prop = new Properties();
		InputStream input = null;

		

			input = new FileInputStream("C:\\Users\\hp-pc\\Desktop\\ServiceStack\\ServiceNow\\resources\\application_config.prsoperties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			
		
		return prop.getProperty(property);
		
	}
	
	

}
