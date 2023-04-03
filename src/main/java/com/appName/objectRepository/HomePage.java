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
	@FindBy(xpath = "//a[@href='hms/admin']")
	private   WebElement	Admin;
	@FindBy(xpath = "//a[@href='hms/doctor/']")
	private  WebElement doctor;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getAdmin() {
		return Admin;
	}


	public WebElement getDoctor() {
		return doctor;
	}


	public WebElement getPatient() 
	{
		return Patient;
	}
	public void PatientModule()
	{
		Patient.click();
	}
	public void AdminModule()
	{
		Admin.click();
	}
    public void DoctorModule()
    {
    	doctor.click();
    }


}
