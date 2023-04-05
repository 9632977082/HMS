package com.appName.objectRepository;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class ManageDoctorsPage {
	public ManageDoctorsPage() {
		PageFactory.initElements(UtilityClass.getDriver(), this);
				}
	
	@FindBy(xpath="//tr/th")
	private java.util.List<WebElement> tableHeadings;
	
	public java.util.List<WebElement> getTableHeadings()
	{
		return tableHeadings;
	}
	
	
}
