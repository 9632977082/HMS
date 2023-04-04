package com.hms.objectRepository.doctorModule.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this pom class contains common webelements of Doctor module 
 * @author pprad
 *
 */
public class DoctorCommonPage {
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Dashboard']") private WebElement dashboard;
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Appointment History']") private WebElement appointmentHistory;
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Patients']") private WebElement patients;
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Add Patient']") private WebElement  addPatient;
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Manage Patient']") private WebElement   managePatient ;
	@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Search']") private WebElement   searchPatient ;
	@FindBy(xpath = "//h2[text()='My Profile']/parent::div//a") private WebElement myProfile;
	@FindBy(xpath = "//span[@class='username']") private WebElement doctorProfileDropDown;
	@FindBy(xpath = "//a[normalize-space(text())='Log Out']") private WebElement logOut;
	
	
public DoctorCommonPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

/**
 * this method first clicks dashboard and then click on myrofile button
 */
public void clickOnUpdateProfile() {
	dashboard.click();
	myProfile.click();
}

/**
 * this method click on appointment history button
 */
public void clickOnAppointmentHistory() {
	appointmentHistory.click();
}
public void clickOnAddPatient()  {
	patients.click();
	addPatient.click();
}
public void clickOnManagePatient() {
	patients.click();
	managePatient.click();
}
public void clickOnSearchPatient() {
	searchPatient.click();
}
public void clickOnLogout() {
	doctorProfileDropDown.click();
	logOut.click();
}


}
