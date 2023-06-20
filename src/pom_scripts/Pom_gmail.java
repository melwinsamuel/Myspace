package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_scripts.Base_page;

public class Pom_gmail extends Base_page
         
{
	
	 @FindBy(xpath="//div [ @ jsname='YRMmle' and text()='Email or phone']"	)
	 private WebElement username;
	 
	 @FindBy(xpath = "//span [@ class='VfPpkd-vQzf8d' and .='Next']")
	 private WebElement usernamenextbutton;
	 
	 @FindBy(xpath = "// div[@class='AxOyFc snByac' and text()='Enter your password']")
	 private WebElement password;	 
	 
	 @FindBy(xpath="//span [@ jsname='V67aGc' and text()='Next']")
	private WebElement  passwordnextbutton;
	 
	 public Pom_gmail(WebDriver driver)
	 {
		 super(driver);
		 
		 
	 }
	 
	 public void username_textfield()
	 {
		 System.out.println("done");
		 username.sendKeys("melwin.samuel096@gmail.com");
		 
		 
	 }
	 
	 public void username_nextbutton()
	 {
		 usernamenextbutton.click();
	 }
	 
	 public void password_textfield()
	 {
		 password.sendKeys("Automationtestengineer01@");
	 }
	 
	 public void password_nextbutton()
	 {
		 passwordnextbutton.click();
	 }	
	 }
