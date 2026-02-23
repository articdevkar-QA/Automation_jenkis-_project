package org.automationexercise.utils.qa;

import org.apache.logging.log4j.Logger;
import org.automationexercise.base.qa.Driverlaunch;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListnerUtils implements ITestListener
{
	private static ExtentReports extent = ExtentReportsUtils.getInstance();
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
	
	Logger log = Logutils.getLogger(TestListnerUtils.class);
	public void onStart(ITestContext context)
	{
		log.info("Test Suite Started : " + context.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		log.info("Test execution is getting start");
		ExtentTest test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		test.info("Test Execution has been Started");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
	    
		log.info("Test Passed");
		extentTest.get().pass("Test has been Passed");
	 }
	
	public void onTestSkipped(ITestResult result) 
	{
		log.warn("Test Debugg");
		extentTest.get().skip("Test has been Skipped");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		log.info("Test failed");
		log.debug("Test Debugg");
		 
		String screenshotPath = Screenshotutils.captureScreenshot(Driverlaunch.driver, result.getMethod().getMethodName());

		extentTest.get().fail(result.getThrowable());
		extentTest.get().addScreenCaptureFromPath(screenshotPath);
	  }
	
	public void onFinish(ITestContext context) 
	{
	
		log.info("Test Finshed");
		extent.flush();
	 }

}
