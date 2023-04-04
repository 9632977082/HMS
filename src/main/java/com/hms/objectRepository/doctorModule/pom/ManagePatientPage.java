package com.hms.objectRepository.doctorModule.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePatientPage {
	@FindBy(xpath = "//table/tbody/tr/td[@class='hidden-xs']") private List<WebElement> patNames;
	@FindBy(xpath = "//table[@id='sample-table-1']//td[3]") private List<WebElement> patContacts;
	
	public ManagePatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getPatNames() {
		return patNames;
	}

	public List<WebElement> getPatContacts() {
		return patContacts;
	}
	
	

}
