package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class Page_Object_Manager {

	public static WebDriver driver;
	
	private LoginPage lp;
	
	
	public Page_Object_Manager(WebDriver driver2) {
	    this.driver = driver2;
	}

	public LoginPage getInstanceLoginpage() {
		lp = new LoginPage(driver);
		return lp;
		
	}
	
	
}
