package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class HomePage 
{
	WebDriver driver;
	@FindBy(xpath = "//a[@href='hms/user-login.php']")
	private	WebElement Patient;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public WebElement getPatient() 
	{
		return Patient;
	}
	public void PatientModule()
	{
		Patient.click();
	}



}
