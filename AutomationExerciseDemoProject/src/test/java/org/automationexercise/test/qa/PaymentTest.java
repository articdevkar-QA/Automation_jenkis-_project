package org.automationexercise.test.qa;



import org.apache.logging.log4j.Logger;
import org.automationexercise.base.qa.BaseTest;
import org.automationexercise.base.qa.Driverlaunch;
import org.automationexercise.page.qa.Paymentcheck;
import org.automationexercise.utils.qa.Logutils;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PaymentTest extends BaseTest
{
	Logger log = Logutils.getLogger(PaymentTest.class);
	@Test
	public void paymenttest() throws InterruptedException
	{
		ExtentSparkReporter  sp = new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\AutomationExerciseDemo\\Reports\\extend.html");
		
		ExtentReports er = new ExtentReports();
		er.attachReporter(sp);

		ExtentTest test = er.createTest("Test1-----");

		test.info("Test is getting started");		
		Driverlaunch.driver.manage().deleteAllCookies();
		CheckoutTest ct=new CheckoutTest();
		ct.proceedtocheckout();
		log.info("user checked out ");
		Paymentcheck pc=new Paymentcheck();
		pc.paymentchecktest();
		log.info("payment done");
		er.flush();
		
	}
}


