package com.cbs.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cbs.util.TestUtil;
import com.cbs.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public static WebDriver driver;
	public static Properties properties;
	//public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListerner;
	
	public TestBase()
	{
		try
		{
			properties=new Properties();
			FileInputStream fileinputstream=new FileInputStream("C:\\Users\\AkashBorade\\eclipse-workspace\\Master4.0\\src\\main\\java\\com\\cbs\\config\\config.properties");
			properties.load(fileinputstream);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws Exception
	{
		String browserName=properties.getProperty("browser");
		if(browserName.trim().equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Master_4.0\\chromedriver_win32 (1)\\chromedriver.exe");
			//// System.setProperty("webdriver.chrome.driver","C:\\Users\\AkashBorade\\Desktop\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions handlingSSL = new ChromeOptions(); 
			handlingSSL.addArguments("--remote-allow-origins=*");
			handlingSSL.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(handlingSSL);
		}
		else if(browserName.equals("firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.chrome.driver","C:\\Master_4.0\\chromedriver_win32 (1)\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver","D:\\Siddhesh Training Document\\Automation_For_CBS\\jar_files\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		/*e_driver=new EventFiringWebDriver(driver);
		eventListerner=new WebEventListener();
		e_driver.register(eventListerner);
		driver=e_driver;*/
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		Robot rb=new Robot();
		for(int i=0;i<4;i++)
		{
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		Thread.sleep(3000);
	}
}
