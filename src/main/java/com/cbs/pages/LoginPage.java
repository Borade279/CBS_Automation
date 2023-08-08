package com.cbs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cbs.base.TestBase;
import com.cbs.util.TestUtil;

public class LoginPage extends TestBase
{
	
	TestUtil util=new TestUtil();
	String Message="Invalid employee code/password";
	//page factory or object repository

	@FindBy(id="id_username")
	WebElement username;
	
	@FindBy(id="id_search_employee")
	WebElement verifybutton;
	
	@FindBy(id="id_password")
	WebElement password;
	
	@FindBy(id="id_submit")
	WebElement submitbutton;
	
	@FindBy(xpath = "//div[@id='error_message_master']")
	WebElement ErrorMessageLoginPage;
	
	@FindBy(xpath = "//img[@id='id_emp_photo']") 
	WebElement Profile;
	
	@FindBy(xpath="//a[@id='id_logout']") 
	WebElement Logout;
	
	@FindBy(xpath="//div[@id='error_message_master']")
	WebElement ErrorMessage;
	
	//initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	
	public Homepage makerLogin(String UserName,String Password) throws Exception
	{
		driver.manage().deleteAllCookies();
		username.sendKeys(UserName);
		Thread.sleep(1000);
		verifybutton.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		submitbutton.click();
		Thread.sleep(4000);		
		String Data=driver.findElement(By.xpath("//div[@id='error_message_master']")).getText();
		Data = Data.replace("Error"," ");
		Data = Data.replace("x"," ");
		Data = Data.trim();
		
		if(Data.equals(Message))
		{	
			driver.navigate().refresh();
			driver.manage().deleteAllCookies();
			username.sendKeys(UserName);
			Thread.sleep(1000);
			verifybutton.click();
			Thread.sleep(1000);
			password.sendKeys(Password);
			Thread.sleep(1000);
			submitbutton.click();
		}
		else {
			System.out.println("Maker login Successful");
		}
//		util.getscreenshot();
//		Profile.click();
//		Logout.click(); 
		return new Homepage();
	}
	
	public Homepage checkerLogin(String UserName1,String Password1) throws Exception
	{
		driver.manage().deleteAllCookies();
		username.sendKeys(UserName1);
		Thread.sleep(2000);
		verifybutton.click();
		Thread.sleep(2000);
		password.sendKeys(Password1);
		Thread.sleep(2000);
		submitbutton.click();
		Thread.sleep(3000);
		String Data=driver.findElement(By.xpath("//div[@id='error_message_master']")).getText();
		Data = Data.replace("Error"," ");
		Data = Data.replace("x"," ");
		Data = Data.trim();
		
		if(Data.equals(Message))
		{	
			driver.navigate().refresh();
			driver.manage().deleteAllCookies();
			username.sendKeys(UserName1);
			Thread.sleep(1000);
			verifybutton.click();
			Thread.sleep(1000);
			password.sendKeys(Password1);
			Thread.sleep(1000);
			submitbutton.click();
		}
		else {
			System.out.println("Checker login Successful");
		}
//		Profile.click();
//		Logout.click(); 
		return new Homepage();
	}
}

