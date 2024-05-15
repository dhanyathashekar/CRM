package seleniumGridUsingDocker;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {
  @Test
  public void testGridSetup() throws InterruptedException, MalformedURLException 
  {
	  ChromeOptions options=new ChromeOptions();
	WebDriver driver = new RemoteWebDriver (new URL("http://localhost:4444/"),options); 
	System.out.println("Remote connection established with chrome!");
	Thread.sleep(4000);
	driver.get("https://www.amazon.in");
	Thread.sleep(4000);
	System.out.println("Application will launch:"+driver.getCurrentUrl());
	  driver.quit();
	  System.out.println("Server connection closed!");
  }
}
