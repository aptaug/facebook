package com.ades;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				//	WebDriver driver = new FirefoxDriver();
			driver.get("https:\\login.salesforce.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		}

	}


