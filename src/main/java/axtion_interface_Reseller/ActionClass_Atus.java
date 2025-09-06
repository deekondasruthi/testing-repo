package axtion_interface_Reseller;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import actionDriver.ActionInterface;

public class ActionClass_Atus implements ActionInterface {

	@Override
	public void sendkeys1(WebElement ele, WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}

	@Override
	public void sendkeyMethod(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	@Override
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	@Override
	public void click(WebDriver driver) {
		Actions act = new Actions(driver);
		act.click().perform();

	}

	@Override
	public void clickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}

	@Override
	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();

	}

	@Override
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick().perform();

	}

	@Override
	public void doubleClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();

	}

	@Override
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	@Override
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement des) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, des).perform();
	}

	@Override
	public void ClickAndHoldOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();

	}

	@Override
	public void clickAndHold(WebDriver driver) {
		Actions act = new Actions(driver);
		act.clickAndHold().perform();

	}

	@Override
	public void release(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.release(element).perform();

	}

	@Override
	public void scrollByAmt(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();

	}

	@Override
	public void scrollToElent(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	@Override
	public void scrollFromOrig(WebDriver driver, ScrollOrigin element, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollFromOrigin(element, x, y).perform();
	}

	@Override
	public void keyDown(WebDriver driver, String str) {
		Actions act = new Actions(driver);
		act.keyDown(str).perform();
	}

	@Override
	public void keyDown(WebDriver driver, WebElement element, String str) {
		Actions act = new Actions(driver);
		act.keyDown(element, str).perform();

	}

	@Override
	public void keyUp(WebDriver driver) {
		Actions act = new Actions(driver);
		act.release().perform();

	}

	@Override
	public void keyUpOnEle(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.release(element).perform();

	}

	@Override
	public boolean ismultiple(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.isMultiple();

	}

	@Override
	public List<WebElement> getOptions(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getOptions();
	}

	@Override
	public void selectByIndex(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}

	@Override
	public void selectByValue(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}

	@Override
	public void selectByVisibleTxt(WebElement dropdown, String text) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}

	@Override
	public void deselectByIndex(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.deselectByIndex(index);

	}

	@Override
	public void deselectByValue(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		select.deselectByValue(value);
	}

	@Override
	public void deselectByVisibleTxt(WebElement dropdown, String text) {
		Select select = new Select(dropdown);
		select.deselectByVisibleText(text);

	}

	@Override
	public List<WebElement> getAllSlectedOpt(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getAllSelectedOptions();
	}

	@Override
	public WebElement get1StSelectedOpt(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption();
	}

	@Override
	public WebElement getWrapped(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getWrappedElement();
	}

	@Override
	public void accept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	@Override
	public void dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	@Override
	public void sendkeys(WebElement ele, String str) {
		ele.sendKeys(str);

	}

	@Override
	public String getText(WebDriver driver) {

		return driver.switchTo().alert().getText();
	}

	/**
	 * switch to window by referring url
	 * 
	 * @param driver
	 * @param url
	 */
	@Override
	public void switchToWindow(WebDriver driver, String url) {
		Set<String> windowIds = driver.getWindowHandles();
		for (String id : windowIds) {
			driver.switchTo().window(id);
			if (url.equalsIgnoreCase(driver.getCurrentUrl())) {
				break;
			}
		}
	}

	/**
	 * switch to frame by using index
	 * 
	 */
	@Override
	public void switchByindex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * switch To frame by using the frameElement
	 * 
	 */
	@Override
	public void switchBywebElement(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * switch to Frame by using the name or id
	 */
	@Override
	public void switchByName(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);

	}

	/*
	 * switch to immediate parent frame
	 */
	@Override
	public void switchToimmediateParent(WebDriver driver) {
		driver.switchTo().parentFrame();

	}

	/**
	 * switch to main parent frame
	 */
	@Override
	public void switchToParent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * click the element using javaCriptExecutor
	 */
	@Override
	public void javaScriptclick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", element);

	}

	/**
	 * Enter the inputs using javaScriptExecutor
	 */

	@Override
	public void javaScriptSendinputs(WebDriver driver, String input, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + input + "';", element);

	}

	/*
	 * reload the page using the javaScriptExecutor
	 */
	@Override
	public void javaScriptRefresh(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].reload()", element);
	}

	@Override
	public void scrollDownUP(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ");");
	}

	@Override
	public void scrollTo(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + x + "," + y + ");");

	}

	@Override
	public void scrollintoView(WebDriver driver, boolean bool, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + bool + ");", element);
	}

	@Override
	public void implicitWait(WebDriver driver, int duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}

	/*
	 * webDriver wait to element is presence
	 */
	@Override
	public void WaitForELeTOPresent(WebDriver driver, int time, String element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("element")));

	}

	/*
	 * webDriverWait for element to be clikable
	 * 
	 */
	@Override
	public void WaitForClickable(WebDriver driver, WebElement element, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	@Override
	public void WaitListOfElementT0Present(WebDriver driver, int duration, String element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) element));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("element")));
	}

	@Override
	public void visibilityOFEle(WebDriver driver, int duration, WebElement ele) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	@Override
	public void presence_of_ele_Loc(WebDriver driver, int duration, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	@Override
	public void customWait(WebDriver driver, By locator, int timeout) throws TimeoutException {

		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < timeout * 1000) {
			if (driver.findElements(locator).size() > 0) {
				return;
			}
		}
		throw new TimeoutException("Element not found within the given timeout.");
	}

	@Override
	public void FluientWait(WebDriver driver, int duration, int polling_time, String element) {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.pollingEvery(Duration.ofSeconds(polling_time));
		// wait.ignoring(Exception.nos);
	}

	@Override
	public boolean isSelected(WebElement ele) {

		return ele.isSelected();
	}

	@Override
	public boolean isEnabled(WebElement ele) {

		return ele.isEnabled();
	}

	@Override
	public boolean findElement(WebElement ele) {

		return ele.isDisplayed();
	}

	@Override
	public boolean isdisplay(WebElement ele) {

		return ele.isDisplayed();
	}

	@Override
	public void mouseHoverByJavaScript(WebDriver driver, WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.onmouseover;", locator);
	}

	@Override
	public void selectBySendkeys(WebElement ele, String input) {
		ele.sendKeys(input);
	}

	@Override
	public void switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
		Set<String> windowIds = driver.getWindowHandles();
		for (String id : windowIds) {
			driver.switchTo().window(id);
			if (windowTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}

	}

	@Override
	public int getColumncount(List<WebElement> cloumn) {
		int count = cloumn.size();
		return count;
	}

	@Override
	public int getRowCount(List<WebElement> table) {
		int count = table.size();
		return count;
	}

	@Override
	public boolean launchUrl(WebDriver driver, String url) {
		boolean bool;
		
	
		if (driver.getCurrentUrl().equals(url)) {
			bool = true;
		} else
			bool = false;
		return bool;
	}

	
	
	
	@Override
	public String getCurrentURL(WebDriver driver) {

		return driver.getCurrentUrl();
	}

	@Override
	public String getTitle(WebDriver driver) {

		return driver.getTitle();
	}

	@Override
	public void click1(WebElement locator) {
		locator.click();

	}

	/*
	 * screenshot of WebPage
	 */
	@Override
	public String screenShot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot sh = (TakesScreenshot) driver;
		File tem = sh.getScreenshotAs(OutputType.FILE);
		File per = new File("./screenshot/" + filename + getCurrentTime() + ".jpg");
		FileHandler.copy(tem, per);
		return "./screenshot/" + filename + getCurrentTime() + ".jpg";
	}
	/*
	 * screenshot shot on specified WebElement
	 */

	@Override
	public File screenShotOnWebElement(WebDriver driver, WebElement element, String fileName) throws IOException {
		File tem = element.getScreenshotAs(OutputType.FILE);
		File per = new File("./screenshot/" + fileName + getCurrentTime() + ".jpg");
		FileHandler.copy(tem, per);
		return per;

	}
	/*
	 * 
	 * var date:any = new Date(); to get the system current date
	 */

	@Override
	public String getCurrentTime() {

		// return LocalDate.now().toString().replace(":", "_");
		String dateTime = LocalDateTime.now().toString().replace(":", "_");
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		return dateTime.formatted(myFormatObj);
	}

	/*
	 * To find alert is present or not
	 */
	@Override
	public boolean isAlertPresent(WebDriver driver) {
		Boolean bool = false;
		try {
			driver.switchTo().alert();
			System.out.println("alert is present");
			bool = false;

		} catch (Exception noAlertException) {
			bool = true;
		}
		return true;
	}

	/*
	 * set time to wait for webpage
	 */
	@Override
	public void pageLoadTimeOut(WebDriver driver, int timeOut) {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));
	}

	@Override
	public void clear(WebElement locator) {
		locator.clear();

	}

	@Override
	public void jsExecutorscrll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
//	public void initializedriver() {
//		Act
//	}

}
