package com.cbs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cbs.base.TestBase;
import com.cbs.pages.LoginPage;
import com.cbs.util.TestUtil;

public class LoginPageTestcase extends TestBase


{
	LoginPage loginpage;
	
	public LoginPageTestcase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitletest() throws Exception
	{
		String Title=loginpage.loginPageTitle();
		System.out.println("Title:"+Title);
		Assert.assertEquals(Title,"BSG CBS");
	}
	
	@Test(priority=2)
	public void maker_Login() throws Exception
	{
		loginpage.makerLogin(properties.getProperty("maker"),properties.getProperty("maker_password"));
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"https://10.10.10.137/dashboard/masterpage");
	}
	
	@Test(priority=3)
	public void checker_Login() throws Exception
	{
		loginpage.checkerLogin(properties.getProperty("checker"),properties.getProperty("checker_password"));
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url,"https://10.10.10.137/dashboard/masterpage");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
