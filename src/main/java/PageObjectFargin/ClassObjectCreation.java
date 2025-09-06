package PageObjectFargin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjectFargin.CampaignModule;
import PageObjectFargin.EntityOnboardModule;
import PageObjectFargin.HomePage;

public class ClassObjectCreation {

	ClassObjectCreation(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
     public static HomePage hom;

     public Object home(WebDriver driver) {
			EntityOnboardModule onboard = new EntityOnboardModule(driver);
			return onboard;
		
		}
	public static void initializeclass(WebDriver driver) {
		System.out.println("starting");
		
	   hom = new HomePage(driver);
		EntityOnboardModule onboard = new EntityOnboardModule(driver);
		System.out.println("starting1");
		CampaignModule camp = new CampaignModule(driver);
		System.err.println("testing");
//		return onboard;
	
		
	}
	
}
