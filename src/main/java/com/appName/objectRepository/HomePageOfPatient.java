package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

// create the class as webpage name and make it as public
public final class HomePageOfPatient {
	
	// declar and specify the accesss specifier as private

@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Dashboard']")
private WebElement dashboard;
@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Book Appointment']")
private WebElement bookAppointment;
@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Appointment History']") 
private WebElement appointmentHistory;
@FindBy(xpath = "//span[@class='title' and normalize-space(text())='Medical History']")
private WebElement medicalHistory;
@FindBy(xpath = "//h2[text()='My Profile']/parent::div//a") 
private WebElement myProfile;
@FindBy(xpath = "//span[@class='username']")
private WebElement patientProfileDropDown;
@FindBy(xpath = "//a[normalize-space(text())='Log Out']") 
private WebElement logOut;


public HomePageOfPatient(WebDriver driver) {
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
public void clickBookAppointment()  {
	bookAppointment.click();
}
public void clickOnMedicalHistory() {
	medicalHistory.click();
}
public void clickOnLogout() {
	patientProfileDropDown.click();
	logOut.click();
}


}