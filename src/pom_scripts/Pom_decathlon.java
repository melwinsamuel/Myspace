package pom_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_decathlon 
{
	@FindBy(xpath="//p[.='Sign In']")
	private WebElement signin;
	
	@FindBy(xpath="//div[.='SignUp']")
	private WebElement signup;
	
	@FindBy(xpath="//div [text()='Enter your email/phone number']")
	private WebElement username;
	
	@FindBy(xpath="//button [text()='Continue'")
	private WebElement continue_buttom ;
	
	
}
