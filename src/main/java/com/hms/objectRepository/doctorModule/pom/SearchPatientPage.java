package com.hms.objectRepository.doctorModule.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this pom class contains webelements of patient search of doctor module
 * @author pprad
 *
 */
public class SearchPatientPage {
	@FindBy(id = "searchdata") private WebElement searchTxtBx;
	@FindBy(id = "submit") private WebElement searchBtn;
	@FindBy(xpath = "//td[@class='hidden-xs']") private WebElement patNames;
	
	
	public SearchPatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSeachTxtBx() {
		return searchTxtBx;
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
	public WebElement getPatNames() {
		return patNames;
	}

}
