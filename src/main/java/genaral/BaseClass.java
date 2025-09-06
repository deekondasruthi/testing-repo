package genaral;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import axtion_interface_Reseller.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.AsposeOCRException;
import com.aspose.ocr.InputType;
import com.aspose.ocr.OcrInput;
import com.aspose.ocr.RecognitionResult;

public class BaseClass extends ActionClass_Atus {
	public WebDriver driver;

	@BeforeSuite
	public void beforesuit() {

	}

	@AfterSuite
	public void afteresuit() {

	}

	@BeforeClass
	public void beforClass() {
		
		String downloadPath="C:\\Users\\DELL\\eclipse-workspace\\ci.com\\src\\test\\resources";
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("prefs", Map.of(
			    "download.default_directory", downloadPath,
			    "download.prompt_for_download", false,
			    "download.directory_upgrade", true,
			    "safebrowsing.enabled", true,
			    "profile.default_content_settings.popups", 0
			   
			));


		// String
		// browser=System.getProperty("browser")!=null?System.getProperty("browser"):"edge";

//		String CodeBrowser="chrome";
		PropertyFileProg.adminPropertyFile();
		String browser = PropertyFileProg.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

//			 To Run test in headless mode
//			ChromeOptions opt=new ChromeOptions();
//			opt.addArguments("headless");
//			driver=new ChromeDriver(opt);
			 WebDriverManager.chromedriver().setup(); // Automatically downloads & sets path

		        ChromeOptions options = new ChromeOptions();
//		        options.addArguments("--start-maximized"); // Optional: opens browser maximized
		        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Removes "Chrome is being controlled" message

		        driver = new ChromeDriver(options);


			
		}

		else
			driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		

	}

	@AfterClass
	public void afterClass() {
//		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException, AsposeOCRException {
		// merchant
//		driver.get("https://dev-admin.farginconnect.com/login-page");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("majeeth.h@babujiventures.in");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Your password']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//button")).click();
//		Thread.sleep(1000);

		driver.get("https://dev-admin.farginconnect.com/login-page");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(PropertyFileProg.getProperty("email"));
		WebElement cat = driver.findElement(By.id("Bussiness category"));
		Select se = new Select(cat);
		cat.click();
		se.selectByVisibleText("Cable Services");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PropertyFileProg.getProperty("pass"));
//		WebElement captcha = driver.findElement(By.xpath("//input[@class='input']"));

		// screen shot
//		File tem = captcha.getScreenshotAs(OutputType.FILE);
//		File per = new File("C:\\Users\\DELL\\eclipse-workspace\\ci.com\\screenshot\\cpatcha.jpg");
//		FileHandler.copy(tem, per);

		Thread.sleep(5000);
		// read text

//		AsposeOCR api = new AsposeOCR();
//		OcrInput images = new OcrInput(InputType.SingleImage);

//		images.add("C:\\Users\\DELL\\eclipse-workspace\\ci.com\\screenshot\\cpatcha.jpg"); // Path to your image
		// Recognize text
//		ArrayList<RecognitionResult> results = api.Recognize(images);
//		System.out.println("Extracted Text: " + results.get(0).recognitionText);
//		String extractedText = results.get(0).recognitionText;
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter the Captcha']")).sendKeys(extractedText.trim());
		
		/*
		 * manul entry
		 */
//		driver.findElement(By.xpath("//input[@placeholder='Enter the Captcha']")).sendKeys(extractedText.trim());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
	}

	@AfterMethod
	public void afterMethod() {

	}

}
