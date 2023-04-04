package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orgName.genericUtility.UtilityClass;

public class DoctorHomePage {
	@FindBy(xpath="//p//a[@href=\"appointment-history.php\"]")
	private WebElement myappointments;

	@FindBy(xpath="//tbody//tr[last()]//td[@class=\"hidden-xs\"]")
	private WebElement patientNameinList;
	
	@FindBy(xpath="//p//a[@href=\"edit-profile.php\"]")
	private WebElement updateProfilebtn;
	
	public DoctorHomePage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	public void appointments() {
		myappointments.click();
	}
	
	public void patirntNameInListValidation(String string) {
		String str = patientNameinList.getText();
		Assert.assertEquals(str, string);
	}
	
	public void clickOnUpdateProfileBtn() {
		updateProfilebtn.click();
	}
}
