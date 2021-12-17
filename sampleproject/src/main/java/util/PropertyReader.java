package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 

public class PropertyReader {
	
	FileInputStream obj_FileInputStream;
	public Properties    propertyreader() {
		
		try {
			  obj_FileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties");
		} catch (FileNotFoundException e) {
			 
		}
		
	Properties obj_Properties=new Properties();
	try {
		obj_Properties.load(obj_FileInputStream);
	} catch (IOException e) {
		 System.out.println(e);
	}
	return obj_Properties;
	}

}
