package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorLogin 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	private  WebElement  user_text;
	@FindBy(xpath = "//input[@name='password']")
	private  WebElement PW_text;
	@FindBy(xpath = "//button[@name='submit']" )
	private   WebElement submit;
	
	



	public DoctorLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser_text() {
		return user_text;
	}

	public WebElement getPW_text() {
		return PW_text;
	}

	public WebElement getSubmit() {
		return submit;
	}

    public void DoctorsLogin(String USER ,String PWD)
    {
    	user_text.sendKeys(USER);
    	PW_text.sendKeys(PWD);
    	submit.click();
    }
}
