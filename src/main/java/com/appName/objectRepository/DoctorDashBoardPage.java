package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class DoctorDashBoardPage {
	public DoctorDashBoardPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	@FindBy(xpath="DoctorDashBoardPage")
	private WebElement myAppointsButton;
	
	@FindBy(xpath = "//i[@class='ti-angle-down']")
	private WebElement doctorProfileDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement dLogOutButton;
	
	public void getDLogOutButton()
	{
		dLogOutButton.click();
	}
	
	public void getmyAppointsButton()
	{
		myAppointsButton.click();
	}
	
	public void getdoctorProfileDropDown()
	{
		doctorProfileDropDown.click();
	}
}
