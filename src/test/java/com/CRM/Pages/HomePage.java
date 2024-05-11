package com.CRM.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.Utility.Utility;

public class HomePage {

	//Encapsulation Identification(locators) + Actions
	
	
	private WebDriver driver;
	
	//Initialize driver
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver; //Base class driver local
		
	}
	
	//locator
	
	private By link=By.linkText("Sign In");
	
	//method
	
	public String getAppTitle()
	{
		return driver.getTitle();
		
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	public String getSignIn()
	{
		Utility.capture(driver);
		driver.findElement(link).click();
		Utility.capture(driver);
		return driver.getCurrentUrl();
	}
	
}

