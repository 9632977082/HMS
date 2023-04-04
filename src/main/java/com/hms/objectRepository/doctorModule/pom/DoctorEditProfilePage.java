package com.hms.objectRepository.doctorModule.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this pom class contains webelements of edit profile of doctor module
 * @author pprad
 *
 */
public class DoctorEditProfilePage {
	@FindBy(name = "Doctorspecialization") private WebElement doctorSpecialization;
	@FindBy(name = "docname") private WebElement docName;
	@FindBy(name = "clinicaddress") private WebElement docAddress;
	@FindBy(name = "docfees") private WebElement docFees;
	@FindBy(name = "doccontact") private WebElement docContact;
	@FindBy(name = "submit") private WebElement submitBtn;
	
	
	public DoctorEditProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDoctorSpecializationList() {
		return doctorSpecialization;
	}
	public void editDoctorName(String name) {
		docName.clear();
		docName.sendKeys(name);
	}
	public void editDoctorAddress(String address) {
		docAddress.clear();
		docAddress.sendKeys(address);
	}
	public void editDoctorFees(String fees) {
		docFees.clear();
		docFees.sendKeys(fees);
	}
	public void editDoctorContactNum(String contactNum) {
		docContact.clear();
		docContact.sendKeys(contactNum);
	}
	public void clickOnSubmit() {
		submitBtn.click();
	}
	public WebElement getDoctorName() {
		return docName;
	}
	public WebElement getDocAddress() {
		return docAddress;
	}
	public WebElement getDocContactNum() {
		return docContact;
	}

}
