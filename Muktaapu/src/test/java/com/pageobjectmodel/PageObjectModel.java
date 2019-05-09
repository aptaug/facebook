package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	public class PageObjectModels {
		WebDriver driver;
		

		public PageObjectModels (WebDriver driver) {
			//"this" is the constructor keyword 
			this.driver=driver;
			
//PageFactory is selenium interface and initElements is the methods.
			PageFactory.initElements(driver, this);	
		}// end of the constructor
		// selenium annotations
		@FindBy(xpath="//*[@id='username']")
		
		private WebElement Username;

		public WebElement getUsername() {
			return Username;
		}
		@FindBy(xpath="//*[@id='password']")
		private WebElement Password;

		public WebElement getUserpassword() {
			return Password;
		}
		@FindBy(xpath="//*[@id='Login']")
		private WebElement Login;

		public WebElement getLogin() {
			return Login;
		}
		

		

		

	}// end of class
}
