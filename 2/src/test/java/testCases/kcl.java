package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class kcl {
	
	@Test
		public void test() {
			WebDriver driver=new ChromeDriver();
		 driver.get("https://admin.kalaignarcentenarylibrary.tn.gov.in/library-dashboard/viewall-subpermission");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("majeeth.h@babujiventures.in");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
		 driver.findElement(By.xpath("//button")).click();
		 }
		
		 
	}


