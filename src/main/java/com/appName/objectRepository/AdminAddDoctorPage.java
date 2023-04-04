package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.JavaLibrary;
import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class AdminAddDoctorPage {
	
	SeleniumActions SeleniumActions= UtilityClass.getSeleniumActions();
	JavaLibrary JavaLibrary=UtilityClass.getJavaLibrary();
	
	@FindBy(name="Doctorspecialization")
	private WebElement DoctorSpecializationtxt;
	
	@FindBy(name="docname")
	private WebElement doctorNametxt;
	
	@FindBy(name="clinicaddress")
	private WebElement clinicAddress ;
	
	@FindBy(name="docfees")
	private WebElement DoctorFees ;
	
	@FindBy(name="doccontact")
	private WebElement DocContactNo;
	
	@FindBy(name="docemail")
	private WebElement DocEmail ;
	
	@FindBy(name="npass")
	private WebElement passwordtxt ;
	
	@FindBy(name="cfpass")
	private WebElement confirmpasswordtxt;
	
	@FindAll({@FindBy(id="submit"), @FindBy(name="submit")})
	private WebElement submitbtn;
	
	
	
	//intiallize the driver address to all the elements through constructors and make it as pubilc
	public AdminAddDoctorPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	public void getSpecialization() {
		SeleniumActions.selectDropDown(DoctorSpecializationtxt, "neurologist ");
		doctorNametxt.sendKeys("Arun"+(JavaLibrary.getRandomAlphabet()));
	}
	
	public void getSubmitbtn() throws Throwable {
		submitbtn.click();
		Thread.sleep(2000);
		SeleniumActions.alertAccept();
	}
}
