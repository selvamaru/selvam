package org.sample.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=6294306031&pf_rd_p=653617ec-2f16-4a47-bd41-5afceb46a6ea&pf_rd_r=HTY45PKNP3A6HC36GGBG");
		WebElement parentBtn = driver.findElement(By.xpath("//span[text()='Category']"));
		Actions acc=new Actions(driver);
	    Actions a = acc.moveToElement(parentBtn);
		a.build().perform();
		
		WebElement giftcard = driver.findElement(By.xpath("//span[text()='Gift Cards'][1]"));
		Actions acc1=new Actions(driver);
	    Actions a1 = acc1.moveToElement(giftcard);
		a1.build().perform();
		
		WebElement allgiftcard = driver.findElement(By.xpath("//a[@href='/gift-card-store/b/ref=nav_shopall_sbc_gc_all?ie=UTF8&node=3704982031']"));
		Actions acc2=new Actions(driver);
	    Actions a2 = acc2.moveToElement(allgiftcard);
		a2.build().perform();
		allgiftcard.click();
		//driver.findElement(By.xpath("//div[contains(text(),'Your recently viewed items and featured recommendations')][1]"));
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		jscript.executeScript("window.scrollBy(0,7700)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/gp/navigation/redirector.html/ref=sign-in-redirect?ie=UTF8&associationHandle=inflex&currentPageURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Drhf_custrec_signin&pageType=&switchAccount=&yshURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Drhf_custrec_signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		WebElement user = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		user.sendKeys("Selvam");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		phone.sendKeys("9710698026");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Selvam@123");

		

	}

}
