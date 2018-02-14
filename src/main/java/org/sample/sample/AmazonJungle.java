package org.sample.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonJungle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=ap_frn_logo");
		
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		jscript.executeScript("window.scrollTo(0, document.body.scrollHeight);");
 String s = driver.findElement(By.xpath("//a[text()='Junglee.com']")).getText();
		System.out.println(s);

	}

}
