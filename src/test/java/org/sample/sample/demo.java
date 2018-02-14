package org.sample.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo {

	static WebDriver driver;

	@Given("^I am on Demoqa home page$")
	public void i_am_on_Demoqa_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
	}

	@When("^I enter firstname and lastname$")
	public void i_enter_firstname_and_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("name_3_firstname")).sendKeys("Selvam");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Arumugam");
	}

	@Then("^I verify firstname and lastname$")
	public void i_verify_firstname_and_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				driver.quit();
	}

}



