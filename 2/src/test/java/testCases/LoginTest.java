package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import page_objects.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	LoginPage loginPage;
	
	@BeforeMethod()
	public void setup() {
	launchApp();
	
	}
	@Test
	public void loginTest()   throws Throwable{
		loginPage=new LoginPage();
		loginPage.Email(prop.getProperty("email"));
		loginPage.Pass(prop.getProperty("pass"));
		loginPage.SubBtn();
		}

	
	@AfterMethod()
	public void tearDown() {
		getDriver().quit();
	}
	
}
