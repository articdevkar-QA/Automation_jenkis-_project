package org.automationexercise.page.qa;

import org.automationexercise.base.qa.Driverlaunch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Paymentcheck 
{
	public Paymentcheck()
	{
		
		PageFactory.initElements(Driverlaunch.driver, this);
		
	}
	@FindBy(xpath="//h2[text()='Review Your Order']")
	WebElement ReviewOrder;
	
	@FindBy(xpath="//a[@href='/payment']")
	WebElement Placeorder;
	
	@FindBy(xpath="//form[@id='payment-form']//descendant::input[@name='name_on_card']")
	WebElement NameOnCard;
	
	@FindBy(xpath="//form[@id='payment-form']//descendant::input[@name='card_number']")
	WebElement Cardnumber;
	
	@FindBy(xpath="//form[@id='payment-form']//descendant::input[@name='cvc']")
	WebElement CVC;
	
	@FindBy(xpath="//form[@id='payment-form']//descendant::input[@name='expiry_month']")
	WebElement expiry_month;
		
	@FindBy(xpath="//form[@id='payment-form']//descendant::input[@name='expiry_year']")
	WebElement expiry_year;
	
	@FindBy(xpath="//button[text()='Pay and Confirm Order']")
	WebElement Submitbutton;
	
	@FindBy(xpath="//b[text()='Order Placed!']")
	WebElement Assertationtext;
	
	
	public void paymentchecktest() throws InterruptedException
	{
		
		JavascriptExecutor jse= (JavascriptExecutor)Driverlaunch.driver;
		jse.executeScript("window.scrollBy(0,600)");
		//jse.executeScript("arguments[0].scrollIntoView();", ReviewOrder);
		Placeorder.click();
		NameOnCard.sendKeys("abc");
		Cardnumber.sendKeys("1234567");
		CVC.sendKeys("123");
		expiry_month.sendKeys("12");
		expiry_year.sendKeys("2027");
		jse.executeScript("window.scrollBy(0,600)");
		Submitbutton.click();
		Thread.sleep(3000);
		
		String actualValue = Assertationtext.getText();
		System.out.println(actualValue);
		Assert.assertEquals(actualValue, "ORDER PLACED!", "Value is not matching"); 
		
	}


}
