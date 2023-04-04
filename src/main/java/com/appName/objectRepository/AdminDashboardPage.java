package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orgName.genericUtility.UtilityClass;

public class AdminDashboardPage {
	@FindBy(xpath="//span[text()=\" Users \"]")
	private WebElement useroption;
	
	@FindBy(xpath="//a[@href=\"manage-users.php\"]/span[text()=\" Manage Users \"]")
	private WebElement manageoption;
	
	@FindBy(xpath="//ul[@class=\"main-navigation-menu\"]//a[@href=\"appointment-history.php\"]")
	private WebElement appointmenthistoryAtLN;
	
	@FindBy(xpath="//li[@class=\"dropdown current-user\"]//span[@class=\"username\"]")
	private WebElement logoutdrdwn;
	
	@FindBy(xpath="//a[@href=\"logout.php\"]")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//tbody//tr[last()]//td[2]")
	private WebElement LastDoctorNameInTable;
	
	@FindBy(xpath="//div[@class=\"item-inner\"]//span[text()=\" Doctors \"]")
	private WebElement doctordropdown;
	
	@FindBy(xpath="//a[@href=\"add-doctor.php\"]")
	private WebElement adddoctoroption;
	
	@FindBy(xpath="//a[@href=\"Manage-doctors.php\"]")
	private WebElement manageDoctorOption;
	
	
	//intiallize the driver address to all the elements through constructors and make it as pubilc
	public AdminDashboardPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	public void ClickonUserOption() {
		useroption.click();
	}
	public void ClickonManageOption() {
		manageoption.click();
	}
	public void getAppointmentHistoryAtLN() {
		appointmenthistoryAtLN.click();
	}
	public void validationOfDoctorName(String string) {
		String str = LastDoctorNameInTable.getText();
		Assert.assertEquals(str, string);
	}
	
	public void AdminLogOut() {
		logoutdrdwn.click();
		logoutbtn.click();
	}
	
	public void addDoctor() {
		doctordropdown.click();
		adddoctoroption.click();
	}
	
	public void manageDoctor() {
		doctordropdown.click();
		manageDoctorOption.click();
	}
	
}
