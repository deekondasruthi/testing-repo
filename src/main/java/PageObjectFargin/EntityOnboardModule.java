package PageObjectFargin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntityOnboardModule {
	
	public EntityOnboardModule(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[contains(@class, 'mat-column-contactEmail')]")
	private List<WebElement> entityEmail;

	public List<WebElement> getEntityEmail() {
		return entityEmail;
	}
	
	

}
