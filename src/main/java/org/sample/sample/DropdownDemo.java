package org.sample.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class DropdownDemo {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selvam\\eclipse-workspace\\Greens\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		WebElement dCountry = driver.findElement(By.id("dropdown_7"));
	    Select s = new Select(dCountry);
	//	To select dropdown "India"
		/*s.selectByIndex(3);
		 s.selectByValue("India");
		 s.selectByVisibleText("India");*/
		 
		 //To print all dropdown
//List<WebElement> aoptions = s.getOptions();		

//using for each
/*for (WebElement x : aoptions) {
	System.out.println(x.getText());
}*/
		
//To select only India
		 
/*for (WebElement x : aoptions) {
	if(x.getText().equals("India")) {
		 s.selectByValue("India");
		System.out.println(x.getText());
	}
}*/
//To print selected value
/*s.selectByIndex(3);
List<WebElement> aSelectedOptions = s.getAllSelectedOptions();
for (WebElement x : aSelectedOptions) {
	System.out.println(x.getText());
}*/

//To select multiple values
		/* WebElement dCountry = driver.findElement(By.id("dropdown_7"));
		 Select s = new Select(dCountry);
		 s.selectByIndex(0);
		 s.selectByIndex(1);
		 s.selectByIndex(2);
		*/
//Select First Selected option
	/*  List<WebElement> a = s.getOptions();	
	  for (int i = 0; i<a.size();  i++) {
		  
		s.selectByIndex(i);
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		boolean b = s.isMultiple();
		if(b==true) {
			for (WebElement x : a) {
				s.selectByVisibleText(x.getText());
				
			}
		}
	}*/

	    
	    //deselect
/*
s.deselectByIndex(3);	
s.deselectByValue("India");
s.deselectByVisibleText("India");
s.deselectAll();*/

	 //driver.quit();
		 
	}

}
