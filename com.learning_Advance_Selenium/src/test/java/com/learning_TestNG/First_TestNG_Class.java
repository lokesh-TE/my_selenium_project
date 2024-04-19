package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	
	@Test
	public void loginTC()
	{
		Reporter.log("This is loginTC");
	}
	
	@Test
	public void registerTC()
	{
		Reporter.log("This is registerTC");
		
	}
	@Test
	public void searchTC()
	{
		
		Reporter.log("This is searchTC");
	}

}
