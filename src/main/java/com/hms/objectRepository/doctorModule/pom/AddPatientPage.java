package com.hms.objectRepository.doctorModule.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatientPage {
	
	@FindBy(name = "patname") private WebElement patNameTxtBx;
	@FindBy(name = "patcontact") private WebElement patContactNumTxtBx;
	@FindBy(id = "patemail") private WebElement patMailTxtBx;
	@FindBy(xpath = "//label[@for='rg-male']") private WebElement patGenderMale;
	@FindBy(name = "pataddress") private WebElement patAdress;
	@FindBy(name = "patage") private WebElement patAge;
	@FindBy(name = "medhis") private WebElement patMedHis;
	@FindBy(id = "submit") private WebElement submitBtn;
	
	public AddPatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPatName(String name) {
		patNameTxtBx.sendKeys(name);
	}
	public void enterPatContactNum(String patContactNum) {
		patContactNumTxtBx.sendKeys(patContactNum);
	}
	public void enterPatMail(String patMail) {
		patMailTxtBx.sendKeys(patMail);
	}
	
	public void clickPatGenderMale() {
		patGenderMale.click();
	}
	public void enterPatAdress(String patientAdress) {
		patAdress.sendKeys(patientAdress);
	}
	public void enterPatAge(String patientAge) {
		patAge.sendKeys(patientAge);
	}
	public void enterPatMedHis(String patMedicalHis) {
		patMedHis.sendKeys(patMedicalHis);
	}
	public void clickOnSubmitBtn() {
	submitBtn.click();
	}
	
	
}
