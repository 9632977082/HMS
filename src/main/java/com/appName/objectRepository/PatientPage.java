package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class PatientPage {
	
	public PatientPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
@FindBy(xpath = "//i[@class='ti-angle-down']")
private WebElement userProfileDropDown;

@FindBy(xpath = "//a[contains(text(),'Log Out')]")
private WebElement logOutButton;

@FindBy(xpath = "//a[contains(text(),'My Profile')]")
private WebElement myProfileButton;

@FindBy(xpath = "//span[text()=' Book Appointment ']")
private WebElement bookAppointmentButton;

public void getbookAppointmentButton()
{
	bookAppointmentButton.click();	
}
public void getmyProfileButton()
{
	myProfileButton.click();
}

public WebElement getUserProfileDropDown()
{
	return userProfileDropDown;
}

public void getLogOutButton()
{
	logOutButton.click();
}

}
