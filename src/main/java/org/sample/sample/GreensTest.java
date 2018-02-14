package org.sample.sample;



public class GreensTest extends GreensBase {
	public static void main(String[] args) throws InterruptedException 
	{
		getDriver();
		GreensHome hom = new GreensHome();
		clickHome(hom.getHome());
		title(driver);
		geturl(driver);
		greensCount(driver,hom.getGreens());
		gethead(driver, hom.getHead());
		
					
	}


}
