package com.cbs.testcases;

import org.testng.annotations.BeforeTest;

import com.cbs.base.TestBase;
import com.cbs.pages.CashPage;
import com.cbs.pages.Homepage;
import com.cbs.pages.LoginPage;
import com.cbs.pages.TransferPage;

public class TransferTestPage extends TestBase{

	LoginPage loginpage;
	Homepage homepage;
	TransferPage transferPage;
	
	public TransferCases() {
		super();
	}
	@BeforeTest
	public void setUp() throws Exception {

		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.makerLogin(properties.getProperty("maker"), properties.getProperty("maker_password"));		
		transferPage=homepage.clickOnTransfer();		
		Thread.sleep(5000);
	}

}
