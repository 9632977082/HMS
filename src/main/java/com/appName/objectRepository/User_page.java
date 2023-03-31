package com.appName.objectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_page 
{
	WebDriver driver;
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private   WebElement  testGmailCom;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-dark']/li[1]")
	private       WebElement MyProfile;
	
	public User_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public WebElement getTestGmailCom() {
		return testGmailCom;
	}

	public WebElement getMyProfile() 
	
	{
		return MyProfile;
	}
	
	public void toClickOnMyProfile()
	{
		testGmailCom.click();
		MyProfile.click();
	}
	

}
