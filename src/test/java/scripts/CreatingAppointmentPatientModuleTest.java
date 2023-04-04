package scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.DoctorDashBoardPage;
import com.appName.objectRepository.DoctorLoginPage;
import com.appName.objectRepository.PatientLoginPage;
import com.appName.objectRepository.PatientPage;
import com.appName.objectRepository.PatientsBookAppointmentPage;
import com.appName.objectRepository.WelComePage;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class CreatingAppointmentPatientModuleTest extends MainClass {
@Test
public void patientModule() throws InterruptedException
{
	WelComePage welComePage=new WelComePage();
	PatientLoginPage patientLoginPage=new PatientLoginPage();
	PatientPage patientPage=new PatientPage();
	PatientsBookAppointmentPage patientsBookAppointmentPage=new PatientsBookAppointmentPage();
	SeleniumActions SeleniumActions= UtilityClass.getSeleniumActions();	
	DoctorLoginPage doctorLoginPage=new DoctorLoginPage();
	
	String pUsername = UtilityClass.getExcelLibrary().getData("CommonData", 5,1);
	String pPassword = UtilityClass.getExcelLibrary().getData("CommonData", 6,1);
	welComePage.pClickHere();
	patientLoginPage.pUn(pUsername);
	patientLoginPage.pPw(pPassword);
	patientLoginPage.pLogin();
	
	patientPage.getbookAppointmentButton();
	
	WebElement specialization = patientsBookAppointmentPage.getdoctorspecializationDropDown();
	specialization.click();
	SeleniumActions.selectDropDown(specialization, "Ayurveda");
	Thread.sleep(3000);
	WebElement doctorName = patientsBookAppointmentPage.getdoctorNameDropDown();
	doctorName.click();
	SeleniumActions.selectDropDown("Dr.Girish",doctorName);
	patientsBookAppointmentPage.getdateTextField("2023/04/03");
	patientsBookAppointmentPage.getappointmentTime("02:45 PM");
	Thread.sleep(6000);
	patientsBookAppointmentPage.getappointmentSubmitButton();
	Thread.sleep(2000);
	SeleniumActions.alertAccept();
	Thread.sleep(2000);
	
	WebElement pDD = patientPage.getUserProfileDropDown();
	SeleniumActions.waitUntillElementClickable(pDD);
	pDD.click();
	patientPage.getLogOutButton();
	
	Thread.sleep(3000);
	welComePage.getdClickHere();
	String dUsername = UtilityClass.getExcelLibrary().getData("CommonData", 7,1);
	String dPassword = UtilityClass.getExcelLibrary().getData("CommonData", 8,1);
	doctorLoginPage.getdUserNameTextField(dUsername);
	doctorLoginPage.getdPassword(dPassword);
	doctorLoginPage.getDLoginButton();
	
	DoctorDashBoardPage doctorDashBoardPage=new DoctorDashBoardPage();
	doctorDashBoardPage.getmyAppointsButton();
	doctorDashBoardPage.getdoctorProfileDropDown();
	doctorDashBoardPage.getDLogOutButton();
	
}
}
