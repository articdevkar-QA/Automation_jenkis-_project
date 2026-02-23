package org.automationexercise.page.qa;

import org.automationexercise.base.qa.Driverlaunch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage 
{
	public  Checkoutpage()
	{
		PageFactory.initElements(Driverlaunch.driver, this);
		
	}

	
	@FindBy(xpath="//h2[text()='Category']")
	WebElement ProductParticular;

	@FindBy(xpath="//p[text()='Blue Top']/ancestor::div[@class='productinfo text-center']/child::a[@class='btn btn-default add-to-cart']")
	WebElement blueTop;

	@FindBy(xpath="//a[@href='/view_cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	WebElement Checkoutbutton;
	
	public void Checkout() 
	{
		
		JavascriptExecutor jse= (JavascriptExecutor)Driverlaunch.driver;
		jse.executeScript("arguments[0].scrollIntoView();", ProductParticular);
		
		blueTop.click();
		viewcart.click();
		Checkoutbutton.click();
		
	}
	

}
