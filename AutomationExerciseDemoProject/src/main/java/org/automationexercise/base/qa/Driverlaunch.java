package org.automationexercise.base.qa;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Driverlaunch 
{
	public static WebDriver driver;
	 public static Properties properties;
	 
	 public static void initproperties()
	 {
		 if (properties == null) 
		 {
	         try {
	        	 properties = new Properties();
	             FileInputStream file = new FileInputStream(
	                 System.getProperty("user.dir") + "/src/main/resources/Application.properties"
	             );
	             properties.load(file);
	         } catch (IOException e) 
	         {
	             e.printStackTrace();
	         }
	         
		 }
	 } 
	 
	 
	 public static void Launchdriver()
	 {
		 String browser = properties.getProperty("browser");

	     if (browser.equalsIgnoreCase("chrome")) 
	     {
	         driver = new ChromeDriver();
	    	 /*WebDriverManager.chromedriver().setup();

	         // Chrome options for headless Jenkins execution
	         ChromeOptions options = new ChromeOptions();
	         options.addArguments("--headless"); // Run without GUI
	         options.addArguments("--disable-gpu"); // Optional for Windows
	         options.addArguments("--window-size=1920,1080"); // Prevent resolution issues

	         // driver = new ChromeDriver(options);*/
	     }
	     else if(browser.equals("firefox")) 
	     {
	     	driver=new FirefoxDriver();
	     }

	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.get(properties.getProperty("url"));
	 }
	 public static WebDriver getDriver() {
		    return driver;
		} 
	 

}
