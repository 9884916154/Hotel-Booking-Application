package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.Page_Object_Manager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base_class {

	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	//LoginPage lp = new LoginPage(driver);
	
	@Given("^User want to launch the adactin application$")
	public void user_want_to_launch_the_adactin_application() throws Throwable {
	String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);	
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
	//inputValueElement(lp.getUsername(), "vinovicky");
		inputValueElement(pom.getInstanceLoginpage().getUsername(), "vinovicky");
	}

	@When("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
	//inputValueElement(lp.getPassword(), "GMN630");
		inputValueElement(pom.getInstanceLoginpage().getPassword(), "GMN630");
	}

	@Then("^User verify the valid username and password$")
	public void user_the_valid_username_and_password()throws Throwable {
		//ClickOnElement(lp.getLogin());
		ClickOnElement(pom.getInstanceLoginpage().getLogin());
	}
}