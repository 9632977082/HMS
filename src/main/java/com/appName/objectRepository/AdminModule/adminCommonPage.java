package com.appName.objectRepository.AdminModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminCommonPage {
	@FindBy(xpath="//ul[@class='main-navigation-menu']/li[3]//i[@class='icon-arrow']") 
	private WebElement patientDropDown;
	@FindBy(xpath="//span[text()=' Users ']") 
	private WebElement userDropDown;
    @FindBy(xpath="//ul[@class='main-navigation-menu']/li[3]//li[2]/a/span[@class='title']")
    private WebElement managePatBtn;
    @FindBy(xpath="//table[@class='table table-hover']//tbody/tr/td[7]/a/i[@class='fa fa-edit']")
    private WebElement  EditOption;
    @FindBy(name="patname")
    private WebElement PatNameTxtBox;
    @FindBy(id="submit")
    private WebElement updateBtn;
    @FindBy(xpath="//table/tbody/tr/td[@class='hidden-xs']") 
    private WebElement patientName;
    @FindBy(xpath="//h2[text()='Manage Users']/ancestor::div[@class='col-sm-4']/descendant::p[@class='links cl-effect-1']")
    private WebElement ManageUserbtnofmodule;
    @FindBy(xpath="//span[text()=' Manage Users ']")
    private WebElement Manageuserbuttonofdropdown;
    @FindBy (xpath="//table[@id='sample-table-1']/tbody/tr/td[@class='hidden-xs']")
    private WebElement Patientlisttable;
    @FindBy(xpath="//span[contains(text(),'Adm')]")
    private WebElement AdminUserProfilebtn;
    @FindBy(xpath="//a[contains(text(),'Log')]")
    private WebElement logout;
    
    public adminCommonPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
//    public List<WebElement> getEditOption(){
//    	
//    }

    public void clickOnUserDropdownButton()
    {
    	userDropDown.click();
    	Manageuserbuttonofdropdown.click();
    	logout.click();
    }
}
