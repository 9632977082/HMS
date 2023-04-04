package com.appName.objectRepository.oginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath ="//h3[text()='Admin Login']/parent::div//a") 
	private WebElement adminClickBtn;
	@FindBy(xpath ="//h3[text()='Patients']/parent::div//a")
	private WebElement patientClickBtn;
	@FindBy(xpath="//h3[text()='Doctors Login']/parent::div//a")
	private WebElement doctorClickBtn;
	@FindBy(name = "username") 
	private WebElement USNTxtBx;
	@FindBy(name = "password")
	private WebElement PWDTxtBx;
	@FindBy(name = "submit")
	private WebElement LoginBtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginASPatient(String patientUsername,String patientPwd) {
		patientClickBtn.click();
		USNTxtBx.sendKeys(patientUsername);
		PWDTxtBx.sendKeys(patientPwd);
		LoginBtn.click();


	}
	public void loginAsDoctor(String doctorUsername,String doctorPwd) {
		doctorClickBtn.click();
		USNTxtBx.sendKeys(doctorUsername);
		PWDTxtBx.sendKeys(doctorPwd);
		LoginBtn.click();
	}
	public void loginAsAdmin(String adminUsername,String adminPwd) {
		adminClickBtn.click();
		USNTxtBx.sendKeys(adminUsername);
		PWDTxtBx.sendKeys(adminPwd);
		LoginBtn.click();

	}
}
