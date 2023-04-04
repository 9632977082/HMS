package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public final class LoginPage {

	
	@FindBy(name="username")
	private  WebElement userNameTxt;
	
	@FindBy(name="password" )
	private   WebElement passwordTxt;
	
	@FindBy(name="submit")
	private  WebElement loginBtn;
		
	public LoginPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	

//business library	
	public  void loginAction(String userName, String password) {
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		loginBtn.click();
		UtilityClass.getTest().info("Login Successfully with credentials");
	}
}
