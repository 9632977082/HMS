package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class AddDoctorPage {
	public AddDoctorPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement doctorspecializationDropDown;
	
	@FindBy (name = "docname")
	private WebElement doctorNameTextField;
	
	@FindBy (name = "clinicaddress")
	private WebElement doctorClickAddressTextField;
	
	@FindBy (name = "docfees")
	private WebElement doctorFeesTextField;
	
	@FindBy (name="doccontact")
	private WebElement doctorContactNumberTextField;
	
	@FindBy (name="docemail")
	private WebElement doctorEmailTextField;
	
	@FindBy (name="npass")
	private WebElement doctorPasswordTextField;
	
	@FindBy (name="cfpass")
	private WebElement doctorConfirmPasswordTextField;

	@FindBy(xpath = "//button[@name='submit' and @id='submit']")
	private WebElement aSubmitButton;
	
	public void getASubmitButton()
	{
		aSubmitButton.click();
	}
	
	public void getDoctorClickAddressTextField(String address) {
		doctorClickAddressTextField.sendKeys(address);;
	}

	public WebElement getDoctorspecializationDropDown() {
		 return doctorspecializationDropDown;
	}

	public void getDoctorNameTextField(String doctorName) {
		 doctorNameTextField.sendKeys(doctorName);;
	}

	public void getDoctorFeesTextField(String fees) {
		 doctorFeesTextField.sendKeys(fees);;
	}

	public void getDoctorContactNumberTextField(String doctorNumber) {
		 doctorContactNumberTextField.sendKeys(doctorNumber);;
	}

	public void getDoctorEmailTextField(String doctorEmail) {
		 doctorEmailTextField.sendKeys(doctorEmail);;
	}

	public void getDoctorPasswordTextField(String doctorPassword) {
		 doctorPasswordTextField.sendKeys(doctorPassword);;
	}

	public void getDoctorConfirmPasswordTextField(String doctorPassword) {
		 doctorConfirmPasswordTextField.sendKeys(doctorPassword);;
	}
}
