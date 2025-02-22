package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dd {
	
	
	
	
	@Test
	public void test() throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://dev-merchant.facheck.biz/login");
		// driver.navigate().refresh();
		 driver.findElement(By.xpath("//img[@src='assets/add-1.png']")).click();
		  WebElement web= driver.findElement(By.id("dropdown"));
		 Select se=new Select(web);
		 List<WebElement> li=driver.findElements(By.xpath("//option"));
		 for (WebElement webElement : li) {
			 driver.findElement(By.id("dropdown")).click();
			 se.selectByVisibleText(webElement.getText());
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(2000);
		}
		 
	}

}
 