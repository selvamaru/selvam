package org.sample.sample;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensHome extends GreensBase
{
	
	public GreensHome() 
	{
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "activeLink")
	private WebElement home;	
	public WebElement getHome()
	{
		return home;
	}
	@FindBy(xpath="//div")
	private List<WebElement> greens;
	
	public List<WebElement> getGreens() 
	{
		return greens;
	}
	
	@FindBy(xpath="//h1")
	private WebElement head;

	public WebElement getHead() 
	{
		return head;
	}
		


}
