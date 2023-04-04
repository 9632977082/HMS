package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public final class LoginPage {

	@FindBy(name = "username") 
	private WebElement USNTxtBx;
	
	@FindBy(name = "password")
	private WebElement PWDTxtBx;
	
	@FindBy(name = "submit")
	private WebElement LoginBtn;
		
	@FindBy(xpath ="//h3[text()='Patients']/parent::div//a")
	private WebElement patientClickBtn;


	public LoginPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	

//business library	
	public  void loginAction(String userName, String password) {
		patientClickBtn.click();
		USNTxtBx.sendKeys(userName);
		PWDTxtBx.sendKeys(password);
		LoginBtn.click();
		UtilityClass.getTest().info("Login Successfully with credentials");
	}
}
