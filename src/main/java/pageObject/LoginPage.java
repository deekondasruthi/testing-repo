package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import axtion_interface_Reseller.ActionClass_Atus;

public class LoginPage {
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	ActionClass_Atus act=new ActionClass_Atus();
	
	
	@FindBy(xpath ="//input[@placeholder='Enter Your Email']" )
	private WebElement Email;

	@FindBy(xpath ="//input[@placeholder='Enter Your password']" )
	private WebElement pass;

	@FindBy(xpath ="//button" )
	private WebElement subbtn;

	@FindBy(xpath ="//a[@class=\"to_login\"]" )
	private WebElement frgtbtn;
	
	
	public void sendemail(String str) {
		act.sendkeyMethod(Email, str);
	}
	
	public void sendpass(String str) {
		act.sendkeyMethod(pass, str);
	}
	
	public void clicksub() {
		act.click1(subbtn);
	}

}
