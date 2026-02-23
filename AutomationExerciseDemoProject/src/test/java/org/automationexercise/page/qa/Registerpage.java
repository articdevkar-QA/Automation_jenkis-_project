package org.automationexercise.page.qa;


import org.automationexercise.base.qa.Driverlaunch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registerpage 
{
	@BeforeTest
	public void setupRegister()
	{
		Driverlaunch.initproperties();
		Driverlaunch.Launchdriver();
		PageFactory.initElements(Driverlaunch.driver, this);
	}
	
	//Locating a signup/login link
	@FindBy(xpath ="//a[@href='/login']")
	WebElement loginlink;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement SignupName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement SignupEmail;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement SignupButton;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement Day;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement Month;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement Year;
	
	@FindBy(xpath="//label[text()='Date of Birth']")
	WebElement PE;
	
	/*
	 * @FindBy(xpath="//h2[normalize-space()='Address Information']") WebElement
	 * particularElement;
	 */
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement First_name;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement Last_name;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement Address;
	
	@FindBy(xpath="//label[text()='Address 2']")
	WebElement ParticularElement;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement Country;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement Zip;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement MobileNo;
	
	@FindBy(xpath="//button[text()='Create Account']")
	WebElement CreateAccountBtn;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement ContinueBtn;
	
	
	@Test
	public void NewUserRegistration() 
	{
		loginlink.click();
		
		
		SignupName.sendKeys("xyz");
		
		SignupEmail.sendKeys("xyz.def@gmail.com");
		
		SignupButton.click();
		
		Gender.click();
		Password.sendKeys("abcd@123");
		
		
		//select day drop down
		Select day=new Select(Day);
		day.selectByIndex(24);
		
		//select month of drop down
		Select month=new Select(Month);
		month.selectByIndex(12);
	
		//select year of drop down
		Select year=new Select(Year);
		year.selectByValue("1998");
		
		//scrolling
		JavascriptExecutor jse= (JavascriptExecutor)Driverlaunch.driver;
		jse.executeScript("arguments[0].scrollIntoView();", PE);
		
	
		First_name.sendKeys("abcd");
	
		Last_name.sendKeys("def");
		
		Address.sendKeys("WTH");
		
		//scrolling to new webelement
		jse.executeScript("arguments[0].scrollIntoView();", ParticularElement);
		
		//select Country of drop down
		Select country=new Select(Country);
		country.selectByValue("India");
		
		State.sendKeys("MH");
		
		City.sendKeys("Pune");
		
		Zip.sendKeys("123456");
		
		MobileNo.sendKeys("1234567898");
		
		CreateAccountBtn.click();
		
		ContinueBtn.click();
		
		
	}
	@AfterTest
	public void teardown()
	{
		Driverlaunch.driver.quit();
	}

}


