package com.cbs.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cbs.base.TestBase;
//import com.cbs.pages.CASACreationPage;
import com.cbs.pages.Homepage;
import com.cbs.pages.LoanCreationPage;
import com.cbs.pages.LoginPage;

public class LoanTestCases extends TestBase
{
	LoginPage loginpage;
	Homepage homepage;
	LoanCreationPage loanCreationPage;
	public LoanTestCases()
	{
		super();
	}
	
	@BeforeTest
	public void setUp() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.makerLogin(properties.getProperty("maker"),properties.getProperty("maker_password"));
		
		loanCreationPage=homepage.clickOnLoanCreation();
		Thread.sleep(3000);
	}
	
/*@Test(priority=1)
	public void createNewLoanAccount() throws Exception
	{
		loanCreationPage.newLoanAccount();
	}
	
	@Test(priority=2)
	public void authLoanAccount() throws Exception
	{
		loginpage=new LoginPage();
		homepage=loginpage.makerLogin(properties.getProperty("checker"),properties.getProperty("checker_password"));
		loanCreationPage=homepage.clickOnLoanCreation();
		Thread.sleep(3000);
		loanCreationPage.authNewLoanAccount();
	}
*/	
	@Test(priority =11)
	public void CashCreditAccountTest() throws Exception
    {
	loanCreationPage.CashCreditAccount();
	}
	@Test(priority=12)
	public void authCashCreditAccountTest() throws Exception
	{
		loginpage=new LoginPage();
		homepage=loginpage.makerLogin(properties.getProperty("checker"),properties.getProperty("checker_password"));
		loanCreationPage=homepage.clickOnLoanCreation();
		Thread.sleep(3000);
		loanCreationPage.authCashCreditAccount();
	}
	
   @Test(priority=13)
   public void AddCCLaonSerurityTest() throws Exception 
	{
		loginpage=new LoginPage();
		homepage=loginpage.makerLogin(properties.getProperty("maker"),properties.getProperty("maker_password"));
		Thread.sleep(5000);
		loanCreationPage.AddCCLaonSerurity();
	}
	
   @Test(priority=14)
   public void authAddCCLaonSerurityTest() throws Exception 
	{
		loginpage=new LoginPage();
		homepage=loginpage.makerLogin(properties.getProperty("checker"),properties.getProperty("checker_password"));
		Thread.sleep(5000);
		loanCreationPage.authAddCCLaonSerurity();
	}
   
   
	
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Siddhesh");
		//driver.quit();
	}
}
