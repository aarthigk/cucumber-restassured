package com.apiTest.ApiTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BaseStepDefinition {
	
	@Given("I want to launch google.com")
	public void i_want_to_launch_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		
		 String chromePath="src/test/resources/drivers/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver",chromePath);
		 WebDriver driver=new ChromeDriver();
		
	    
	}

	@And("enter api in search box")
	public void enter_api_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click the first result")
	public void i_click_the_first_result() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("new page gets open")
	public void new_page_gets_open() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I validate a text in it")
	public void i_validate_a_text_in_it() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
