package util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	private static	Properties value;
	private static WebDriver driver;

	public  WebDriver  invokeBrowser() {
		PropertyReader obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.propertyreader();
		if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions obj_ChromeOptions=new ChromeOptions();
			obj_ChromeOptions.addArguments("InCognito");
			obj_ChromeOptions.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(value.getProperty("url"));
		}

		else if (value.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(value.getProperty("url"));

		}
		else
		{
			System.out.println("no appropiate driver found");
		}
return driver;
	}

}
