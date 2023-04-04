package scripts;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.AddDoctorPage;
import com.appName.objectRepository.AdminDashBoardPage;
import com.appName.objectRepository.AdminLoginPage;
import com.appName.objectRepository.WelComePage;
import com.google.protobuf.StringValue;
import com.orgName.genericUtility.JavaLibrary;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class AddDoctorUsingAdminModuleTest extends MainClass {
@Test
public void adminModule() throws InterruptedException
{
	WelComePage welComePage=new WelComePage();
	SeleniumActions SeleniumActions= UtilityClass.getSeleniumActions();	
	AdminLoginPage adminLoginPage=new AdminLoginPage();
	AdminDashBoardPage adminDashBoardPage=new AdminDashBoardPage();
	AddDoctorPage addDoctorPage=new AddDoctorPage();
	String rString = RandomStringUtils.randomAlphabetic(10);
	JavaLibrary JavaLibrary=UtilityClass.getJavaLibrary();
	int halfConNum =JavaLibrary.getRandomNumber(100000);

	String aUsername = UtilityClass.getExcelLibrary().getData("CommonData", 9,1);
	String aPassword = UtilityClass.getExcelLibrary().getData("CommonData", 10,1);
	welComePage.getAClickHere();
	adminLoginPage.getAUserNameTextField(aUsername);
	adminLoginPage.getAPasswordTextField(aPassword);
	adminLoginPage.getALoginButton();
	
	adminDashBoardPage.getDoctorsButton();
	adminDashBoardPage.getAddDoctorButton();
	
	String dSpecialization = UtilityClass.getExcelLibrary().getData("DoctorDetails", 0,1);
	String dName = UtilityClass.getExcelLibrary().getData("DoctorDetails", 1,1);
	String dAddress = UtilityClass.getExcelLibrary().getData("DoctorDetails", 2,1);
	String dFees = UtilityClass.getExcelLibrary().getData("DoctorDetails", 3,1);
	String dContactNumbber = UtilityClass.getExcelLibrary().getData("DoctorDetails", 4,1)+halfConNum;
	String dEmail = rString+"@gmail.com";
	String dPassword = UtilityClass.getExcelLibrary().getData("DoctorDetails", 6,1);

	WebElement dSpec = addDoctorPage.getDoctorspecializationDropDown();
	dSpec.click();
	SeleniumActions.selectDropDown(dSpec, dSpecialization);
	
	addDoctorPage.getDoctorNameTextField(dName);
	Thread.sleep(2000);
	addDoctorPage.getDoctorClickAddressTextField(dAddress);
	Thread.sleep(2000);
	addDoctorPage.getDoctorFeesTextField(dFees);
	Thread.sleep(2000);
	addDoctorPage.getDoctorContactNumberTextField(dContactNumbber);	
	Thread.sleep(2000);
	addDoctorPage.getDoctorEmailTextField(dEmail);
	Thread.sleep(2000);

	addDoctorPage.getDoctorPasswordTextField(dPassword);
	Thread.sleep(2000);

	addDoctorPage.getDoctorConfirmPasswordTextField(dPassword);
	Thread.sleep(2000);

	addDoctorPage.getASubmitButton();
	
	adminDashBoardPage.getAddDoctorButton();
	SeleniumActions.alertAccept();
	
	adminDashBoardPage.getManageDoctorsButton();
}
}
