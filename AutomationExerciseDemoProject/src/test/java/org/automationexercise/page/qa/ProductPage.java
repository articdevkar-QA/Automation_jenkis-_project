package org.automationexercise.page.qa;

import org.automationexercise.base.qa.Driverlaunch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	public  ProductPage()
	{
		Driverlaunch.driver.manage().deleteAllCookies();
		PageFactory.initElements(Driverlaunch.driver, this);
	}
	 
	@FindBy(xpath="//h2[text()='Category']")
	WebElement ProductParticular;
	
	@FindBy(xpath="//a[@href='/product_details/1']")
	WebElement ViewProduct;
	
	/*
	 * @FindBy(xpath="//a[@href='/product_details/1']") WebElement viewProduct;
	 */
	
	public void productpagetest() 
	{
				
		JavascriptExecutor jse= (JavascriptExecutor)Driverlaunch.driver;
		jse.executeScript("arguments[0].scrollIntoView();", ProductParticular);
		
		ViewProduct.click();
		
		  
	}

}
