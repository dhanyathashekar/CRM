package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass

{
  @Test
  public void validateLogin() 
  {
	 String nextPageurl= lp.doLogin("test@gamil.com","test123");
	  Assert.assertTrue(nextPageurl.contains("customers"),"test Fail: Test fail");
	  System.out.println("Test pass: Login completed");
  }
}