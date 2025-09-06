package PageObjectFargin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaral.BaseClass;

public class HomePage {
	 

	public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
	 
	@FindBy(xpath = "//h2[.='FARGIN CONNECT']")
	private WebElement title;
	
	public WebElement get_title() {
		return title;
	}
	 @FindBy(xpath = "//span[.='Campaign']")
	 private WebElement campaign;
	 
	

	public WebElement getCampaign() {
			return campaign;
		}
	 
	 @FindBy(xpath = "//main[@class='page-content']")
	 private WebElement nav_bar;
	 
	 public WebElement getNav_bar() {
			return nav_bar;
		}
	 
	

}
