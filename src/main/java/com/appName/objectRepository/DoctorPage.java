package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorPage 
{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='col-sm-4']/descendant::p/a")
	private   WebElement Myprofile;
	@FindBy(xpath = "//button[@name='submit']")
	private   WebElement submit;
	@FindBy(xpath = "//ul[@class='nav navbar-right']/li[2]/a")
	private  WebElement  TestDrop;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-dark']/li[3]/a")
	private   WebElement Doc_logout;

	public WebDriver getDriver() {
		return driver;
	}

	

	public  DoctorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyprofile() 
	{
		return Myprofile;
	}

	public WebElement getSubmit() 
	{
		return submit;
	}
	public WebElement getTestDrop() 
	{
		return TestDrop;
	}

	public WebElement getDoc_logout() 
	{
		return Doc_logout;
	}

	public void toUpdatProfile()
	{
		Myprofile.click();
		submit.click();
	}
   public void logout()
   {
	   TestDrop.click();
	   Doc_logout.click();
   }
}
