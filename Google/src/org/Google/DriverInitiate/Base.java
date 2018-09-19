package org.Google.DriverInitiate;

import java.util.concurrent.TimeUnit;

import org.Google.Utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {

	public	WebDriver driver;
	@BeforeMethod
	public void initial() throws Exception
	{
		if(Utility.getproperty("Browser").equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();


		}

		else if(Utility.getproperty("Browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new ChromeDriver();
		}
		else if(Utility.getproperty("Browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Driver/InternetExplorerDriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(Utility.getproperty("URL"));
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

}
