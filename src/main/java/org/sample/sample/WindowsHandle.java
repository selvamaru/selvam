package org.sample.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		
		WebElement btnLogin = driver.findElement(By.xpath("(//a[text()='LOGIN NOW'])[1]"));
		String windowParentId = driver.getWindowHandle();
		System.out.println(windowParentId);
		btnLogin.click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String x : allwindows) {
			if (! x.equals(windowParentId)) {
				System.out.println(x);
				driver.switchTo().window(x);
				Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//input[@id='User_Id']"));
		login.sendKeys("dakshna");
		
				
			}
			
		}
		
		driver.switchTo().window(windowParentId);
	}

}
