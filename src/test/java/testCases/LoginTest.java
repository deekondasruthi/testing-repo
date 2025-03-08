package testCases;

import org.testng.Assert;
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
		loginPage.Email("majeeth.h@babbujiventures.in");
		loginPage.Pass("Test2@123");
		
		loginPage.SubBtn();
		
		
		
		
		}
	@Test
	public void test() {
		System.out.println("hello");
		Assert.assertEquals(false, true);
	}
	
	
	@AfterMethod()
	public void tearDown() {
		getDriver().quit();
	}
	
	
         
}
