package com.cbs.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.base.TestBase;
import com.cbs.util.LoanSecurityUtil;
import com.cbs.util.MyExcelFile;
import com.cbs.util.TestUtil;

public class LoanCreationPage extends TestBase
{
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Row row;
	String location = "C:\\Users\\AkashBorade\\Desktop\\Excel Autom\\CBS_Automation.xlsx";
	public static String New_Loan_Account;
	public static String New_CC_Account;
	
	LoanSecurityUtil SecurityUtil = new LoanSecurityUtil();
	MyExcelFile MyExcelfile = new MyExcelFile();
	
	@FindBy(xpath="//select[@id='id_loan_type']")
	WebElement Loan_Type;
	
	@FindBy(xpath="//button[@id='btnNew']")
	WebElement NewAccount;
	
	@FindBy(xpath="//input[@id='id_customerno']")
	WebElement CustomerNo;
	
	@FindBy(xpath="//select[@id='id_singlejoint']")
	WebElement singlejoint;
	
	@FindBy(xpath="//select[@id='id_productcode']")
	WebElement LoanProductCode;
	
	@FindBy(xpath="//button[@id='btnSubmitForm']")
	WebElement SubmitForm;
	
	@FindBy(xpath="//img[@id='id_emp_photo']")
	WebElement emp_photo;
	
	@FindBy(xpath="//a[@id='id_logout']")
	WebElement logout;
	
	@FindBy(xpath="//div[@id='error_message_master']")
	WebElement Error_message_master;
	
	@FindBy(xpath="//a[@id='id_closeErrorMessage']")
	WebElement CloseErrorMessage;
	
	@FindBy(xpath="//input[@id='id_customername']")
	WebElement CustName;
	
	@FindBy(xpath="//span[contains(text(),'Basic Information')]")
	WebElement BasicInfo;
	
	@FindBy(xpath="//input[@id='id_loanamount']")
	WebElement SanctionAmount;
	
	@FindBy(xpath="//input[@id='id_loantenureyears']")
	WebElement Loan_Tenure_Year;
	
	@FindBy(xpath="//input[@id='id_loantenuremonths']")
	WebElement Loan_Tenure_Month;
	
	@FindBy(xpath="//input[@id='id_loantenuredays']")
	WebElement Loan_Tenure_Days;
	
	@FindBy(xpath="//input[@id='id_sanctioningAuthority']")
	WebElement SanctioningAuthority;
	
	@FindBy(xpath="//select[@id='id_disbursementtype']")
	WebElement DisbursementType;
	
	@FindBy(xpath="//input[@id='id_moratoriumperiod']")
	WebElement MoratoriumPeriod;
	
	@FindBy(xpath="//select[@id='id_moratoriumintrecoverymode']")
	WebElement MoratoriumInterestRecovery;
	
	@FindBy(xpath="//select[@id='id_installmentfrequency']")
	WebElement InstallmentFrequency;
	
	@FindBy(xpath="//select[@id='id_businesstype']")
	WebElement BusinessType;
	
	@FindBy(xpath="//select[@id='id_loanpurpose']")
	WebElement LoanPurpose;
	
	@FindBy(xpath="//input[@id='id_sharesobtained']")
	WebElement NoOfShares;
	
	@FindBy(xpath="//select[@id='id_sector']")
	WebElement Sector;
	
	@FindBy(xpath="//input[@id='id_docsubmissiondate']")
	WebElement DocumentSubmissionDate;
	
	@FindBy(xpath="//input[@id='id_docexpirydate']")
	WebElement DocumentExpiryDate;
	
	@FindBy(xpath="//select[@id='id_industry_type']")
	WebElement IndustryType;
	
	@FindBy(xpath="//select[@id='id_industry_sub_type']")
	WebElement IndustrySubtype;
	
	@FindBy(xpath="//select[@id='id_segment_type']")
	WebElement SegmentType;
	
	@FindBy(xpath="//select[@id='id_segment_sub_type']")
	WebElement SegmentSubtype;
	
	@FindBy(xpath="//select[@id='id_loanee_type']")
	WebElement LoaneeType;
	
	@FindBy(xpath="//select[@id='id_loan_category']")
	WebElement LoanCategory;
	
	@FindBy(xpath="//input[@id='id_membershipno']")
	WebElement Membershipnumber;
	
	@FindBy(xpath="//input[@id='id_gracedaysforstatement']")
	WebElement GracePeriod;
	
	@FindBy(xpath="//span[contains(text(),'Guarantor Mapping')]")
	WebElement GuarantorMapping;
	
	@FindBy(xpath="//input[@id='id_customerno']")
	WebElement GuarantorcustomerNo;
	
	@FindBy(xpath="//input[@id='id_accno']")
	WebElement LoanAccountNo;
	
	@FindBy(xpath="//input[@id='id_remarks']")
	WebElement Remarks;
	
	@FindBy(xpath="//button[@id='id_AddGuarantor']")
	WebElement AddGuarantor;
	
	@FindBy(xpath="//span[contains(text(),'Nominee Details')]")
	WebElement NomineeDetails;
	
	@FindBy(xpath="//input[@id='id_txtCustomernumber']")
	WebElement NomcustomerID;
	
	@FindBy(xpath="//span[@id='id_search']")
	WebElement Search;
	
	@FindBy(xpath="//select[@id='id_NomineeRelationType']")
	WebElement Relation;
	
	@FindBy(xpath="//input[@id='id_NomineePercentage']")
	WebElement NomineePercentage;
	
	@FindBy(xpath="//button[@id='id_nominee_add']")
	WebElement Nominee_Add;
	
	@FindBy(xpath="//button[@id='id_nominee_add']")      
	WebElement Nominee_Submit;
	
	@FindBy(xpath="//button[@id='id_skip_5']")
	WebElement Nominee_Skip;
	
	@FindBy(xpath="//span[contains(text(),'Security Details')]")
	WebElement SecurityDetails;
	
	@FindBy(xpath="//select[@id='id_securitytype']")
	WebElement SecurityType;
	
	@FindBy(xpath="//textarea[@id='id_housedesc']")
	WebElement HouseDescription;
	
	@FindBy(xpath="//input[@id='id_agreementvalue']")
	WebElement AgreementValue;
	
	@FindBy(xpath="//input[@id='id_stampduty']")
	WebElement StampDuty;
	
	@FindBy(xpath="//input[@id='id_registrationcharges']")
	WebElement RegistrationCharges;
	
	@FindBy(xpath="//input[@id='id_advancepaid']")
	WebElement AdvancePaid;
	
	@FindBy(xpath="//input[@id='id_marketvalueonregistration']")
	WebElement Marketvalueonregistration;
	
	@FindBy(xpath="//input[@id='id_marketvalueonvalue']")
	WebElement Marketvalueonvalue;
	
	@FindBy(xpath="//input[@id='id_valuername']")
	WebElement ValuerName;
	
	@FindBy(xpath="//input[@id='id_totalvalue']")
	WebElement Totalvalue;
	
	@FindBy(xpath="//button[@id='idAddForm']")
	WebElement Add_Security;
	
	@FindBy(xpath="//button[@id='btnSendToVerify']")
	WebElement SendToVerify;
	
	@FindBy(xpath="//button[@id='btnAuthorize']")
	WebElement LoanAuthorize;
	
	@FindBy(xpath="//button[@id='id_authorize']")
	WebElement Verify;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[6]/button[contains(text(),'View')]")
	WebElement Guarantor_View;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[7]/button[contains(text(),'Verify')]")
	WebElement Guarantor_Verify;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[5]/button[contains(text(),'View')]")
	WebElement Security_View;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[6]/button[contains(text(),'Authorize')]")
	WebElement Security_Authorize;
	
	@FindBy(xpath="//span[text()='Loans and Advances']") 
	WebElement Loan_and_Advances;
	
	@FindBy(xpath="//a[@href='/loans/loan-maintenance-list']")
	WebElement Loan_account_maintenance;
	
	@FindBy(xpath ="//button[contains(text(),'View')]")
	WebElement View_CC_AC_Security;
	
	//@FindBy (xpath="//button[@id='btnVerify_14']")
	@FindBy (xpath = "//button[contains(text(),'Authorize')]")
	WebElement Authorize_CC_AC_Security;
	
	@FindBy (xpath = "//button[@id='btnSearchRequest']")
	WebElement Search_Button;
	
	TestUtil util=new TestUtil();
	
	public LoanCreationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newLoanAccount() throws Exception
	{
		Select loan_type=new Select(Loan_Type);//Term Loan
		loan_type.selectByIndex(1);
		Thread.sleep(3000);
		NewAccount.click();
		Thread.sleep(3000);
		fis = new FileInputStream(location);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Loan Account");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		for (int i=1;i<=rowcount;i++)
		{
			row = sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				//XSSFCell cell=(XSSFCell) row.getCell(j);
				int cust_no = (int) row.getCell(0).getNumericCellValue();
				CustomerNo.sendKeys(String.valueOf(cust_no));
				CustName.click();
				Thread.sleep(3000);
				//util.handle_popop();
				Thread.sleep(2000);
				Select loan_product_code=new Select(LoanProductCode);
				loan_product_code.selectByIndex(1);
				Thread.sleep(3000);
				SubmitForm.click();
				Thread.sleep(5000);
				New_Loan_Account=Error_message_master.getText();
				New_Loan_Account=New_Loan_Account.replace("Loan Account Master data submitted successfully! Account No:","");
				New_Loan_Account=New_Loan_Account.replace("x","");
				New_Loan_Account=New_Loan_Account.trim();
				System.out.println("Loan Account number: "+ New_Loan_Account);
				Thread.sleep(2000);
				CloseErrorMessage.click();
				Thread.sleep(2000);
				//util.handle_popop();
				Thread.sleep(2000);
				BasicInfo.click();
				Thread.sleep(3000);
				double loanamount = (double) row.getCell(1).getNumericCellValue();
				SanctionAmount.sendKeys(String.valueOf(loanamount));
				Loan_Tenure_Year.sendKeys(Keys.BACK_SPACE);
				int year = (int) row.getCell(3).getNumericCellValue();
				Loan_Tenure_Year.sendKeys(String.valueOf(year));
				Loan_Tenure_Month.sendKeys(Keys.BACK_SPACE);
				int month = (int) row.getCell(4).getNumericCellValue();
				Loan_Tenure_Month.sendKeys(String.valueOf(month));
				Loan_Tenure_Days.sendKeys(Keys.BACK_SPACE);
				int days = (int) row.getCell(5).getNumericCellValue();
				Loan_Tenure_Days.sendKeys(String.valueOf(days));
				SanctioningAuthority.sendKeys("Ajaya");
			//	Select saction_auth=new Select(SanctioningAuthority);
			//	saction_auth.selectByIndex(1);
				Select disburst_type=new Select(DisbursementType);
				disburst_type.selectByIndex(1);
				int moratoriumperiod = (int) row.getCell(5).getNumericCellValue();
				MoratoriumPeriod.sendKeys(String.valueOf(moratoriumperiod));
				Select moratoriumintrecoverymode=new Select(MoratoriumInterestRecovery);
				moratoriumintrecoverymode.selectByIndex(2);
				Select installmentfrequency=new Select(InstallmentFrequency);
				installmentfrequency.selectByIndex(1);
				Select businesstype=new Select(BusinessType);
				businesstype.selectByIndex(4);
				Select loanpurpose=new Select(LoanPurpose);
				loanpurpose.selectByIndex(10);
				int noofshare = (int) row.getCell(6).getNumericCellValue();
				NoOfShares.sendKeys(String.valueOf(noofshare));
				Sector.click();
				Thread.sleep(3000);	
				
//				int docsubdate = (int) row.getCell(7).getNumericCellValue();
//				DocumentSubmissionDate.sendKeys(String.valueOf(docsubdate));
//				int docexpdate = (int) row.getCell(8).getNumericCellValue();
//				DocumentExpiryDate.sendKeys(String.valueOf(docexpdate));
				Select industry_type=new Select(IndustryType);
				industry_type.selectByIndex(2);
				Select industry_sub_type=new Select(IndustrySubtype);
				industry_sub_type.selectByIndex(1);
				Select segment_type=new Select(SegmentType);
				segment_type.selectByIndex(4);
				Select segment_sub_type=new Select(SegmentSubtype);
				segment_sub_type.selectByIndex(1);
				Select loanee_type=new Select(LoaneeType);
				loanee_type.selectByIndex(1);
				Select loan_category=new Select(LoanCategory);
				loan_category.selectByIndex(5);
				int membernum = (int) row.getCell(9).getNumericCellValue();
				Membershipnumber.sendKeys(String.valueOf(membernum));
				Thread.sleep(3000);
				SubmitForm.click();
				Thread.sleep(3000);
				CloseErrorMessage.click();
				Thread.sleep(3000);
				//GuarantorMapping
				GuarantorMapping.click();
				Thread.sleep(3000);
				int guarntorcustno = (int) row.getCell(10).getNumericCellValue();
				GuarantorcustomerNo.sendKeys(String.valueOf(guarntorcustno));
				LoanAccountNo.click();
				Thread.sleep(3000);
				Remarks.sendKeys(row.getCell(11).getStringCellValue());
				AddGuarantor.click();
				Thread.sleep(2000);
				SubmitForm.click();
				Thread.sleep(3000);
				CloseErrorMessage.click();
				Thread.sleep(3000);
				NomineeDetails.click();
				Thread.sleep(3000);
				Nominee_Skip.click();
				CloseErrorMessage.click();
				Thread.sleep(3000);
				/*int moncustomer = (int) row.getCell(12).getNumericCellValue();
				NomcustomerID.sendKeys(String.valueOf(moncustomer));
				Search.click();
				Thread.sleep(3000);
				Select relation=new Select(Relation);
				relation.selectByIndex(7);
				for(int m=1;m<=6;m++)
				{
					NomineePercentage.sendKeys(Keys.BACK_SPACE);
				}
				int nompercentage = (int) row.getCell(13).getNumericCellValue();
				NomineePercentage.sendKeys(String.valueOf(nompercentage));
				Nominee_Add.click();
				Thread.sleep(3000);
				Nominee_Submit.click();
				Thread.sleep(3000);
				CloseErrorMessage.click();*/
				Thread.sleep(5000);
				SecurityDetails.click();
				Thread.sleep(3000);
				
//				SecurityUtil.LoanAgaintHome();// working properly "Add_Security" is needed.
				SecurityUtil.FDasLoanSecurity(); // 
//	     		util.GOLDLoanSecurity();
//				SecurityUtil.LoanAgaintLand(); //working properly	
//				SecurityUtil.GOLDLoanSecurity(); // working properly 
				Thread.sleep(3000);
//				Add_Security.click();
				Thread.sleep(3000);
				SubmitForm.click();
				Thread.sleep(2000);
				//CloseErrorMessage.click();
				Thread.sleep(3000);
				//NomineeDetails.click();
				//Thread.sleep(2000);
				Thread.sleep(5000);
				SendToVerify.click();
				Thread.sleep(3000);
				CloseErrorMessage.click();
				Thread.sleep(3000);
				emp_photo.click();
				Thread.sleep(2000);
				logout.click();
				Thread.sleep(3000);
			
			}
		}
	}
	public void authNewLoanAccount() throws Exception
	{
		Select loan_type=new Select(Loan_Type);
		loan_type.selectByIndex(1);
		Thread.sleep(2000);
		LoanAuthorize.click();
		WebElement Account_No=driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown=Account_No.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			//System.out.println(dropdown.get(i).getText());
			if(dropdown.get(i).getText().equals(New_Loan_Account))
			{
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		BasicInfo.click();
		Thread.sleep(3000);
		Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		GuarantorMapping.click();
		Thread.sleep(3000);
		Guarantor_View.click();
		Thread.sleep(2000);
		Guarantor_Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		SecurityDetails.click();
		Thread.sleep(3000);
		Select securitytype=new Select(SecurityType);
		securitytype.selectByIndex(1);
		Thread.sleep(3000);
		Security_View.click();
		Thread.sleep(2000);
		Security_Authorize.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		LoanAuthorize.click();
		CloseErrorMessage.click();
		Thread.sleep(3000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

    public void CashCreditAccount() throws Exception 
    {
    	Select loan_type=new Select(Loan_Type);//Term Loan
		loan_type.selectByIndex(2);
		Thread.sleep(3000);
		NewAccount.click();
		Thread.sleep(3000);
		CustomerNo.sendKeys(MyExcelfile.getData(1,1));
		CustName.click();
		Thread.sleep(3000);
		//util.handle_popop();
		Thread.sleep(2000);
		Select loan_product_code=new Select(LoanProductCode);
		loan_product_code.selectByIndex(1);
		Thread.sleep(3000);
		SubmitForm.click();
		Thread.sleep(5000);
		New_CC_Account=Error_message_master.getText();
		New_CC_Account=New_CC_Account.replace("Loan Account Master data submitted successfully! Account No:","");
		New_CC_Account=New_CC_Account.replace("x","");
		New_CC_Account=New_CC_Account.trim();
		System.out.println("New_CC_Account: "+ New_CC_Account);
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		BasicInfo.click();
		Thread.sleep(3000);
		SanctionAmount.sendKeys(MyExcelfile.getData(1,2));
		Loan_Tenure_Year.sendKeys(Keys.BACK_SPACE);
		Loan_Tenure_Year.sendKeys(MyExcelfile.getData(1,3));
		Loan_Tenure_Month.sendKeys(Keys.BACK_SPACE);
		Loan_Tenure_Month.sendKeys(MyExcelfile.getData(1,4));
		Loan_Tenure_Days.sendKeys(Keys.BACK_SPACE);
		Loan_Tenure_Days.sendKeys(MyExcelfile.getData(1,5));
		SanctioningAuthority.sendKeys("Ajay");
	//	Select saction_auth=new Select(SanctioningAuthority);
	//	saction_auth.selectByIndex(1);
		Select businesstype=new Select(BusinessType);
		businesstype.selectByIndex(4);
		Select loanpurpose=new Select(LoanPurpose);
		//loanpurpose.selectByVisibleText("OTHER PURPOSE");
		loanpurpose.selectByIndex(1);
		NoOfShares.sendKeys(MyExcelfile.getData(1,6));
		Sector.click();
		Thread.sleep(3000);	
		Select industry_type=new Select(IndustryType);
		industry_type.selectByIndex(2);
		Select industry_sub_type=new Select(IndustrySubtype);
		industry_sub_type.selectByIndex(1);
		Select segment_type=new Select(SegmentType);
		segment_type.selectByIndex(4);
		Select segment_sub_type=new Select(SegmentSubtype);
		segment_sub_type.selectByIndex(1);
		Select loanee_type=new Select(LoaneeType);
		loanee_type.selectByIndex(1);
		Select loan_category=new Select(LoanCategory);
		loan_category.selectByIndex(5);
		Membershipnumber.sendKeys(MyExcelfile.getData(1,7));
		Thread.sleep(3000);
		GracePeriod.sendKeys(MyExcelfile.getData(1,8));
		SubmitForm.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		//GuarantorMapping
		GuarantorMapping.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='id_skip_3']")).click();
//		GuarantorcustomerNo.sendKeys(MyExcelfile.getData(1,9));
//		LoanAccountNo.click();
//		Thread.sleep(3000);
//		String Remark= MyExcelfile.getData(1,10);
//		Remarks.sendKeys(Remark);
//		AddGuarantor.click();
//		Thread.sleep(2000);
//		SubmitForm.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		NomineeDetails.click();
		Thread.sleep(3000);
		Nominee_Skip.click();
		CloseErrorMessage.click();
		Thread.sleep(3000);
		SendToVerify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
    }
   
    public void authCashCreditAccount() throws Exception 
    {
    	Select loan_type=new Select(Loan_Type);
		loan_type.selectByIndex(2);
		Thread.sleep(2000);
		LoanAuthorize.click();
		WebElement Account_No=driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown=Account_No.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			//System.out.println(dropdown.get(i).getText());
			if(dropdown.get(i).getText().equals(New_CC_Account))
			{
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		BasicInfo.click();
		Thread.sleep(3000);
		Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
//		GuarantorMapping.click();
//		Thread.sleep(3000);
//		Guarantor_View.click();
//		Thread.sleep(2000);
//		Guarantor_Verify.click();
//		Thread.sleep(3000);
//		CloseErrorMessage.click();
//		Thread.sleep(3000);
		LoanAuthorize.click();
		CloseErrorMessage.click();
		Thread.sleep(3000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
    }

    public void AddCCLaonSerurity() throws Exception {
    	
    	Thread.sleep(3000);
    	Loan_and_Advances.click();
    	Thread.sleep(3000);
    	Loan_account_maintenance.click();
    	Thread.sleep(3000);
    	Select loan_type=new Select(Loan_Type);
    	//loan_type.selectByVisibleText("Cash Credit / Over Draft");
    	Thread.sleep(3000);
		loan_type.selectByIndex(2);
		NewAccount.click();
		Thread.sleep(4000);
		WebElement Account_No=driver.findElement(By.xpath("//input[@id='id_txtAccountNumber']"));
		Thread.sleep(4000);
		Account_No.sendKeys(New_CC_Account);
//		List<WebElement> dropdown=Account_No.findElements(By.tagName("option"));
//		for(int i=0;i<dropdown.size();i++)
//		{
//			//System.out.println(dropdown.get(i).getText());
//			if(dropdown.get(i).getText().equals(New_CC_Account))
//			{
//				dropdown.get(i).click();
//				break;
//			}
//		}
		//SecurityUtil.GOLDLoanSecurity(); // working properly 
		
		Search_Button.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='securitytype']")).click();
		Thread.sleep(3000);
		SecurityUtil.LoanAgaintHome();
		Thread.sleep(3000);
		Add_Security.click();
		Thread.sleep(3000);
		SubmitForm.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
    }
    public void authAddCCLaonSerurity() throws Exception 
    {
    	Thread.sleep(3000);
    	Loan_and_Advances.click();
    	Thread.sleep(3000);
    	Loan_account_maintenance.click();
    	Thread.sleep(3000);
    	
    	Select loan_type=new Select(Loan_Type);
		loan_type.selectByIndex(2);
		Thread.sleep(2000);
		LoanAuthorize.click();
		WebElement Account_No=driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown=Account_No.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			//System.out.println(dropdown.get(i).getText());
			if(dropdown.get(i).getText().equals(New_CC_Account))
			{
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		Select LoanSecurityType = new Select(driver.findElement(By.xpath("//select[@id='id_securitytype']")));
		LoanSecurityType.selectByIndex(1);
		Thread.sleep(4000);
		View_CC_AC_Security.click(); //need to chk view button xpath
		Thread.sleep(3000);
		Authorize_CC_AC_Security.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		
    }
    
}

