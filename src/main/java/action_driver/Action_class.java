package action_driver;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import action_Package.Action_Interface;
import baseClass.BaseClass;

public class Action_class extends BaseClass implements Action_Interface {
	public void click(WebDriver driver, WebElement ele) {

	Actions act = new Actions(driver);
	act.moveToElement(ele).click().build().perform();


}


public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
}


public boolean isDisplayed(WebDriver driver, WebElement ele) {

	boolean flag=false;

	flag=findElement(driver, ele);

	if(flag){
		flag=ele.isDisplayed();
	}
	if(flag){
		System.out.println("Element is Displayed");
	}
	else {
		System.out.println("Element is not Displayed");
	}
	return flag;

}


public boolean type(WebElement ele, String text) {
	boolean flag= false;
	try {
		ele.isDisplayed();
		ele.clear();
		ele.sendKeys(text);
		System.out.println("Typed succesfully");
		flag =true;
		return flag;

	}
	catch (Exception e) {
		
		System.out.println("location Not found");
		return false;
	}

	
		}
	



public boolean findElement(WebDriver driver, WebElement ele) {
	boolean flag =false ;
	try {
		flag=  ele.isDisplayed();
	} catch (Exception e) {
		flag=false;
		e.printStackTrace();
	}
	finally {
		if(flag){

			System.out.println("The element is  Displayed");


		}
		else {
			System.out.println("The element is not Displayed");
		}
	}

	return flag;
}


public boolean isSelected(WebDriver driver, WebElement ele) {
	boolean flag = false;

	flag=findElement(driver, ele);

	try {
		ele.isSelected();

		flag=true;
	}
	catch (Exception e) {

		flag=false;
	}
	finally {

		if(flag) {
			System.out.println("Successfully selcted the element at");
		}
		else {
			System.out.println(" Not  selected the element at");
		}
	}
	return flag;
}


public boolean isEnabled(WebDriver driver, WebElement ele) {
	boolean flag=false;
	flag=findElement(driver, ele);
	try {
		flag=ele.isEnabled();
		flag=true;
	}

	catch (Exception e) {

		flag=false;
	}
	finally {

		if(flag) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}   
	}
	return flag;
}


public boolean selectBySendkeys(String value, WebElement ele) {
	boolean flag =false;
	try {
		ele.sendKeys(value);
		flag =true;
		return flag;
	} catch (Exception e) {
		return false;
	}
	finally {
		if(flag) {
			System.out.println(" selected succesfully");
		}
		else {
			System.out.println(" not seleced");
		}
	}


}


public boolean selectByIndex(WebElement element, int index) {
	boolean flag =false;
	try {
		Select s = new Select(element);
		s.selectByIndex(index);
		flag=true;
		return true;
	} catch (Exception e) {
		return false;
	}
	finally {
		if (flag) {
			System.out.println("Selected successfully ");
		}
		else {
			System.out.println("Not selected ");
		}
	}

}


public boolean selectByValue(WebElement element, String value) {
	boolean flag =false;
	try {
		Select s = new Select(element);
		s.selectByValue(value);
		flag=true;
		return true;
	} catch (Exception e) {
		return false;
	}
	finally {
		if (flag) {
			System.out.println("Selected successfully ");
		}
		else {
			System.out.println("Not selected ");
		}
	}


}


public boolean selectByVisibleText(String visibletext, WebElement ele) {

	boolean flag =false;
	try {
		Select s = new Select(ele);
		s.selectByVisibleText(visibletext);
		flag=true;
		return true;
	} catch (Exception e) {
		return false;
	}
	finally {
		if (flag) {
			System.out.println("Selected successfully ");
		}
		else {
			System.out.println("Not selected ");
		}
	}
}


public boolean mouseHoverByJavaScript(WebElement ele) {

	return false;



}


public boolean JSClick(WebDriver driver, WebElement ele) {

	boolean flag = false;
	try {
		// WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		// driver.executeAsyncScript("arguments[0].click();", element);

		flag = true;

	}

	catch (Exception e) {
		throw e;

	} finally {
		if (flag) {
			System.out.println("Click Action is performed");
		} else if (!flag) {
			System.out.println("Click Action is not performed");
		}
	}
	return flag;
}



public boolean switchToFrameByIndex(WebDriver driver, int index) {
	boolean flag =false;
	try {
		driver.wait(10);
		driver.switchTo().frame(index);
		flag=true;
		return true;
	}
	catch (Exception e) {
		return false;
	}
	finally { 
		if(flag) {
			System.out.println("switched to frame "+ index+ "successfully" );
		}
		else {
			System.out.println("unable to switch to the frame in the "+ index); 
		}

	}


}


public boolean switchToFrameById(WebDriver driver, String idValue) {


	boolean flag =false;
	try {
		driver.wait(10);
		driver.switchTo().frame(idValue);
		flag=true;
		return true;
	}
	catch (Exception e) {
		return false;
	}
	finally { 
		if(flag) {
			System.out.println("switched to frame "+ idValue+ "successfully" );
		}
		else {
			System.out.println("unable to switch to the frame in the "+ idValue); 
		}

	}
}



public boolean switchToFrameByName(WebDriver driver, String nameValue) {

	boolean flag=false;
	try {
		driver.wait(10);


		driver.switchTo().frame(nameValue);
		flag=true;

	}
	catch (InterruptedException e) {

		flag=false;
	}
	finally{
		if(flag) {
			System.out.println("Swithch to the "+  nameValue +"successfully");
		}
		else {
			System.out.println("unable to switch to the frame -"+  nameValue);
		}
	}

	return flag;
}


public boolean switchToDefaultFrame(WebDriver driver) {
	boolean flag=false;
	try {
		driver.wait(10);
		driver.switchTo().defaultContent();
		flag=true;
	} catch (InterruptedException e) {

		flag=false;
	}
	finally {
		if(flag) {
			System.out.println("Swithch to the default frame successfully");
		}
		else {
			System.out.println("Not Swithch to the default frame ");

		}
	}
	return flag;
}


public void mouseOverElement(WebDriver driver, WebElement element) {
	boolean flag = false;
	try {

		new Actions(driver).moveToElement(element).build().perform();
		flag = true;
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (flag) {
			System.out.println(" MouserOver Action is performed on ");
		} else {
			System.out.println("MouseOver action is not performed on");
		}
	}

}


public boolean moveToElement(WebDriver driver, WebElement ele) {
	boolean flag = false;
	try {
		// WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", ele);
		Actions actions = new Actions(driver);
		// actions.moveToElement(driver.findElement(locator)).build().perform();
		actions.moveToElement(ele).build().perform();
		flag = true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
}


public boolean mouseover(WebDriver driver, WebElement ele) {

	return false;
}


public boolean draggable(WebDriver driver, WebElement source, int x, int y) {

	return false;
}


public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {

	boolean flag = false;
	try {
		new Actions(driver).dragAndDrop(source, target).perform();
		flag = true;
		return true;
	} catch (Exception e) {

		return false;
	} finally {
		if (flag) {
			System.out.println("DragAndDrop Action is performed");
		} else if(!flag) {
			System.out.println("DragAndDrop Action is not performed");
		}
	}

}


public boolean slider(WebDriver driver, WebElement ele, int x, int y) {

	return false;
}


public boolean rightclick(WebDriver driver, WebElement ele) {
	boolean flag=false;
	try {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		flag =true;
		return true;
	}
	catch (Exception e) {

		return false;
	}
	finally {
		if(flag) {
			System.out.println("Action is performed");
		}
		else if(!flag) { {
			System.out.println("Action is not performed");
		}
		}
	}
}





public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
	boolean flag = false;
	try {
		Set<String> windowList = driver.getWindowHandles();

		String[] array = windowList.toArray(new String[0]);

		driver.switchTo().window(array[count-1]);

		if (driver.getTitle().contains(windowTitle)){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	} catch (Exception e) {
		//flag = true;
		return false;
	} finally {
		if (flag) {
			System.out.println("Navigated to the window with title");
		} else {
			System.out.println("The Window with title is not Selected");
		}
	}



}


public boolean switchToNewWindow(WebDriver driver) {
	boolean flag = false;
	try {

		Set<String> s=driver.getWindowHandles();
		Object popup[]=s.toArray();
		driver.switchTo().window(popup[1].toString());
		flag = true;
		return flag;
	} catch (Exception e) {
		flag = false;
		return flag;
	} finally {
		if (flag) {
			System.out.println("Window is Navigated with title");				
		} else {
			System.out.println("The Window with title: is not Selected");
		}
	}


}


public boolean switchToOldWindow(WebDriver driver) {
	boolean flag = false;
	try {

		Set<String> s=driver.getWindowHandles();
		Object popup[]=s.toArray();
		driver.switchTo().window(popup[0].toString());
		flag = true;
		return flag;
	} catch (Exception e) {
		flag = false;
		return flag;
	} finally {
		if (flag) {
			System.out.println("Focus navigated to the window with title");			
		} else {
			System.out.println("The Window with title: is not Selected");
		}
	}

}


public int getColumncount(WebElement row) {
	List<WebElement> columns = row.findElements(By.tagName("td"));
	int a = columns.size();
	System.out.println(columns.size());
	for (WebElement column : columns) {
		System.out.print(column.getText());
		System.out.print("|");
	}
	return a;
}



public int getRowCount(WebElement table) {

	List<WebElement> rows = table.findElements(By.tagName("tr"));
	int a = rows.size() - 1;
	return a;
}


public boolean Alert(WebDriver driver) {
	
	boolean presentFlag = false;
	Alert alert = null;

	try {
		// Check the presence of alert
		alert = driver.switchTo().alert();
		// if present consume the alert
		alert.accept();
		presentFlag = true;
	} catch (NoAlertPresentException ex) {
		// Alert present; set the flag

		// Alert not present
		ex.printStackTrace();
	} finally {
		if (!presentFlag) {
			System.out.println("The Alert is handled successfully");		
		} else{
			System.out.println("There was no alert to handle");
		}
	}

	return presentFlag;
}


public boolean launchUrl(WebDriver driver, String url) {
	boolean flag=false;
	try {
		driver.get(url);
		flag =true;
		return true;
	} catch (Exception e) {
		return false;
	}
	finally {
		if (flag) {
			System.out.println(" Succefully lauch The given URL");
		}
		else{
			if (!flag) {

				System.out.println(" Succefully lauch The given URL");

			}
		} 
	}	
}


public boolean isAlertPresent(WebDriver driver) {
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
	}
}
	


public String getCurrentURL(WebDriver driver) {
	
	boolean flag = false;

	String text = driver.getCurrentUrl();
	if (flag) {
		System.out.println("Current URL of the page is: \""+text+"\"");
	}
	return text;
		}


public String getTitle(WebDriver driver) {

	boolean flag=false;
	String title= driver.getTitle();
	if(flag) {
		System.out.println(" Current Title of the page is: \""+ title+"\"");
	}
	return title;
}


public boolean click1(WebElement locator, String locatorName) {
     
	return false;
}


public void fluentWait(WebDriver driver, WebElement element, int timeOut) {

	Wait<WebDriver> wait = null;
    try {
        wait = new FluentWait<WebDriver>((WebDriver) driver)
        		.withTimeout(Duration.ofSeconds(timeOut))
        	    .pollingEvery(Duration.ofSeconds(2))
        	    .ignoring(Exception.class);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }catch(Exception e) {
    }
}


public void implicitWait(WebDriver driver, int timeOut) {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));

}


public void explicitWait(WebDriver driver, WebElement element, int timeOut) {

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.visibilityOf(element));
}


public void pageLoadTimeOut(WebDriver driver, int timeOut) {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));

   
}






//public String getCurrentTime() {
//
//	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//         return dateName;
//}


public boolean clickAndHold(WebDriver driver,WebElement ele) {
    
	boolean flag=false;
	try {
        new Actions(driver).click(ele).perform();
        flag=true;
        return true;
	}
	catch (Exception e) {
		flag=false;
		System.out.println("Action not perform");
	}
	return flag;
                
	
}


public boolean doubleClick(WebDriver driver,WebElement ele) {
	
	boolean flag=false;
	try {
        new Actions(driver).doubleClick(ele).perform();
        flag=true;
        return true;
	}
	catch (Exception e) {
		flag=false;
		System.out.println("Action not perform");
	}
	return flag;
                


}


public boolean release() {
	

	return false;
}


public boolean switchToNewTab(WebDriver driver, String newURL) {
	
	boolean flag=false;
	try {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(newURL);
		flag=true;
	} catch (Exception e) {
		
		flag=false;
	}
	finally{
		if (flag) {
			System.out.println("switchToNewTab succesfully");
		}
		
	}
	return flag;
}


public boolean switchToNewWindow(WebDriver driver, String newURL) {
	boolean flag=false;
	try {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(newURL);
		flag=true;
	} catch (Exception e) {
		
		flag=false;
	}
	finally{
		if (flag) {
			System.out.println("switchToNewTab succesfully");
		}
		
	}
	return flag;
}



public void ScriptTimeOut(WebDriver driver, int timeOut) {
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(timeOut));
	
}


/*public File screenShot(WebDriver driver, String filename, WebElement ele) {
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		File src = ele.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+ "\\Screenshots\\"+filename + "_" + dateName+".png");

        try {
      FileHandler.copy(src, dest);
        } catch (IOException exception) {
      exception.printStackTrace();
        }
		return dest;
	
}*/


public boolean clear(WebElement ele) {
	
	boolean flag=false;
	
	try {
		ele.clear();
		flag=true;
		return true;
	} catch (Exception e) {
		
		return false;
	}
	
	finally{
		if (flag) {
			System.out.println(" Element is cleared");
		}
		else {
			System.out.println(" Element is not found");
		}
	}
	
	
}


public void SendKeys(WebElement ele,String Text) {
	
	ele.sendKeys(Text);
}
	
}