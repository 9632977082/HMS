package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class AdminLoginPage {
	public AdminLoginPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
				}
	
	@FindBy(name="username")
	private WebElement aUserNameTextField;
	
	@FindBy(name="password")
	private WebElement aPasswordTextField;
	
	@FindBy(name="submit")
	private WebElement aLoginButton;
	
	public void getAUserNameTextField(String ausername)
	{
		aUserNameTextField.sendKeys(ausername);
	}
	
	public void getAPasswordTextField(String apassword)
	{
		aPasswordTextField.sendKeys(apassword);
	}
	
	public void getALoginButton()
	{
		aLoginButton.click();
	}
}
