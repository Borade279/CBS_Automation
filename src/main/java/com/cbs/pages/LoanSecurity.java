//package com.cbs.pages;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//public class LoanSecurity {
//
//	
//		public static WebDriver driver;
//		 public static void main(String[] args) throws InterruptedException, AWTException{
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\AkashBorade\\Desktop\\chromedriver_win32\\chromedriver.exe");
//		 ChromeOptions handlingSSL = new ChromeOptions();
//        handlingSSL.addArguments("--remote-allow-origins=*");
//		handlingSSL.setAcceptInsecureCerts(true);
// driver = new ChromeDriver(handlingSSL);
//		 driver.get("https://nesfbuat.turingcbs.com:7943/");
//		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 driver.manage().window().maximize();
//		 driver.manage().deleteAllCookies();
//		 Robot rb = new Robot();
//		for (int i=0;i<3;i++)
//		{
//	 rb.keyPress(KeyEvent.VK_CONTROL);
//		 rb.keyPress(KeyEvent.VK_SUBTRACT);
//		 rb.keyRelease(KeyEvent.VK_CONTROL);
//		 rb.keyRelease(KeyEvent.VK_SUBTRACT);
//		}
//           Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("m-m");
//		 driver.findElement(By.xpath("//button[@id='id_search_employee']")).click();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Test@123");
//		Thread.sleep(2000);
//		 Select branch=new Select(driver.findElement(By.id("id_Branch")));
//		branch.selectByIndex(1);
//		 Thread.sleep(2000);
// 
//		driver.findElement(By.xpath("//*[text()='Loans and Advances']")).click();
//		 
//		 driver.findElement(By.xpath("//a[@href='/loans/loan-security-master-landing']")).click();
//		driver.findElement(By.xpath("//select[@class='form-control']")).click();
//		driver.findElement(By.xpath("//button[@id='btnNew']")).click();
//	driver.findElement(By.xpath("//textarea[@id='id_housedesc']")).sendKeys("1bhk");
//		 driver.findElement(By.xpath("//input[@id='id_agreementvalue']")).sendKeys("1500");
//		driver.findElement(By.xpath("//input[@id='id_stampduty']")).sendKeys("1000");
//		 driver.findElement(By.xpath("//input[@id='id_registrationcharges']")).sendKeys("500");
//		 driver.findElement(By.xpath("//input[@id='id_marketvalueonregistration']")).sendKeys("500000");
//		driver.findElement(By.xpath("//input[@id='id_marketvalueonvalue']")).sendKeys("600000");
//		driver.findElement(By.xpath("//input[@id='id_margin']")).sendKeys("2");
//	driver.findElement(By.xpath("//button[@id='btnSubmitForm']")).click();
//		}
//		}
//
