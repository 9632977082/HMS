package com.hms.objectRepository.doctorModule.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
/**
 * This pom class contains Webelements of Appointment History Page of doctor module
 * and also it contains dynamic xpath
 * @author pprad
 *
 */
public class AppointmentHistoryPage {
	//dynamic xpath for patient name
	String patxpath ="//table//td[@class='hidden-xs' and text()='%s']";
	String cancelBtnXpath="//table//td[@class='hidden-xs' and text()='%s']/..//a[@title='Cancel Appointment']";

	public AppointmentHistoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method converts and returns Dynamic xpath to actual xpath
	 * @param driver
	 * @param replaceValue
	 * @return
	 */
	public List<WebElement> getPatientNames(WebDriver driver,String replaceValue) {

		String actXpath = String.format(patxpath, replaceValue);
		List<WebElement> element = driver.findElements(By.xpath(actXpath));
		return element;

	}
	
	
	public List<WebElement> getCancelBtns(WebDriver driver,String replaceValue) {

		String actXpath = String.format(cancelBtnXpath, replaceValue);
		List<WebElement> element = driver.findElements(By.xpath(actXpath));
		return element;

	}








}
