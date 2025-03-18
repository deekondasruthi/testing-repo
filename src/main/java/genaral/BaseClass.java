package genaral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import axtion_interface_Reseller.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public  class BaseClass extends ActionClass_Atus {
	public WebDriver driver;

	@BeforeSuite
	public void beforesuit() {

	}

	@AfterSuite
	public void afteresuit() {

	}

	@BeforeClass
	public void beforClass() {
		String browser="Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		else
			driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		driver.get("https://staging-mmsadmin.basispay.in/login");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("majeeth.h@babujiventures.in");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(1000);
		
		
		
	}

	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	}

}
