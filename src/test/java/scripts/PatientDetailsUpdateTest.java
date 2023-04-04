package scripts;

import org.testng.annotations.Test;

import com.appName.objectRepository.PatientEditProfilePage;
import com.appName.objectRepository.PatientLoginPage;
import com.appName.objectRepository.PatientPage;
import com.appName.objectRepository.WelComePage;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.UtilityClass;

public class PatientDetailsUpdateTest extends MainClass{
@Test
public void patientTestCase1()
{
	WelComePage welComePage=new WelComePage();
	PatientLoginPage patientLoginPage=new PatientLoginPage();
	PatientPage patientPage=new PatientPage();
	PatientEditProfilePage patientEditProfilePage=new PatientEditProfilePage();
	
	String pUsername = UtilityClass.getExcelLibrary().getData("CommonData", 5,1);
	String pPassword = UtilityClass.getExcelLibrary().getData("CommonData", 6,1);
	
	welComePage.pClickHere();
	patientLoginPage.pUn(pUsername);
	patientLoginPage.pPw(pPassword);
	patientLoginPage.pLogin();
	
	patientPage.getUserProfileDropDown();
	patientPage.getmyProfileButton();
	patientEditProfilePage.getAdressTextField("bramhaputra river");
	patientEditProfilePage.getupdateButton();
	
	patientPage.getUserProfileDropDown();
	patientPage.getLogOutButton();	
}
}
