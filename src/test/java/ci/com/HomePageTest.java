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
		soft.assertEquals(isdisplay(home.getHometext()), true);
		
		
	}

}
