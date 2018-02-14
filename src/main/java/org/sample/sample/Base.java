package org.sample.sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base {

	
	static WebDriver driver;
	public static void main(String[] args) {
		Base b=new Base();
	
		b.screent(driver,"SreenShot");
	}

	public static void screent(WebDriver element,String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);

		try {
			org.apache.commons.io.FileUtils.copyFile(f, new File("C:\\Core Java video\\" + name + ".png"));

		} catch (IOException e) {
		}

	}
}
