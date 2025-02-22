package baseClass;



import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static Properties prop;
	public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();


	public WebDriver getDriver() {

		return threadLocalDriver.get();		

	}
	@BeforeSuite()

	public void loadConfig() throws IOException {


		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\1\\Configuration\\config.properties");
		prop.load(ip);
	}


    public  void launchApp() {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

		threadLocalDriver.set(driver);

	}



}

