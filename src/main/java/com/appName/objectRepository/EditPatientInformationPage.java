package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPatientInformationPage 
{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='panel-body']/form/div[3]/input")
	private  WebElement Location;
	@FindBy(xpath = "//div[@class='panel-body']/form/button")
	private   WebElement	Submit;

	public  EditPatientInformationPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getLocation() 
	{
		return Location;
	}

	public WebElement getSubmit() 
	{
		return Submit;
	}
	
	public void EditPageInformation(String data)
	{
		Location.clear();
		Location.sendKeys(data);
		Submit.click();
	}


}
