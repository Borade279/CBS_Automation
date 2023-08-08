package com.cbs.util;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.cbs.base.TestBase;
//import com.cbs.pages.LoanCreationPage;
public class LoanSecurityUtil extends TestBase
{
	
	public static long PAGE_LOAD_TIME=20;
	public static long IMPLICIT_WAIT=20;
	//LoanCreationPage loanCreationPage = new LoanCreationPage();
	
	
	public void LoanAgaintHome() throws Exception 
	{
		Select LoanSecurityType = new Select(driver.findElement(By.xpath("//select[@id='id_securitytype']")));
		Thread.sleep(3000);
		
		LoanSecurityType.selectByVisibleText("House");
		driver.findElement(By.xpath("//textarea[@id='id_housedesc']")).sendKeys("2 BHK");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='id_agreementvalue']")).sendKeys("100000");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='id_stampduty']")).sendKeys("1000");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='id_registrationcharges']")).sendKeys("200");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='id_advancepaid']")).sendKeys("1500");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='id_marketvalueonregistration']")).sendKeys("15000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='id_marketvalueonvalue']")).sendKeys("556156");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_valuationdate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='id_valuername']")).sendKeys("Akash");
//		driver.findElement(By.xpath("//button[@id='idAddForm']")).click();
//		driver.findElement(By.xpath("//input[@id='id_totalvalue']")).sendKeys("158899");
		
		///**** following code is traken from LoanCreationPage --- you can also put in LoanCreationPage page.
		
		/*HouseDescription.sendKeys(row.getCell(14).getStringCellValue());
		double Agreementvalue = (double) row.getCell(15).getNumericCellValue();
		AgreementValue.sendKeys(String.valueOf(Agreementvalue));
		int stampduty = (int) row.getCell(16).getNumericCellValue();
		StampDuty.sendKeys(String.valueOf(stampduty));
		int Regcharges = (int) row.getCell(17).getNumericCellValue();
		RegistrationCharges.sendKeys(String.valueOf(Regcharges));
		int advpaid = (int) row.getCell(18).getNumericCellValue();
		AdvancePaid.sendKeys(String.valueOf(advpaid));
		double marketvalueonregistration = (double) row.getCell(19).getNumericCellValue();
		Marketvalueonregistration.sendKeys(String.valueOf(marketvalueonregistration));
		double marketvalueonvalue = (double) row.getCell(20).getNumericCellValue();
		Marketvalueonvalue.sendKeys(String.valueOf(marketvalueonvalue));
		Totalvalue.click();
		Thread.sleep(3000);
		ValuerName.sendKeys(row.getCell(21).getStringCellValue());*/
	}

	public void FDasLoanSecurity() throws Exception 
	{
		Select LoanSecurityType = new Select(driver.findElement(By.xpath("//select[@id='id_securitytype']")));
		LoanSecurityType.selectByVisibleText("Bank Deposit");
		driver.findElement(By.xpath("//input[@id='id_td_accounts']")).sendKeys("2300007003355");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		//driver.findElement(By.xpath("//input[@id='id_margin']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_total_amount']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='id_AddBankDeposit']")).click();
	}
	public void LoanAgaintLand() throws Exception 
	{
		Select LoanSecurityType = new Select(driver.findElement(By.xpath("//select[@id='id_securitytype']")));
		LoanSecurityType.selectByVisibleText("Land");
		driver.findElement(By.xpath("//textarea[@id='id_propertydesc']")).sendKeys("2 acers");
		driver.findElement(By.xpath("//input[@name='agreementvalue']")).sendKeys("152302");
		driver.findElement(By.xpath("//input[@id='id_stampduty']")).sendKeys("125632");
		driver.findElement(By.xpath("//input[@id='id_registrationcharges']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='id_advancepaid']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@id='id_marketvalueonregistration']")).sendKeys("1000000");
		driver.findElement(By.xpath("//input[@id='id_marketvalueonvalue']")).sendKeys("1000000");
		driver.findElement(By.xpath("//input[@id='id_valuationdate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='id_valuername']")).sendKeys("Akash");
	}
	public void GOLDLoanSecurity() 
	{
		Select LoanSecurityType = new Select(driver.findElement(By.xpath("//select[@id='id_securitytype']")));
		LoanSecurityType.selectByVisibleText("Gold/Jewellery");
		driver.findElement(By.xpath("//input[@id='id_witnesscustid']")).sendKeys("51104");
		driver.findElement(By.xpath("//input[@id='id_storagerefno']")).sendKeys("1256");
		Select Valuer_Name=new Select(driver.findElement(By.xpath("//select[@id='id_valuer_name']")));
		Valuer_Name.selectByIndex(2);
		driver.findElement(By.xpath("//textarea[@id='id_golddesc']")).sendKeys("24 carat pure gold");
		driver.findElement(By.xpath("//input[@id='id_item_weight']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='id_stone_weight']")).sendKeys("1");
		Select Gold_purity = new Select(driver.findElement(By.xpath("//select[@id='id_gold_purity']")));
		Gold_purity.selectByIndex(1);
	}
}
