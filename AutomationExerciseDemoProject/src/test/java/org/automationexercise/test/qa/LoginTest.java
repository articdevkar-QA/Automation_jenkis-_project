package org.automationexercise.test.qa;


import org.apache.logging.log4j.Logger;
import org.automationexercise.page.qa.Loginpage;
import org.automationexercise.test.base.qa.BaseTest;
import org.automationexercise.utils.qa.ExcelHelper;
import org.automationexercise.utils.qa.Logutils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest
{
	Logger log = Logutils.getLogger(LoginTest.class);
	@Test(dataProvider = "getData")
    public void ValidLogin(String un, String pwd) {
		 log.info("Starting Login Test");
        Loginpage lp = new Loginpage();
        lp.login(un, pwd);
        log.info("Login Test Passed");
    }

    @DataProvider
    public Object[][] getData() throws Exception {
        return ExcelHelper.getExcelData("Sheet1");
    }
}


