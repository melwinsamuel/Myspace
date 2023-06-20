package generic_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_test implements frameworkconstants


{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() throws InterruptedException
	{
		System.setProperty(chromekey,chromevalue);	
		driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.get(gmailbaseurl);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
	
	@AfterMethod
	public void closeapp()
	
	{
		driver.close();
				
	}
}
