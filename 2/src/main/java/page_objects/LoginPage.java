package page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import action_driver.Action_class;
public class LoginPage extends BaseClass {
       

	Action_class action= new Action_class();

	@FindBy(xpath ="//input[@id=\"form1Example1\"]" )
	private WebElement Email;

	@FindBy(xpath ="//input[@id=\"form2Example27\"]" )
	private WebElement pass;

	@FindBy(xpath ="//button[@id=\"button\"]" )
	private WebElement subbtn;

	@FindBy(xpath ="//a[@class=\"to_login\"]" )
	private WebElement frgtbtn;


	public LoginPage() {
		
		PageFactory.initElements(getDriver(),this );
	}


	public void Email(String email) {
		action.SendKeys(Email, email);



	}
	public void Pass(String Pass) {
		action.SendKeys(pass, Pass);

    }
    
    
       public HomePage SubBtn (){
		
		action.click(getDriver(), subbtn);
		return new HomePage();
	
	}

}