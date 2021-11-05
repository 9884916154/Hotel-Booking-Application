package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader { 
	public static Properties pro; 
	
	public Configuration_Reader() throws Throwable{

	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Batch\\src\\test\\java\\com\\adactin\\configuration\\adactin.properties");

      FileInputStream fis = new FileInputStream(f);
      pro =  new Properties();
      pro.load(fis);
	}
	
	public String getBrowser() {
    String browser = pro.getProperty("browser");
    return browser;
	}
	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
		
	}
	
}
