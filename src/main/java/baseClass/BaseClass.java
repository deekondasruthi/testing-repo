package baseClass;



import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseClass {

	public static Properties prop;
	public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();


	public WebDriver getDriver() {

		return threadLocalDriver.get();		

	}
//	@BeforeSuite()
//
//	public void loadConfig() throws IOException {
//
//
//		prop = new Properties();
//		FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\1\\Configuration\\config.properties");
//		prop.load(ip);
//	}


    public  void launchApp() {

//		ChromeOptions option = new ChromeOptions();
//
//		option.addArguments("--remote-allow-origins=*");
    	
    	if (System.getProperty("path")!=null) {
    		System.setProperty("webdriver.chrome.driver", "/user/bin/chromedriver");
    		WebDriver driver=new ChromeDriver();

    		driver.manage().window().maximize();
    		driver.manage().deleteAllCookies();

    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    		driver.get("https://staging-mmsadmin.basispay.in/login");
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

    		threadLocalDriver.set(driver);

		}
    	else {
    		WebDriver driver=new ChromeDriver();

    		driver.manage().window().maximize();
    		driver.manage().deleteAllCookies();

    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    		driver.get("https://staging-mmsadmin.basispay.in/login");
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

    		threadLocalDriver.set(driver);

		}
    
    		
	}
     	


}

