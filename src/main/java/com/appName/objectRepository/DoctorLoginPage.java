package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class DoctorLoginPage {
	public DoctorLoginPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	@FindBy(name = "username")
	private WebElement dUserNameTextField;
	
	@FindBy(name="password")
	private WebElement dPassword;
	
	@FindBy(name = "submit")
	private WebElement dLoginButton;
	
	public void getDLoginButton()
	{
		dLoginButton.click();
	}
	public void getdUserNameTextField(String userName)
	{
		dUserNameTextField.sendKeys(userName);
	}
	
	public void getdPassword(String password)
	{
		dPassword.sendKeys(password);
	}
}
