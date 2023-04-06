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
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-dark']/li[3]")
	private WebElement  LogOut_patient;
	@FindBy(xpath = "//div[@class='container-fluid container-fullw bg-white']/descendant::div/div[3]/descendant::p")
	private  WebElement AppointMent;
	@FindBy(xpath = "//ul[@class='main-navigation-menu']/li[5]")
	private    WebElement appointmentHistory;

	public WebElement getLogOut_patient() 
	{
		return LogOut_patient;
	}

	

	public WebElement getAppointMent() 
	{
		return AppointMent;
	}

	public User_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public WebElement getTestGmailCom() 
	{
		return testGmailCom;
	}

	public WebElement getMyProfile() 

	{
		return MyProfile;
	}
	public WebElement getAppointmentHistory() 
	{
		return appointmentHistory;
	}
	

	public void toClickOnMyProfile()
	{
		testGmailCom.click();
		MyProfile.click();
	}
	public void Logout()
	{
		testGmailCom.click();
		LogOut_patient.click();
	}
	public void Appointment()
	{
		AppointMent.click();
	}
    public void AppointHistory()
    {
    	appointmentHistory.click();
    }
}
