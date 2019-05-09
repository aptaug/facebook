package com.ades;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Creafv {
public static WebDriver driver;
	public static   WebDriver browser(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			//	WebDriver driver = new FirefoxDriver();
		driver.get("https:\\login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;

	}

}
