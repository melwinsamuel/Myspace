package test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_scripts.Base_test;
import pom_scripts.Pom_gmail;

public class gmail_login_test_script extends Base_test
{
	public WebDriver driver;
	@Test
	public void login_script() throws InterruptedException
	{
		Pom_gmail PL = new Pom_gmail(driver);
		Thread.sleep(2000);
		PL.username_textfield();
		Thread.sleep(3000);
		PL.username_nextbutton();
		Thread.sleep(3000);
		PL.password_textfield();
		Thread.sleep(3000);
		PL.password_nextbutton();
				
		
	}
}
