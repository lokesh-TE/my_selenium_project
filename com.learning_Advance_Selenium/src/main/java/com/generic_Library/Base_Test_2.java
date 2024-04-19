package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.object_Repository.Home_Page;
import com.object_Repository.Login_Page;
import com.object_Repository.Welcome_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base_Test_2 {
	public static WebDriver sDriver;
	public WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void reportConfiguration()
	{
		report = new ExtentReports("./src/test/resources/reports/" + Java_Utility.getName() + ".html");
		
	}
	
	@BeforeClass(alwaysRun = true)
	public void  launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("browser is launched succesfully......");
		
		sDriver = driver;
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToDWS() throws Throwable
	{
		String USERNAME = File_Utility.getPropertyValue("username");
		String PASSWORD = File_Utility.getPropertyValue("password");
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getLoginLink().click();
		Login_Page lp = new Login_Page(driver);
		lp.getEmailTextField().sendKeys(USERNAME);
		lp.getPasswordTextField().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		Reporter.log("Logged in Successfully to Demo Web Shop...");
		
		
	}
	@AfterMethod(alwaysRun = true)
	public void logoutFromDWS()
	{
		Home_Page hp = new Home_Page(driver);
		hp.getLogOutButton().click();
		
		Reporter.log("logged out successfully....");
		
		
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		
		driver.quit();
		Reporter.log("Browser closed successfully");
	}  
	@AfterSuite
	public void flushReport()
	{
		report.flush();
	}
}
