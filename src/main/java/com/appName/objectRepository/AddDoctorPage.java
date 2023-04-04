package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDoctorPage 
{
	WebDriver driver;


	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private   WebElement Specialization;
	@FindBy(xpath = "//label[@for='doctorname']/following-sibling::input[@name='docname']")
	private   WebElement DocName;
	@FindBy(xpath = "//textarea[@name='clinicaddress']")
	private   WebElement addAddress;
	@FindBy(xpath = "//input[@name='docfees']")
	private  WebElement fee;
	

	
	@FindBy(xpath = "//input[@name='doccontact']")
	private   WebElement contact;
	@FindBy(xpath = "//input[@id='docemail']")
	private   WebElement email;
	@FindBy(xpath = "//input[@placeholder='New Password']")
	private   WebElement	password;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	private  WebElement confirmPassword;
	@FindBy(xpath = "//button[@type='submit']")
	 private  WebElement submit;

	public AddDoctorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSpecialization() 
	{
		return Specialization;
	}
	public WebElement getDocName() 
	{
		return DocName;
	}
	public WebElement getAddAddress() 
	{
		return addAddress;
	}
	public WebElement getFee() 
	{
		return fee;
	}
	public WebElement getContact() 
	{
		return contact;
	}
	public WebElement getEmail() 
	{
		return email;
	}
	public WebElement getPassword() 
	{
		return password;
	}
	public WebElement getConfirmPassword()
	{
		return confirmPassword;
	}
	public WebElement getSubmit() 
	{
		return submit;
	}
	public void prvoideDoctorDetials(String DoctorName ,String address,String feez,String contact1,String email1,String pwd)
	{
		DocName.sendKeys(DoctorName);
		addAddress.sendKeys(address);
		fee.sendKeys(feez);
		contact.sendKeys(contact1);
		email.sendKeys(email1);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(pwd);
		submit.click();
	}

}
