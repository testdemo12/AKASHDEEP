package org.Google.Pages;

import org.Google.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void searchfield(String locator,String text) throws Exception {
		
	driver.findElement(By.xpath(locator)).sendKeys(text);
	}
	
	public void click(String locator) throws Exception {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void link(String linktext) {
		String text=driver.findElement(By.linkText(linktext)).getText();
		System.out.println(text);
		
	}
	
	
	

}
