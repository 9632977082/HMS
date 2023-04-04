package com.appName.objectRepository.PatientuserprofilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class UserProfilePage {
	
	@FindBy(xpath="//a[contains(text(),'Up')]")
	private WebElement UpdateProfile;
@FindBy(xpath="//textarea[@name='address']")
private WebElement AddressTextFIELD;
@FindBy(xpath="//button[@name='submit']")
private WebElement UpdateButton;
@FindBy(xpath="//a[@href='logout.php']")
private WebElement logout; 
@FindBy(xpath="//i[@class='ti-angle-down']")
private WebElement profileicon;

public UserProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickonAddress(String address)
{
	UpdateProfile.click();
	UtilityClass.getSeleniumActions().scrollTillElement(AddressTextFIELD);
	AddressTextFIELD.clear();
	AddressTextFIELD.sendKeys(address);
	UpdateButton.click();
	profileicon.click();
	logout.click();
	
}
}
