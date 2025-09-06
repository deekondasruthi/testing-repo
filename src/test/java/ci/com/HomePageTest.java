package ci.com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genaral.BaseClass;
import pageObject.HomePage;

public class HomePageTest extends BaseClass {
	
	
	
	@Test
	public void linkTest() {
		implicitWait(driver, 10);
		HomePage home=new HomePage(driver);
		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(isdisplay(home.getHometext()), true);
//		System.out.println(home.getHometext().getText());
		soft.assertAll();
	
	}
	
	@Test
	public void failtest() {
		implicitWait(driver, 10);
		HomePage home=new HomePage(driver);
		SoftAssert soft=new SoftAssert();
//		System.out.println(home.getHometext().getText()+ " failed test case");
//		soft.assertEquals(isdisplay(home.getHometext()), false);
		soft.assertAll();
	}

}
