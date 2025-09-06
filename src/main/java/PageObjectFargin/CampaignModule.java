package PageObjectFargin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignModule {

	public CampaignModule(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[.='Download Template']")
	private WebElement downlaodTemplate;

	public WebElement getDownlaodTemplate() {
		return downlaodTemplate;
	}
	
	@FindBy(xpath = "//span[.='Create']/preceding-sibling::span")
	private WebElement create;

	public WebElement getCreate() {
		return create;
	}
	
	@FindBy(id = "subject")
	private WebDriver subject;
	
	public WebDriver getSubject() {
		return subject;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='startDate']")
	private WebElement campigianDate;

	public WebElement getCampigianDate() {
		return campigianDate;
	}
	
	@FindBy(xpath = "//textarea[@formcontrolname='contents']")
	private WebElement contentFiled;

	public WebElement getContentFiled() {
		return contentFiled;
	}
	
	@FindBy(id = "email")
	private WebElement imageFiled;

	public WebElement getImageFiled() {
		return imageFiled;
	}
	@FindBy(xpath = "//input[@formcontrolname='uploadFile']")
	private WebElement uploadfileFiled;

	public WebElement getUploadfileFiled() {
		return uploadfileFiled;
	}
	
	
	@FindBy(xpath = "//button[.=' Submit ']")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	

	
	
}
