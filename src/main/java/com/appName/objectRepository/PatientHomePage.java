package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class PatientHomePage {
	@FindBy(xpath="//p[@class=\"links cl-effect-1\"]//a[@href=\"edit-profile.php\"]")
	private WebElement updateprofileLink;

	@FindBy(name="address")
	private WebElement addressTxt;

	@FindBy(xpath="//button[@name=\"submit\"]")
	private WebElement updatebtn;

	@FindBy(xpath="//li[@class=\"dropdown current-user\"]//i[@class=\"ti-angle-down\"]")
	private WebElement logoutdrpdwn;

	@FindBy(xpath="//div[@class=\"col-sm-4\"]//a[@href=\"book-appointment.php\"]")
	private WebElement bookmyappointment;

	@FindBy(xpath="//a[@href=\"logout.php\"]")
	private WebElement logoutbtn;

	public PatientHomePage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}


	public void clickOnUpdateProfileLink() {
		updateprofileLink.click();
	}

	public void editAdressTxt(String string) {
		addressTxt.sendKeys(string);
		updatebtn.click();
		logoutdrpdwn.click();
		logoutbtn.click();
	}

	public void bookMyAppointment() {
		bookmyappointment.click();
		
	}
	
	public void logoutaspatient() {
		logoutdrpdwn.click();
		logoutbtn.click();
	}
}
