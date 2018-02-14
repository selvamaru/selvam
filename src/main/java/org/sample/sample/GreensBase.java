package org.sample.sample;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensBase {
	public static WebDriver driver;
	public static String gre;
	private static String s="greens";
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		return driver;
	}
public static void setText(WebElement element,String name) {
	element.sendKeys(name);
	
}
public static void closeApplication(WebDriver driver)
{
	driver.quit();
}
public static void clickHome(WebElement clk) 
{
clk.click();
}
public static void title(WebDriver tit)
{
String title = tit.getTitle();
System.out.println(title);
}

public static void geturl(WebDriver url)
{
String currentUrl = url.getCurrentUrl();
 System.out.println(currentUrl);
}
public static void greensCount(WebDriver driver, List<WebElement> el) 
{
	int count=0;
	System.out.println("GREENS HOME");       
      for ( WebElement e : el ) 
      {
     	String gre = e.getText();
     
     	for (String spl:gre.split("\\s",0))
     	{
     		if(spl.equalsIgnoreCase(s))
     		{
     			count++;        			
     		}
     	}
     	System.out.println("The word GREENS repeated as :"+count+" times");
     	break;
             	
     }
}
public static void gethead(WebDriver driver, WebElement head)
{
	System.out.println("The Head Line of this para");
    String text = head.getText();
    System.out.println(text);
    
}

}
