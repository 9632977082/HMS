package com.appName.domainName;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appName.objectRepository.CreateNewOrganizationPage;
import com.appName.objectRepository.OrganizationInformationPage;
import com.appName.objectRepository.OrganizationsPage;
import com.appName.objectRepository.AdminModule.adminCommonPage;
import com.appName.objectRepository.PatientuserprofilePage.UserProfilePage;
import com.appName.objectRepository.oginPage.Loginpage;
import com.hms.objectRepository.doctorModule.pom.DoctorCommonPage;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.UtilityClass;

public class VerifyUpdationTestcase extends MainClass{

	@Test
	public void testCaseName() {
		//read all the testdata
		//String orgName=UtilityClass.getExcelLibrary().getData("module1", "orgName12",getClass().getSimpleName())+UtilityClass.getRandomNumber();
	//System.out.println(orgName);

		String username1 = UtilityClass.getExcelLibrary().getData("CommonData",6,1);
		String password1 = UtilityClass.getExcelLibrary().getData("CommonData",7,1);
		String adminName = UtilityClass.getExcelLibrary().getData("CommonData",4,1);
		String adminPwd = UtilityClass.getExcelLibrary().getData("CommonData",5,1);
		
		//create object for POM class instance
	    Loginpage lp=new Loginpage(UtilityClass.getDriver());
		UserProfilePage up=new UserProfilePage(UtilityClass.getDriver());
		
		adminCommonPage ap=new adminCommonPage(UtilityClass.getDriver());
		lp.loginASPatient(username1, password1);
		up.clickonAddress("Yelhanka,bangalore");
		lp.loginAsAdmin(adminName, adminPwd);
		ap.clickOnUserDropdownButton();
		

		/*homePage.clickOrganizations();
		organizationsPage.clickCreateOrganizationLookUpImg();
		createNewOrganizationPage.createOrgnization(orgName);
		Assert.assertEquals(organizationInformationPage.getorganizationName(), orgName);
		//UtilityClass.getJavaUtility().printStatement("TC PASS");*/
		
		
		
		
		
		
		
	}

}
