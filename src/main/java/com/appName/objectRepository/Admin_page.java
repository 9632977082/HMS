package com.appName.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_page 
{
	WebDriver driver;

	@FindBy(xpath = "//ul[@class='main-navigation-menu']/li[3]")
	private   WebElement  User_icon;
	@FindBy(xpath = "//span[.=' Manage Users ']")
	private  WebElement Manage_user;
	@FindBy(xpath = "//li[@class='dropdown current-user']/a")
	private    WebElement	adminIcon;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-dark']/li[2]")
	private  WebElement admin_logout;
	@FindBy(xpath = "//ul[@class='main-navigation-menu']/li[2]")
	private  WebElement Doctors;
	@FindBy(xpath = "//ul[@class='sub-menu']/li[2]/a/span[.=' Add Doctor']")
	private  WebElement addDoctor;

	public WebDriver getDriver() 
	{
		return driver;
	}


	public WebElement getDoctors() {
		return Doctors;
	}


	public WebElement getAddDoctor() {
		return addDoctor;
	}


	public WebElement getAdminIcon() 
	{
		return adminIcon;
	}


	public WebElement getAdmin_logout() {
		return admin_logout;
	}


	public Admin_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUser_icon() 
	{
		return User_icon;
	}

	public WebElement getManage_user() 
	{
		return Manage_user;
	}

	public void ClickOnUserIconandManageUserIcon()
	{
		User_icon.click();
		Manage_user.click();
	}
	public void AdminLogout()
	{
		adminIcon.click();
		admin_logout.click();
	}
	public void toCreateDoctor()
	{
		Doctors.click();
		addDoctor.click();
	}

}
