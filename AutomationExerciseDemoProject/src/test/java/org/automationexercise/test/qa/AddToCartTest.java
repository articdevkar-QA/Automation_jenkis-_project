package org.automationexercise.test.qa;



import org.apache.logging.log4j.Logger;
import org.automationexercise.base.qa.BaseTest;
import org.automationexercise.base.qa.Driverlaunch;
import org.automationexercise.page.qa.AddToCart;
import org.automationexercise.page.qa.Loginpage;
import org.automationexercise.utils.qa.Logutils;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest
{
	Logger log = Logutils.getLogger(AddToCartTest.class);
    @Test
	public void addtocarttest()
	{
		Driverlaunch.driver.manage().deleteAllCookies();
		log.info("Starting Login ");
		Loginpage LT=new Loginpage();
		LT.login("abcd.def@gmail.com", "abcd@123");
		log.info("Logged in");
		log.info("Add to cart Test started");
		AddToCart ad=new AddToCart();
		ad.productpagetest();
		log.info("Add to cart Test passed");
	}

}


