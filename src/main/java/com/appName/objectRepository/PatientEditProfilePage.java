package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class PatientEditProfilePage {
	
	public PatientEditProfilePage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
@FindBy(xpath ="//textarea[@name='address']")
private WebElement addressTextField;

@FindBy(name="submit")
private WebElement updateButton;

public void getupdateButton()
{
	updateButton.click();	
}
public void getAdressTextField(String address)
{
	addressTextField.clear();
	addressTextField.sendKeys(address);
}

}
