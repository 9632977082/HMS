package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	private  WebElement UN;
	@FindBy(xpath = "//input[@name='password']")
	private   WebElement PW;
	@FindBy(xpath = "//button[@name='submit']")
	private     WebElement	Pateint_Login;
	 	
     public LoginPage(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }

	

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPW() {
		return PW;
	}

	public WebElement getPateint_Login() {
		return Pateint_Login;
	}
   public void Log_in(String un,String pw)
   {
	   UN.sendKeys(un);
	   PW.sendKeys(pw);
	   Pateint_Login.click();
   }

}
