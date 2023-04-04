package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class PatientLoginPage {
	
	public PatientLoginPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
				}
	
	@FindBy(name = "username")
	private WebElement pUn;

	@FindBy(name = "password")
	private WebElement pPw;

	@FindBy(name = "submit")
	private WebElement pLogin;
	
	public void pUn(String patientUn)
	{
		pUn.sendKeys(patientUn);
	}

	public void pPw(String patientPw)
	{
		pPw.sendKeys(patientPw);
	}

	public void pLogin()
	{
		pLogin.click();
	}
	
}
