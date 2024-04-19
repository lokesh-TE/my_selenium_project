package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_Configuration_Annotation {

	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Executing Before Suite", true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("Executing After Suite", true);
		
	}
	@BeforeTest
	public void beforeTest()
	{
		
		Reporter.log("Executing Before Test", true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("Executing After Suite",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		
		Reporter.log("Executing Before Class",true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("Executing After Class",true);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Executing Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("Executing After Method");
	}
	@Test
	public void test1()
	{
		Reporter.log("Executing Test1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Executing Test2",true);
	}
}
