package actionDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.WebDriverWait;

public  interface ActionInterface {

	public void sendkeys1(WebElement ele, WebDriver driver);

///////Action class methods////////////
	/*
	 * move to specified Element
	 */
	public void mouseHover(WebDriver driver, WebElement element);

	/*
	 * click
	 * 
	 */

	public void click(WebDriver driver);

	/*
	 * click on specified element
	 */
	public void clickOnElement(WebDriver driver, WebElement element);

	/*
	 * right click
	 */
	public void rightClick(WebDriver driver);

	/*
	 * right click on specified Element
	 */
	public void rightClickOnElement(WebDriver drivern, WebElement element);

	/*
	 * double click
	 */
	public void doubleClick(WebDriver driver);

	/*
	 * double click on specified element
	 */

	public void doubleClick(WebDriver driver, WebElement element);

	/*
	 * drag and drop
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement des);

	/*
	 * click and Hold on specified element
	 */
	public void ClickAndHoldOnElement(WebDriver driver, WebElement element);

	/*
	 * click And Hold
	 */

	public void clickAndHold(WebDriver driver);

	/*
	 * release
	 */

	public void release(WebDriver driver, WebElement element);

	/*
	 * Scroll by Amount
	 */
	public void scrollByAmt(WebDriver driver, int x, int y);

	/*
	 * scrollToElement
	 */
	public void scrollToElent(WebDriver driver, WebElement element);

	/*
	 * scroll From Origin
	 */
	public void scrollFromOrig(WebDriver driver, ScrollOrigin element, int x, int y);

	/*
	 ***** key press action
	 */

	public void keyDown(WebDriver driver, String str);

	/*
	 ***** key press action on specified element
	 */

	public void keyDown(WebDriver driver, WebElement element, String str);

	/*
	 * key relase
	 */
	public void keyUp(WebDriver driver);

	/*
	 * key release on specified element
	 */

	public void keyUpOnEle(WebDriver driver, WebElement element);

	/////////////// Select
	/////////////// clsass//////////////////////////////////////////////////////

	/*
	 * check weather drop down is single select or multiselect if drop down is
	 * multiple return true
	 */

	public boolean ismultiple(WebElement dropdown);

	/*
	 * get all the Options in the dropdown
	 */

	public List<WebElement> getOptions(WebElement dropdown);

	/*
	 * selectBy index
	 */

	public void selectByIndex(WebElement dropdown, int index);

	/*
	 * select by value
	 */
	public void selectByValue(WebElement dropdown, String value);

	/*
	 * select By visibleText
	 */

	public void selectByVisibleTxt(WebElement dropdown, String text);

	/*
	 * deselect by index
	 */

	public void deselectByIndex(WebElement dropdown, int index);

	/*
	 * deselect by value
	 */
	public void deselectByValue(WebElement dropdown, String value);

	/*
	 * select By visibleText
	 */

	public void deselectByVisibleTxt(WebElement dropdown, String text);

	/*
	 * getAll Selected Option
	 */
	public List<WebElement> getAllSlectedOpt(WebElement dropdown);

	/*
	 * getFristSlected option in dropdown
	 */

	public WebElement get1StSelectedOpt(WebElement dropdown);

	/*
	 * get all option in wrapped in a single unit
	 */

	public WebElement getWrapped(WebElement dropdown);

	////////////// Alert interface used to handle the javaScript pop up
	////////////// //////////////////////

	/*
	 * to click on ok button
	 */

	public void accept(WebDriver driver);

	/*
	 * to click on cancel btn
	 */

	public void dismiss(WebDriver driver);

	/*
	 * enter the input
	 */

	public void sendkeys(WebElement ele, String str);

	/*
	 * to get name of the text
	 */
	public String getText(WebDriver driver);

	/*
	 * switch to window
	 */
	public void switchToWindow(WebDriver driver, String url);

	public void switchWindowByTitle(WebDriver driver, String windowTitle, int count);

	/*
	 * switch to frame
	 */

	public void switchByindex(WebDriver driver, int index);

	public void switchBywebElement(WebDriver driver, WebElement element);

	public void switchByName(WebDriver driver, String name);

	public void switchToimmediateParent(WebDriver driver);

	public void switchToParent(WebDriver driver);

	/*
	 * javaScript methods
	 */

	public void javaScriptclick(WebDriver driver, WebElement element);

	public void javaScriptSendinputs(WebDriver driver, String input, WebElement element);

	public void javaScriptRefresh(WebDriver driver, WebElement element);

	public void scrollDownUP(WebDriver driver, int x, int y);

	public void scrollTo(WebDriver driver, int x, int y);

	public void scrollintoView(WebDriver driver, boolean bool, WebElement element);

	public void mouseHoverByJavaScript(WebDriver driver, WebElement locator);

	/*
	 * WAITS
	 */
	public void implicitWait(WebDriver driver, int duration);

	public void WaitForELeTOPresent(WebDriver driver, int duration, String element);

	public void FluientWait(WebDriver driver, int duration, int polling_time, String element);

	public void WaitForClickable(WebDriver driver,WebElement element,int duration);
	
	public void WaitListOfElementT0Present(WebDriver driver,int duration,String element);
	
	public void visibilityOFEle(WebDriver driver,int duration,WebElement ele);
	
	public void presence_of_ele_Loc(WebDriver driver, int duratio,By locator);
	
	public void customWait(WebDriver driver, By locator, int timeout) throws TimeoutException;
	

	/*
	 * WebElement methods
	 */
	public void sendkeyMethod(WebElement ele, String text);

	public boolean isSelected(WebElement ele);

	public boolean isEnabled(WebElement ele);

	public boolean findElement(WebElement ele);

	public void selectBySendkeys(WebElement ele, String input);

	public String getCurrentURL(WebDriver driver);

	public String getTitle(WebDriver driver);

	public void click1(WebElement locator);

	public void clear(WebElement locator);

	public int getColumncount(List<WebElement> row);

	public int getRowCount(List<WebElement> table);

	public boolean launchUrl(WebDriver driver, String url);
	
	public boolean isdisplay(WebElement ele);

	/*
	 * screen shot
	 */
	public String screenShot(WebDriver driver, String filename) throws IOException;

	public File screenShotOnWebElement(WebDriver driver, WebElement element, String fileName) throws IOException;

	public String getCurrentTime();

	public boolean isAlertPresent(WebDriver driver);

	public void pageLoadTimeOut(WebDriver driver, int timeOut);
	public void jsExecutorscrll(WebDriver driver, WebElement element);
	

}
