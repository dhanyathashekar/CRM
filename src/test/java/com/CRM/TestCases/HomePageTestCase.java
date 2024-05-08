package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass

{
  @Test(priority = 1)
  public void validateURL() 
  
  {
	 // HomePage hp=new HomePage(driver);
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: URL not match");
	  System.out.println("Test pass: URL matched!");
  }
  
  @Test(priority = 2)
  public void validateTitle() 
  
  {
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Test fail: title mismatch");
	  System.out.println("Test pass: Title matched!");
  }
  
  @Test(priority = 3)
  public void validateSignIn() 
  
  {
	  String actUrl=hp.getSignIn();
	  Assert.assertTrue(actUrl.contains("login"),"Test Fail: User is not navigated");
	  System.out.println("Test pass: User navigated");
  }
}
