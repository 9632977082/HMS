package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class AdminDashBoardPage {
	public AdminDashBoardPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//i[@class='ti-angle-down']")
	private WebElement adminProfileDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement adminLogoutButton;

	@FindBy(xpath = "//a[contains(text(),'Total Patients')]")
	private WebElement managePatientsButton;
	
	@FindBy(xpath = "//span[text()=' Doctors ']")
	private WebElement doctorsButton;
	
	@FindBy(xpath = "//span[text()=' Add Doctor']")
	private WebElement addDoctorButton;
	
	@FindBy()
	private WebElement manageDoctorsButton;
	
	public void getManageDoctorsButton()
	{
		manageDoctorsButton.click();
	}
	
	public void getAddDoctorButton()
	{
		addDoctorButton.click();
	}
	
	public void getDoctorsButton()
	{
		doctorsButton.click();
	}
	
	public void getManagePatientsButton()
	{
		managePatientsButton.click();
	}
	
	public void getAdminProfileDropDown()
	{
		adminProfileDropDown.click();
	}
	
	public void getAdminLogoutButton()
	{
		adminLogoutButton.click();
	}
}
