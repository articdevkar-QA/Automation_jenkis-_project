package org.automationexercise.test.qa;



import org.apache.logging.log4j.Logger;
import org.automationexercise.base.qa.Driverlaunch;
import org.automationexercise.page.qa.Checkoutpage;
import org.automationexercise.page.qa.Loginpage;
import org.automationexercise.test.base.qa.BaseTest;
import org.automationexercise.utils.qa.Logutils;
import org.testng.annotations.Test;



public class CheckoutTest extends BaseTest
{
	Logger log = Logutils.getLogger(CheckoutTest.class);
@Test

	public void proceedtocheckout()
	{
		Driverlaunch.driver.manage().deleteAllCookies();
		Loginpage LT=new Loginpage();
		LT.login("abcd.def@gmail.com", "abcd@123");
		log.info("loggen in");
		Checkoutpage ck=new Checkoutpage();
		ck.Checkout();
		log.info("user checkout");
	}
}


