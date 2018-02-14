package org.sample.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytmmall.com/login");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("selvam@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("selva123");
		driver.findElement(By.xpath("//button[@type='submit']//*[contains(text(),'Secure Login')]")).click();
		driver.close();
	}

}
