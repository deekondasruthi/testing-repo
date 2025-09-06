package fargin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntityOboard {
	public EntityOboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Entity Name")
	private WebElement enityName;

	public WebElement getEnityName() {
		return enityName;
	}

	@FindBy(id = "legalname")
	private WebElement legalName;

	public WebElement getLegalName() {
		return legalName;
	}

	@FindBy(id = "accountdisplayname")
	private WebElement accountDisplayName;

	public WebElement getAccountDisplayName() {
		return accountDisplayName;
	}

	@FindBy(id = "Bussiness category")
	private WebElement bussinessCategoryDropDown;

	public WebElement getBussinessCategoryDropDown() {
		return bussinessCategoryDropDown;
	}

	@FindBy(xpath = "//select[@id='Bussiness category']/option")
	private List<WebElement> bussinessCatOptions;

	public List<WebElement> getBussinessCatOptions() {
		return bussinessCatOptions;
	}

	@FindBy(id = "EntityPlan")
	private WebElement entityPlandropdown;

	public WebElement getEntityPlandropdown() {
		return entityPlandropdown;
	}

	@FindBy(xpath = "//select[@id='EntityPlan']/option")
	private List<WebElement> entityPlanOptions;

	public List<WebElement> getEntityPlanOptions() {
		return entityPlanOptions;
	}

	@FindBy(id = "contactname")
	private WebElement contactName;

	public WebElement getContactName() {
		return contactName;
	}

	@FindBy(id = "emails")
	private WebElement emails;

	public WebElement getEmails() {
		return emails;
	}

	@FindBy(id = "mobile")
	private WebElement mobile;

	public WebElement getMobile() {
		return mobile;
	}

	@FindBy(id = "secondary")
	private WebElement secondary;

	public WebElement getSecondary() {
		return secondary;
	}

	@FindBy(id = "gsts")
	private WebElement gsts;

	public WebElement getGsts() {
		return gsts;
	}

	@FindBy(id = "websites")
	private WebElement websites;

	public WebElement getWebsites() {
		return websites;
	}

	@FindBy(id = "countrys")
	private WebElement countrys;

	public WebElement getCountrys() {
		return countrys;
	}

	@FindBy(id = "states")
	private WebElement states;

	public WebElement getAreas() {
		return areas;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getStates() {
		return states;
	}

	@FindBy(id = "citys")
	private WebElement citys;

	public WebElement getCitys() {
		return citys;
	}
	
	@FindBy(id = "areas")
	private WebElement areas;
	
	@FindBy(id = "pincode")
	private WebElement pincode;
	
	@FindBy(id = "billing")
	private WebElement billingAddress;

	public WebElement getBillingAddress() {
		return billingAddress;
	}
	@FindBy(xpath = "//input[@formcontrolname='logo']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	@FindBy(xpath = "//select[@formcontrolname='customerManualStatus']")
	private WebElement customerManualStatus;

	public WebElement getCustomerManualStatus() {
		return customerManualStatus;
	}
	@FindBy(xpath = "//option[.='Enable']")
	private WebElement EnableOption;

	public WebElement getEnableOption() {
		return EnableOption;
	}
	
	@FindBy(xpath = "//option[.='Disable']")
	private WebElement disableOptins;

	public WebElement getOfflineQrEnable() {
		return offlineQrEnable;
	}

	public WebElement getDisableOptins() {
		return disableOptins;
	}
	@FindBy(xpath = "//select[@formcontrolname='offlineQrEnable']")
	private WebElement offlineQrEnable;
	
	@FindBy(xpath = "//select[@formcontrolname='offlineQrEnable']//option[.='Yes']")
	private WebElement qrYes;

	public WebElement getQrYes() {
		return qrYes;
	}
	@FindBy(xpath = "//select[@formcontrolname='offlineQrEnable']//option[.='No']")
	private WebElement qrNo;

	public WebElement getQrNo() {
		return qrNo;
	}
	
	@FindBy(xpath = "//select[@formcontrolname='billingMode']")
private WebElement billingMode;

	public WebElement getBillingMode() {
		return billingMode;
	}
	
	@FindBy(xpath = "//select[@formcontrolname='billingMode']//option[.='Monthly']")
	private WebElement billingModeMonthly;

	public WebElement getBillingModeMonthly() {
		return billingModeMonthly;
	}
	@FindBy(xpath = "//select[@formcontrolname='cloudFeeEnable']")
	private WebElement cloudFeeEnable;

	public WebElement getCloudFeeEnable() {
		return cloudFeeEnable;
	}
	public WebElement getCloudFeeEnableYes() {
		return cloudFeeEnableYes;
	}

	@FindBy(xpath = "//select[@formcontrolname='cloudFeeEnable']//option[.='Yes']")
	private WebElement cloudFeeEnableYes;
	
	@FindBy(xpath = "//select[@formcontrolname='cloudFeeEnable']//option[.='No']")
	private WebElement cloudFeeEnableNo;

	public WebElement getCloudFeeEnableNo() {
		return cloudFeeEnableNo;
	}
	
	
}
