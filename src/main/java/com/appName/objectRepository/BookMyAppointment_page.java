package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyAppointment_page
{
	WebDriver driver;

	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private  WebElement Specialization;
	@FindBy(xpath = "//select[@name='doctor']")
	private   WebElement	doctor;
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	private    WebElement   calendar;
	@FindBy(xpath = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']/div/table/tbody/tr[5]/td[7]")
	private  WebElement date;
	@FindBy(xpath = "//input[@id='timepicker1']")
	private  WebElement Time;
	@FindBy(xpath = "//div[@class='bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-bottom open']/table/tbody/tr[1]/td[1]")
	private     WebElement hour;
	@FindBy(xpath = "//div[@class='bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-bottom open']/table/tbody/tr[3]")
	private   WebElement min;
    @FindBy(xpath = "//button[@type='submit']")
      private        WebElement submit;


	

	public BookMyAppointment_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubmit()
	{
		return submit;
	}
	
	
	public WebElement getTime() {
		return Time;
	}

	public WebElement getHour() {
		return hour;
	}

	public WebElement getMin() {
		return min;
	}

	public WebElement getCalendar() 
	{
		return calendar;
	}

	public WebElement getDoctor() 
	{
		return doctor;
	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public WebElement getSpecialization() 
	{
		return Specialization;
	}

	public void setCalendar(WebElement calendar) {
		this.calendar = calendar;
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public void PickDateInCalendar()
	{
		calendar.click();
		date.click();
	}
	public void SetTime()
	{
		Time.click();
		hour.click();
		min.click();
	}

	public void Submit()
	{
		submit.click();
	}
}
