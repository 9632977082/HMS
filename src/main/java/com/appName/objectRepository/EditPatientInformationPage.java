package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPatientInformationPage 
{
	@FindBy(xpath = "//div[@class='panel-body']/form/div[3]/input")
	private  WebElement Location;

}
