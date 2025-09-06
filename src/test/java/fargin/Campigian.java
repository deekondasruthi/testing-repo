package fargin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectFargin.CampaignModule;
import PageObjectFargin.ClassObjectCreation;
import PageObjectFargin.EntityOnboardModule;
import PageObjectFargin.HomePage;
import genaral.BaseClass;

public class Campigian extends BaseClass {
//	HomePage hom = new HomePage(driver);
//	EntityOnboardModule onboard = new EntityOnboardModule(driver);
//	CampaignModule camp = new CampaignModule(driver);

	SoftAssert soft = new SoftAssert();

	@Test
	public void titleTest() {

		HomePage hom = new HomePage(driver);
		WaitListOfElementT0Present(driver, 10, "//h2[.='FARGIN CONNECT']");
		soft.assertEquals(hom.get_title().getText(), "FARGIN CONNECT");
		soft.assertAll();
	}

	@Test
	public void dummy() throws InterruptedException {

		HomePage hom = new HomePage(driver);
		EntityOnboardModule onboard = new EntityOnboardModule(driver);
		CampaignModule camp = new CampaignModule(driver);
//		ClassObjectCreation.initializeclass(driver);
		implicitWait(driver, 10);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", hom.getCampaign());
		click1(hom.getCampaign());

//download the campgian file
//		click1(camp.getCreate());
		WaitForClickable(driver, camp.getDownlaodTemplate(), 10);
		click1(camp.getDownlaodTemplate());
		Thread.sleep(2000);

	}
}
