package org.automationexercise.test.qa;



import org.apache.logging.log4j.Logger;
import org.automationexercise.base.qa.Driverlaunch;
import org.automationexercise.page.qa.Loginpage;
import org.automationexercise.page.qa.ProductPage;
import org.automationexercise.test.base.qa.BaseTest;
import org.automationexercise.utils.qa.Logutils;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest
{
	Logger log = Logutils.getLogger(ProductTest.class);
    @Test
	public void  viewproduct()
	{
    	Driverlaunch.driver.manage().deleteAllCookies();
    	log.info("logging");
		Loginpage LT=new Loginpage();
		LT.login("abcd.def@gmail.com", "abcd@123");
		log.info("logged in");
		log.info("Navigativing to product page");
		ProductPage pp=new ProductPage();
		pp.productpagetest();
		log.info("product page visible");
	
		
		
	}
}


