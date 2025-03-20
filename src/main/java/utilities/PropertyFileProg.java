package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileProg {
	public static String adminpropertyFile(String key) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ci.com\\src\\test\\resources\\credential.properties");
					

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties pro = new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro.getProperty(key);

	}
	
	
	public static String traderpropertyFile(String key) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\NewProject\\BackOffice\\src\\main\\resources\\Propertyfile\\trader.properties");
					

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties pro = new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro.getProperty(key);

	}
	
	

}
