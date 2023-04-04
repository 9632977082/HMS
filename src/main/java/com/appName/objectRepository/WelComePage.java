package com.appName.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orgName.genericUtility.UtilityClass;

public class WelComePage {

public WelComePage() {
PageFactory.initElements(UtilityClass.getDriver(), this);
		}
	
@FindBy(xpath="//a[text()='Hospital Management system']")
private WebElement welcomeStatement;

@FindBy(xpath = "//h3[text()='Patients']/ancestor::"
		+ "div[@class=\"listview_1_of_3 images_1_of_3\"]/descendant::a")
private WebElement pClickHere;

@FindBy(xpath = "//h3[text()='Doctors Login']/ancestor::"
		+ "div[@class='listview_1_of_3 images_1_of_3']/descendant::a")
private WebElement dClickHere;

@FindBy(xpath="//h3[text()='Admin Login']/ancestor::"
		+ "div[@class='listview_1_of_3 images_1_of_3']/descendant::a")
private WebElement aClickHere;

public void getAClickHere()
{
	aClickHere.click();
}
public void pClickHere()
{
	pClickHere.click();
}

public void getdClickHere()
{
	dClickHere.click();
}


}
