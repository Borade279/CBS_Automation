package com.cbs.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.base.TestBase;
import com.cbs.util.JDBCConnection;
import com.cbs.util.TestUtil;

public class CASACreationPage extends TestBase {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Row row;
	String location = "C:\\Users\\AkashBorade\\Desktop\\Excel Autom\\CBS_Automation.xlsx";
	public static String Current_Account_No;
	public static String Migrated_Current_Account_No;
	public static String Saving_Account_No;
	public static String Migrated_Saving_Account_No;
	TestUtil util = new TestUtil();

	@FindBy(xpath = "//select[@id='id_casa_type']")
	WebElement Casa_Type;

	// ***-------current Account------***

	@FindBy(xpath = "//button[@id='btnNew']")
	WebElement New_Account;

	@FindBy(xpath = "//input[@id='id_txtCustomernumber']")
	WebElement Customernumber;

	@FindBy(xpath = "//span[@id='id_search']")
	WebElement Search;

	@FindBy(xpath = "//select[@id='id_ProductCode']")
	WebElement Product_Code;

	@FindBy(xpath = "//select[@id='id_AccountType']")
	WebElement Account_Type;

	@FindBy(xpath = "//select[@id='id_OperatingMode']")
	WebElement Operating_Mode;

	@FindBy(xpath = "//select[@id='id_OperatingInstructionInd']")
	WebElement Operating_Instruction;

	// @FindBy (xpath = "//label[contains(text(),'Operating Mode')]")
	// WebElement Operating_Mode;

	@FindBy(xpath = "//select[@id='id_nroFlag']")
	WebElement NRO_Flag;

	@FindBy(xpath = "//button[@id='id_basic_submit']")
	WebElement Basic_Submit;

	@FindBy(xpath = "//div[@id='error_message_master']")
	WebElement Error_message_master;

	@FindBy(xpath = "//a[@id='id_closeErrorMessage']")
	WebElement CloseErrorMessage;

	@FindBy(xpath = "//span[contains(text(),'Signatories')]")
	WebElement Signatories;

	@FindBy(xpath = "//span[contains(text(),'Joint Holder')]")
	WebElement Joint_Holder;

	@FindBy(xpath = "//button[@id='id_skip_2']")
	WebElement Joint_skip;

	@FindBy(xpath = "//span[@class='input-group-addon']")
	WebElement SearchRelatedPer;

	@FindBy(xpath = "//select[@id='id_GuardianRelationType']")
	WebElement Designation;

	@FindBy(xpath = "//button[@id='id_joint_add']")
	WebElement JointAdd;
	
	@FindBy(xpath="//li[@id='id_joint_tab']")
	WebElement Joint_Details;

	@FindBy(xpath = "//button[@id='id_joint_submit']")
	WebElement JointSubmit;

	@FindBy(xpath = "//span[contains(text(),'Nominee Details')]")
	WebElement Nominee_Details;

	@FindBy(xpath = "//select[@id='id_NomineeRelationType']")
	WebElement Relation;

	@FindBy(xpath = "//input[@id='id_NomineePercentage']")
	WebElement Percentage;

	@FindBy(xpath = "//button[@id='id_nominee_add']")
	WebElement NomineeAdd;

	@FindBy(xpath = "//button[@id='id_nominee_submit']")
	WebElement NomineeSubmit;
	
	@FindBy(xpath="//li[@id='id_guardian_tab']")
	WebElement Guardian_details;

	@FindBy(xpath = "//span[contains(text(),'Advance Operating Instruction')]")
	WebElement Advn_Opert_Inst;

	@FindBy(xpath = "//textarea[@id='instruction']")
	WebElement Opert_Instruction;

	@FindBy(xpath = "//button[@id='btnSubmitForm']")
	WebElement SubmitForm;

	@FindBy(xpath = "//button[@id='id_master_sendtoverify']")
	WebElement Sendtoverify;

	@FindBy(xpath = "//img[@id='id_emp_photo']")
	WebElement emp_photo;

	@FindBy(xpath = "//a[@id='id_logout']")
	WebElement logout;

	@FindBy(xpath = "//button[@id='btnAuthorize']")
	WebElement btnAuthorize;

	@FindBy(xpath = "//button[@id='id_basic_verify']")
	WebElement Basic_Verify;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[5]/button[contains(text(),'View')]")
	WebElement Sign_View;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[6]/button[contains(text(),'Verify')]")
	WebElement Sign_Verify;

	@FindBy(xpath = "//button[@class='btn btn-primary text-uppercase'][1]")
	WebElement Joint_View;
	
	@FindBy(xpath = "//button[@class='btn btn-new btn-primary text-uppercase']")
	WebElement Nom_View;
	
	@FindBy(xpath = "//button[@id='btnVerify_0']")
	WebElement Joint_Verify;
	
	@FindBy(xpath = "//button[@id='btnVerify_0']")
	WebElement Nom_Verify;

	@FindBy(xpath = "//button[@class='btn btn-new btn-primary']")
	WebElement adv_View;

	@FindBy(xpath = "//button[@id='id_verify']")
	WebElement Verify;

	@FindBy(xpath = "//button[@id='id_master_authorize']")
	WebElement Authorize;

	@FindBy(xpath = "//button[@id='btnEdit']")
	WebElement Edit;

	@FindBy(xpath = "//input[@id='id_masterAccountNo']")
	WebElement Account_no;

	@FindBy(xpath = "//button[@id='id_master_search']")
	WebElement Master_search;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[5]/button[contains(text(),'Edit')]")
	WebElement Sign_edit;

	@FindBy(xpath = "//button[@id='btnView']")
	WebElement View;

	// ***-------Saving Account------***

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[5]/button[contains(text(),'Edit')]")
	WebElement Nom_Edit;

	@FindBy(xpath = "//input[@id='id_FirstName']")
	WebElement nom_name;

	Actions action = new Actions(driver);

	public CASACreationPage() {
		PageFactory.initElements(driver, this);
	}

	public void currentAccountCreation() throws Exception {
		Thread.sleep(3000);
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByIndex(1);
		Thread.sleep(3000);
		// casa_type.selectByValue("Current");
		New_Account.click();
		Thread.sleep(3000);
		fis = new FileInputStream(location);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Current Account");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		for (int i = 1; i <= rowcount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = (XSSFCell) row.getCell(j);
				Long cust_id = (long) row.getCell(0).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id));
				// Customernumber.sendKeys("29145");
				Search.click();
				Thread.sleep(3000);
				Select product_Code = new Select(Product_Code);
				product_Code.selectByIndex(1);
				Select account_Type = new Select(Account_Type);
				account_Type.selectByIndex(1);
				Select operating_Instruction = new Select(Operating_Instruction);
				operating_Instruction.selectByIndex(2);
				Select operating_Mode = new Select(Operating_Mode);
				operating_Mode.selectByIndex(2);
				// Select nro_flag=new Select(NRO_Flag);
				// nro_flag.selectByIndex(1);
				// action.sendKeys(Keys.PAGE_DOWN).click();
				// JavascriptExecutor js = (JavascriptExecutor) driver;
				// js.executeScript("window.scrollBy(100,100)", "");
				Basic_Submit.click();
				Thread.sleep(3000);
				Current_Account_No = Error_message_master.getText();
				Current_Account_No = Current_Account_No.replace("Success", " ");
				Current_Account_No = Current_Account_No
						.replace("Basic detail inserted successfully ,Customer Account number :", " ");
				Current_Account_No = Current_Account_No.replace("x", " ");
				Current_Account_No = Current_Account_No.trim();
				System.out.println("Customer Account number: " + Current_Account_No);
				Thread.sleep(2000);
				CloseErrorMessage.click();
				Thread.sleep(2000);
				Signatories.click();
				Thread.sleep(3000);
				Long cust_id1 = (long) row.getCell(1).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id1));
				Search.click();
				Select designation = new Select(Designation);
				designation.selectByIndex(1);
				// designation.selectByVisibleText("Secretary");
				JointAdd.click();
				Thread.sleep(2000);
				JointSubmit.click();
				Thread.sleep(2000);
				Nominee_Details.click();
				Thread.sleep(3000);
				Long cust_id2 = (long) row.getCell(2).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id2));
				Search.click();
				Select relation = new Select(Relation);
				relation.selectByIndex(3);
				// relation.selectByVisibleText("Mother");
				int percentage = (int) row.getCell(3).getNumericCellValue();
				Percentage.sendKeys(String.valueOf(percentage));
				// Percentage.sendKeys(percentage);
				NomineeAdd.click();
				Thread.sleep(2000);
				NomineeSubmit.click();
				Thread.sleep(5000);
				Advn_Opert_Inst.click();
				Thread.sleep(3000);
				Opert_Instruction.sendKeys(row.getCell(4).getStringCellValue());
				SubmitForm.click();
				Thread.sleep(2000);
				CloseErrorMessage.click();
				Thread.sleep(3000);
				Sendtoverify.click();
				Thread.sleep(2000);
				CloseErrorMessage.click();
				Thread.sleep(2000);
				emp_photo.click();
				Thread.sleep(2000);
				logout.click();
				Thread.sleep(5000);
			}
		}
	}

	/*
	 * Customernumber.sendKeys(customer_no); Search.click(); Thread.sleep(3000);
	 * util.handle_popop(); Select product_Code=new Select(Product_Code);
	 * product_Code.selectByIndex(1); Select account_Type=new
	 * Select(Operating_Mode); account_Type.selectByIndex(2);
	 * //product_Code.selectByVisibleText("1001-Current Account"); //Select
	 * account_Type=new Select(Account_Type); //account_Type.selectByIndex(1);
	 * //account_Type.selectByVisibleText("Regular"); Select
	 * operating_Instruction=new Select(Operating_Instruction);
	 * operating_Instruction.selectByIndex(8);
	 * //operating_Instruction.selectByVisibleText("Self"); Basic_Submit.click();
	 * Thread.sleep(5000); util.handle_popop();
	 * Current_Account_No=Error_message_master.getText();
	 * Current_Account_No=Current_Account_No.
	 * replace("Basic detail inserted successfully ,Customer Account number :","");
	 * Current_Account_No=Current_Account_No.replace("x","");
	 * Current_Account_No=Current_Account_No.trim();
	 * System.out.println(Current_Account_No); Thread.sleep(2000);
	 * CloseErrorMessage.click(); Thread.sleep(2000); Signatories.click();
	 * Thread.sleep(3000); Customernumber.sendKeys(customer_Id1); Search.click();
	 * Thread.sleep(3000); Select designation=new Select(Designation);
	 * designation.selectByIndex(1); //designation.selectByVisibleText("Secretary");
	 * JointAdd.click(); Thread.sleep(2000); JointSubmit.click();
	 * Thread.sleep(2000); Nominee_Details.click(); Thread.sleep(3000);
	 * Customernumber.sendKeys(customer_Id2); Search.click(); Thread.sleep(3000);
	 * Select relation=new Select(Relation); relation.selectByIndex(3);
	 * //relation.selectByVisibleText("Mother"); Percentage.sendKeys(percentage);
	 * NomineeAdd.click(); Thread.sleep(2000); NomineeSubmit.click();
	 * Thread.sleep(3000); Advn_Opert_Inst.click(); Thread.sleep(3000);
	 * Opert_Instruction.sendKeys(opert_inst); SubmitForm.click();
	 * Thread.sleep(2000); CloseErrorMessage.click(); Thread.sleep(3000);
	 */

	public void authorizedCurrentAccount() throws Exception {
		Thread.sleep(3000);
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByIndex(1);
		Thread.sleep(3000);
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText());

			if (dropdown.get(i).getText().equals(Current_Account_No))

			{
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		// util.handle_popop();
		Basic_Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(5000);
		// util.handle_popop();
		Signatories.click();
		Thread.sleep(3000);
		Sign_View.click();
		Thread.sleep(2000);
		Sign_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Nominee_Details.click();
		Thread.sleep(3000);
		Nom_View.click();
		Thread.sleep(2000);
		Nom_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Advn_Opert_Inst.click();
		Thread.sleep(3000);
		adv_View.click();
		Thread.sleep(2000);
		Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void editCurrentAccount(String cust_id3) throws Exception {
		Edit.click();
		Thread.sleep(2000);
		Account_no.sendKeys(Current_Account_No);
		Master_search.click();
		Thread.sleep(4000);
		util.handle_popop();
		Signatories.click();
		Thread.sleep(2000);
		Sign_edit.click();
		Thread.sleep(1000);
		for (int i = 0; i <= 10; i++) {
			Customernumber.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Customernumber.sendKeys(cust_id3);
		Search.click();
		Thread.sleep(2000);
		Select designation = new Select(Designation);
		designation.selectByIndex(5);
		// designation.selectByVisibleText("Secretary");
		JointSubmit.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Sendtoverify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}

	public void authCurrentAccount() throws Exception {
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			// System.out.println(dropdown.get(i).getText());
			if (dropdown.get(i).getText().equals(Current_Account_No)) {
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		// util.handle_popop();
		Signatories.click();
		Thread.sleep(3000);
		Sign_View.click();
		Thread.sleep(2000);
		Sign_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void viewCurrentAccountDetails() throws Exception {
		View.click();
		Thread.sleep(2000);
		Account_no.sendKeys(Current_Account_No);
		Thread.sleep(2000);
		Master_search.click();
		Thread.sleep(4000);
		// util.handle_popop();
		Signatories.click();
		Thread.sleep(2000);
		Sign_View.click();
		Thread.sleep(2000);
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_View.click();
		Thread.sleep(2000);
		Advn_Opert_Inst.click();
		Thread.sleep(2000);
		adv_View.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void editMigratedCurrentAccount(String cust_id4) throws Exception {
		Edit.click();
		Thread.sleep(3000);
		Migrated_Current_Account_No = JDBCConnection.getMigratedCurrentAccount();
		// System.out.println(Migrated_Current_Account_No);
		Account_no.sendKeys(Migrated_Current_Account_No);
		Master_search.click();
		Thread.sleep(3000);
		util.handle_popop();
		Select operating_Mode = new Select(Operating_Mode);
		operating_Mode.selectByVisibleText("Joint");
		Select operating_instr = new Select(Operating_Instruction);
		operating_instr.selectByVisibleText("All Jointly");
		Basic_Submit.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		util.handle_popop();
		Thread.sleep(1000);
		Signatories.click();
		Thread.sleep(2000);
		Sign_edit.click();
		Thread.sleep(2000);
		for (int i = 0; i <= 10; i++) {
			Customernumber.sendKeys(Keys.BACK_SPACE);
		}
		Customernumber.sendKeys(cust_id4);
		Select designation = new Select(Designation);
		designation.selectByVisibleText("Secretary");
		JointSubmit.click();
		Thread.sleep(2000);
		Migrated_Current_Account_No = Error_message_master.getText();
		Migrated_Current_Account_No = Migrated_Current_Account_No.replace("Successfully updated nominee details 0 for",
				"");
		Migrated_Current_Account_No = Migrated_Current_Account_No.replace("x", "");
		Migrated_Current_Account_No = Migrated_Current_Account_No.trim();
		System.out.println(Migrated_Current_Account_No);
		Thread.sleep(1000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Sendtoverify.click();
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void authMigratedCurrentAccount() throws Exception {
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			// System.out.println(dropdown.get(i).getText());
			if (dropdown.get(i).getText().equals(Migrated_Current_Account_No)) {
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		util.handle_popop();
		Thread.sleep(2000);
		Basic_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		util.handle_popop();
		Thread.sleep(2000);
		Signatories.click();
		Thread.sleep(3000);
		Sign_View.click();
		Thread.sleep(2000);
		Sign_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void savingAccountCreation() throws Exception {
		Thread.sleep(3000);
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByIndex(2);
		Thread.sleep(3000);
		New_Account.click();
		Thread.sleep(3000);
		fis = new FileInputStream(location);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Saving Account");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		for (int i = 1; i <= rowcount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = (XSSFCell) row.getCell(j);
				Long cust_id = (long) row.getCell(0).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id));
				Search.click();
				Thread.sleep(3000);
				// util.handle_popop();
				// Thread.sleep(2000);
				Select product_code = new Select(Product_Code);
				product_code.selectByIndex(1);
				Select account_type = new Select(Account_Type);
				account_type.selectByIndex(1);
				Select operating_instruction = new Select(Operating_Instruction);
				operating_instruction.selectByIndex(1);
				Thread.sleep(2000);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(4000);
				Basic_Submit.click();
				Thread.sleep(2000);
				Saving_Account_No = Error_message_master.getText();
				Saving_Account_No = Saving_Account_No.replace("Success", " ");
				Saving_Account_No = Saving_Account_No
						.replace("Basic detail inserted successfully ,Customer Account number :", "");
				Saving_Account_No = Saving_Account_No.replace("x", "");
				Saving_Account_No = Saving_Account_No.trim();
				System.out.println(Saving_Account_No);
				Thread.sleep(4000);
				// util.handle_popop();
				CloseErrorMessage.click();
				Thread.sleep(2000);
				Joint_Holder.click();
				Thread.sleep(2000);
				Long JointCustID = (long) row.getCell(1).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(JointCustID));
				SearchRelatedPer.click();
				System.out.println(JointCustID);
				Thread.sleep(3000);
				Select JointRelation = new Select(Designation);
				JointRelation.selectByIndex(6);
				Thread.sleep(3000);
				JointAdd.click();
				Thread.sleep(2000);
				JointSubmit.click();
				Thread.sleep(3000);
				// Thread.sleep(2000);
				// Joint_skip.click();
				// CloseErrorMessage.click();
				// Thread.sleep(2000);
				Nominee_Details.click();
				Thread.sleep(2000);
				Long cust_id1 = (long) row.getCell(2).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id1));
				Search.click();
				Thread.sleep(2000);
				Select relation = new Select(Relation);
				relation.selectByIndex(2);
				int percentage = (int) row.getCell(3).getNumericCellValue();
				Percentage.sendKeys(String.valueOf(percentage));
				NomineeAdd.click();
				Thread.sleep(4000);
				NomineeSubmit.click();
				Thread.sleep(4000);
				Sendtoverify.click();
				Thread.sleep(4000);
				CloseErrorMessage.click();
				Thread.sleep(4000);
				emp_photo.click();
				Thread.sleep(2000);
				logout.click();
				Thread.sleep(3000);
			}
		}

		/*
		 * Select casa_type=new Select(Casa_Type); casa_type.selectByIndex(2);
		 * //casa_type.selectByVisibleText("Saving"); Thread.sleep(2000);
		 * New_Account.click(); Thread.sleep(2000); Customernumber.sendKeys(cust_id5);
		 * Search.click(); Thread.sleep(3000); //util.handle_popop(); Select
		 * product_code=new Select(Product_Code); product_code.selectByIndex(1);
		 * //product_code.selectByVisibleText("2001-Saving Bank Account"); Select
		 * account_type=new Select(Account_Type); account_type.selectByIndex(1);
		 * //account_type.selectByVisibleText("Regular"); Select
		 * operating_instruction=new Select(Operating_Instruction);
		 * operating_instruction.selectByIndex(1);
		 * //operating_instruction.selectByVisibleText("Self"); Basic_Submit.click();
		 * Thread.sleep(2000); Saving_Account_No=Error_message_master.getText();
		 * Saving_Account_No=Saving_Account_No.
		 * replace("Basic detail inserted successfully ,Customer Account number :","");
		 * Saving_Account_No=Saving_Account_No.replace("x","");
		 * Saving_Account_No=Saving_Account_No.trim();
		 * System.out.println(Saving_Account_No); Thread.sleep(3000);
		 * //util.handle_popop(); CloseErrorMessage.click(); Thread.sleep(2000);
		 * Nominee_Details.click(); Thread.sleep(2000);
		 * Customernumber.sendKeys(cust_id6); Search.click(); Thread.sleep(2000); Select
		 * relation=new Select(Relation); relation.selectByIndex(2);
		 * //relation.selectByVisibleText("Father"); Percentage.sendKeys(percent);
		 * NomineeAdd.click(); Thread.sleep(2000); NomineeSubmit.click();
		 * Thread.sleep(2000); Sendtoverify.click(); CloseErrorMessage.click();
		 * Thread.sleep(2000); emp_photo.click(); Thread.sleep(2000); logout.click();
		 * Thread.sleep(3000);
		 */
	}
	public void savingAccountCreationForMinor() throws Exception {
		Thread.sleep(3000);
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByIndex(2);
		Thread.sleep(3000);
		New_Account.click();
		Thread.sleep(3000);
		fis = new FileInputStream(location);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Saving Account");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(2).getLastCellNum();
		for (int i = 2; i <= rowcount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = (XSSFCell) row.getCell(j);
				Long cust_id = (long) row.getCell(0).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id));
				Search.click();
				Thread.sleep(3000);
				// util.handle_popop();
				// Thread.sleep(2000);
				Select product_code = new Select(Product_Code);
				product_code.selectByIndex(1);
				Select account_type = new Select(Account_Type);
				account_type.selectByIndex(1);
				Select operating_instruction = new Select(Operating_Instruction);
				operating_instruction.selectByIndex(2);
				Thread.sleep(2000);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(4000);
				Basic_Submit.click();
				Thread.sleep(2000);
				Saving_Account_No = Error_message_master.getText();
				Saving_Account_No = Saving_Account_No.replace("Success", " ");
				Saving_Account_No = Saving_Account_No
						.replace("Basic detail inserted successfully ,Customer Account number :", "");
				Saving_Account_No = Saving_Account_No.replace("x", "");
				Saving_Account_No = Saving_Account_No.trim();
				System.out.println(Saving_Account_No);
				Thread.sleep(4000);
				// util.handle_popop();
				CloseErrorMessage.click();
				Thread.sleep(2000);
				Joint_Holder.click();
				Thread.sleep(2000);
				Long JointCustID = (long) row.getCell(1).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(JointCustID));
				SearchRelatedPer.click();
				//System.out.println(JointCustID);
				Thread.sleep(3000);
				Select JointRelation = new Select(Designation);
				JointRelation.selectByIndex(3);
				Thread.sleep(3000);
				JointAdd.click();
				Thread.sleep(2000);
				JointSubmit.click();
				Thread.sleep(3000);
				// Thread.sleep(2000);
				// Joint_skip.click();
				// CloseErrorMessage.click();
				// Thread.sleep(2000);
				Nominee_Details.click();
				Thread.sleep(2000);
				Long cust_id1 = (long) row.getCell(2).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id1));
				Search.click();
				Thread.sleep(2000);
				Select relation = new Select(Relation);
				relation.selectByIndex(3);
				int percentage = (int) row.getCell(3).getNumericCellValue();
				Percentage.sendKeys(String.valueOf(percentage));
				NomineeAdd.click();
				Thread.sleep(4000);
				NomineeSubmit.click();
				Thread.sleep(4000);
				Guardian_details.click();
				Long cust_id2 = (long) row.getCell(4).getNumericCellValue();
				Customernumber.sendKeys(String.valueOf(cust_id2));
				Customernumber.sendKeys("send key ");
				
				Sendtoverify.click();
				Thread.sleep(4000);
				CloseErrorMessage.click();
				Thread.sleep(4000);
				emp_photo.click();
				Thread.sleep(2000);
				logout.click();
				Thread.sleep(3000);
			}
		}
	}

	public void authSavingAccountCreation() throws Exception {

		Select casa_type = new Select(Casa_Type);
		// casa_type.selectByIndex(2);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText());
			if (dropdown.get(i).getText().equals(Saving_Account_No)) {
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		// util.handle_popop();
		Basic_Verify.click();
		Thread.sleep(3000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		// util.handle_popop();
		// Thread.sleep(2000);
		Joint_Details.click();
		Thread.sleep(2000);
		Joint_View.click();
		Thread.sleep(2000);
		Joint_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_View.click();
		Thread.sleep(2000);
		Nom_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void editSavingAccount(String percn) throws Exception {
		Select casa_type = new Select(Casa_Type);
		// casa_type.selectByIndex(2);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		Edit.click();
		Thread.sleep(3000);
		Account_no.sendKeys(Saving_Account_No);
		Master_search.click();
		Thread.sleep(3000);
		// util.handle_popop();
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_Edit.click();
		Thread.sleep(2000);
		Select relation = new Select(Relation);
		relation.selectByIndex(4);
		// relation.selectByVisibleText("Sister");
		for (int i = 1; i < 5; i++) {
			Percentage.sendKeys(Keys.BACK_SPACE);
		}
		Percentage.sendKeys(percn);
		nom_name.click();
		Thread.sleep(2000);
		NomineeSubmit.click();
		Thread.sleep(3000);
		Sendtoverify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void autheditedSavingAccount() throws Exception {
		Select casa_type = new Select(Casa_Type);
		// casa_type.selectByIndex(2);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			// System.out.println(dropdown.get(i).getText());
			if (dropdown.get(i).getText().equals(Saving_Account_No)) {
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_View.click();
		Thread.sleep(2000);
		Nom_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void viewSavingAccount() throws Exception {
		Select casa_type = new Select(Casa_Type);
		// casa_type.selectByIndex(2);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		View.click();
		Thread.sleep(2000);
		Account_no.sendKeys(Saving_Account_No);
		Master_search.click();
		Thread.sleep(3000);
		// util.handle_popop();
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_View.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void editMigratedSavingAccount() throws Exception {
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		Edit.click();
		Thread.sleep(3000);
		Migrated_Saving_Account_No = JDBCConnection.getMigratedSavingAccount();
		System.out.println("Migrated_Saving_Account_No:" + Migrated_Saving_Account_No);
		Account_no.sendKeys(Migrated_Saving_Account_No);
		Master_search.click();
		Thread.sleep(3000);
		util.handle_popop();
		Select operating_Mode = new Select(Operating_Mode);
		operating_Mode.selectByVisibleText("Single");
		Select operating_Instruction = new Select(Operating_Instruction);
		operating_Instruction.selectByVisibleText("Self");
		Basic_Submit.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		util.handle_popop();
		Sendtoverify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void authMigratedSavingAccount() throws Exception {
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		btnAuthorize.click();
		Thread.sleep(3000);
		WebElement Account_No = driver.findElement(By.xpath("//select[@id='id_optMasterAccountNumber']"));
		List<WebElement> dropdown = Account_No.findElements(By.tagName("option"));
		for (int i = 0; i < dropdown.size(); i++) {
			// System.out.println(dropdown.get(i).getText());
			if (dropdown.get(i).getText().equals(Migrated_Saving_Account_No)) {
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		util.handle_popop();
		Basic_Verify.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(3000);
		util.handle_popop();
		Authorize.click();
		Thread.sleep(2000);
		CloseErrorMessage.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}

	public void viewMigratedSavingAccount() throws Exception {
		Select casa_type = new Select(Casa_Type);
		casa_type.selectByVisibleText("Saving");
		Thread.sleep(2000);
		View.click();
		Thread.sleep(2000);
		Account_no.sendKeys(Migrated_Saving_Account_No);
		Thread.sleep(1000);
		Master_search.click();
		Thread.sleep(3000);
		util.handle_popop();
		Nominee_Details.click();
		Thread.sleep(2000);
		Nom_View.click();
		Thread.sleep(2000);
		emp_photo.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}
}
