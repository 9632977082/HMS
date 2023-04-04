package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class BookMyAppointmentPage {
	
	
	SeleniumActions SeleniumActions= UtilityClass.getSeleniumActions();
	
	@FindBy(name="Doctorspecialization")
	private WebElement drSplizationtxt;
	
	@FindBy(name="doctor")
	private WebElement doctordropdown;
	
	@FindBy(name="appdate")
	private WebElement date;
	
	@FindBy(xpath="(//tbody//tr//td[@class=\"day\"])[5]")
	private WebElement datecalender;
	
	@FindBy(name="apptime")
	private WebElement time;
	
	@FindBy(xpath="//input[@class=\"bootstrap-timepicker-hour form-control\"]")
	private WebElement selecthour;
	
	@FindBy(xpath="//input[@class=\"bootstrap-timepicker-minute form-control\"]")
	private WebElement selectminute;
	
	@FindBy(xpath="//input[@class=\"bootstrap-timepicker-meridian form-control\"]")
	private WebElement selectmeradian;
	
	@FindBy(name="submit")
	private WebElement submitbtn;
	

	public BookMyAppointmentPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}


 public void bookMyAppointment() throws Throwable {
	 SeleniumActions.selectDropDown(drSplizationtxt, "Ayurveda");
	 SeleniumActions.selectDropDown(doctordropdown, "297");
	 date.click();
	 datecalender.click();
	 time.click();
	 selecthour.sendKeys("10");
	 selectminute.sendKeys("15");
	 selectmeradian.sendKeys("AM");
	 submitbtn.click();
	 Thread.sleep(2000);
	 SeleniumActions.alertAccept();

	 
 }
	
}
