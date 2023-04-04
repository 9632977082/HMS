package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

// create the class as webpage name and make it as public
public final class HomePage {
	
	// declare all the elements and specify the accesss specifier as private
	@FindBy(xpath="//a[@href=\"hms/user-login.php\"]")
	private WebElement patientbtn;
	
	@FindBy(xpath="//a[@href=\"hms/admin\"]")
	private WebElement adminbtn;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationsTab;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsTab;
	
	@FindBy(xpath="//a[@href=\"hms/doctor/\"]")
	private WebElement doctorbtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement admistrorIcon;
	
	@FindBy(linkText  = "Sign Out")
	private WebElement signOutLink;
	
	
	
	
	//intiallize the driver address to all the elements through constructors and make it as pubilc
	public HomePage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}

	
	/**
	 * 
	 * @param driver
	 */
	public void clickpatientbtn() {
		
		patientbtn.click();
	}
	
	
	public void clickAdminbtn() {
		adminbtn.click();
	}
	
	
	
	public WebElement getContacts() {
		return contactsTab;
	}
	public void clickOrganizations() {
		organizationsTab.click();
	}
	
	public void clickOnDoctorbtn() {
		doctorbtn.click();
	}
	
	
	public void signout() {
		UtilityClass.getSeleniumActions().mouseHoverOntheElement(admistrorIcon);
		signOutLink.click();
	}
	
	
	
	
}
