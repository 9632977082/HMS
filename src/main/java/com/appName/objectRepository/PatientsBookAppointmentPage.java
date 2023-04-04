package com.appName.objectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orgName.genericUtility.UtilityClass;

public class PatientsBookAppointmentPage {
	
	public PatientsBookAppointmentPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
@FindBy(xpath = "//select[@name='Doctorspecialization']")
private WebElement doctorspecializationDropDown;

@FindBy(xpath="//select[@name='doctor' and @id='doctor']")
private WebElement doctorNameDropDown;

@FindBy(name="appdate")
private WebElement dateTextField;

@FindBy(name ="submit")
private WebElement appointmentSubmitButton;

@FindBy(name = "apptime")
private WebElement appointmentTime;

public void getappointmentTime(String time)
{
	appointmentTime.clear();
	appointmentTime.sendKeys(time,Keys.ENTER);
}
public void getappointmentSubmitButton()
{
	appointmentSubmitButton.click();
}

public void getdateTextField(String date)
{
	dateTextField.click();
	dateTextField.sendKeys(date, Keys.ENTER);
}

public WebElement getdoctorNameDropDown()
{
	return doctorNameDropDown;
}
public WebElement getdoctorspecializationDropDown()
{
	return doctorspecializationDropDown;
}


}
