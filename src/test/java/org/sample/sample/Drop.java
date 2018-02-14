package org.sample.sample;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Drop {
	static WebDriver driver;
	
	
	@Given("^I am in demoqa registration page$")
	public void i_am_in_demoqa_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
	}

	@When("^I select countries$")
	public void i_select_countries() throws Throwable {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		List<WebElement> countryList = s.getOptions();
		for (int i = 0; i <= 4; i++) {
			String text = countryList.get(i).getText();
			System.out.println(text);
		}
	}

	@Then("^I verify the selected countries$")
	public void i_verify_the_selected_countries() throws Throwable {
		driver.close();
			
	}	
	
	/*@Given("^I am in Demoqa home page$")
	public void i_am_in_Demoqa_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();	}

	@When("^I Select Country$")
	public void i_Select_Country() throws Throwable {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		List<WebElement> countryList = s.getOptions();
		for (int i = 0; i <= 4; i++) {
		 String text = countryList.get(i).getText();
			
			//System.out.println(text);
		}
			
	}
	
	@Then("^I verify Country \"([^\"]*)\"$")
	public void i_verify_Country(String country) throws Throwable {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		List<WebElement> countryList = s.getOptions();
		for (int i = 0; i <= 4; i++) {
			String text = countryList.get(i).getText();
			//s.selectByIndex(i);
		System.out.println(text);
		if(country.equals(text))
			{
			System.out.println(text);
			}
		}
*/		
	
}



