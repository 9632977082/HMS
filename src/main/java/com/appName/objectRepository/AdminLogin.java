package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	private  WebElement UserTextField;
	@FindBy(xpath = "//input[@name='password']")
	private  WebElement PwdTextField;
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement login;
	
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserTextField() 
	{
		return UserTextField;
	}

	public WebElement getPwdTextField() 
	
	{
		return PwdTextField;
	}
	
	public WebElement getLogin() 
	{
		return login;
	}   
	public void Adminlogin(String USER,String PWD)
	{
		UserTextField.sendKeys(USER);
		PwdTextField.sendKeys(PWD);
		login.click();
	}
	

}
