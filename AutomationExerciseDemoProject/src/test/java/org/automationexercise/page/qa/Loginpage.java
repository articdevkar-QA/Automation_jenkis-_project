package org.automationexercise.page.qa;

import org.automationexercise.base.qa.Driverlaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public  Loginpage()
	{
		Driverlaunch.driver.manage().deleteAllCookies();
		PageFactory.initElements(Driverlaunch.driver, this);
		
	}

    @FindBy(xpath ="//a[@href='/login']")
    WebElement loginlink;

    @FindBy(xpath ="//form[@action='/login']/input[@name='email']")
    WebElement LoginEmail;

    @FindBy(xpath ="//form[@action='/login']/input[@name='password']")
    WebElement LoginPassword;

    @FindBy(xpath ="//button[@data-qa='login-button']")
    WebElement LoginBtn;

   
    public void login(String un, String pwd) {
        loginlink.click();
        LoginEmail.sendKeys(un);
        LoginPassword.sendKeys(pwd);
        LoginBtn.click();
    }
    

}
