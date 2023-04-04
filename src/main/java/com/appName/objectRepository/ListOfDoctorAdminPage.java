package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orgName.genericUtility.UtilityClass;

public class ListOfDoctorAdminPage {
	@FindBy(xpath="//tbody//tr[last()]//td[3]")
	private WebElement nameOfDoctorInList;
	
	
	//intiallize the driver address to all the elements through constructors and make it as pubilc
	public ListOfDoctorAdminPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
	}
	
	public void ValidateNameOfDoctor(String Expected) {
		String act = nameOfDoctorInList.getText();
		Assert.assertEquals(act.contains(Expected), true);
		
	}
}
