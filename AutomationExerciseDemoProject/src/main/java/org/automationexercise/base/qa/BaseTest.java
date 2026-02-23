package org.automationexercise.base.qa;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	@BeforeMethod
    public void setup() {
        Driverlaunch.initproperties();
        Driverlaunch.Launchdriver();
        
    }

	
	
	  @AfterMethod public void tearDown() { Driverlaunch.driver.quit(); }
	 
	 

}
