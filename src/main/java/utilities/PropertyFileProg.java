package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileProg {
	
	public static String adminpropertyFile(String key) throws IOException {
		
		
		
		
		Properties prop= new Properties();
		FileInputStream ip =new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/credential.Properties");
		 prop.load(ip);
		return key;
		
	}
	
	
	
	
	

}
