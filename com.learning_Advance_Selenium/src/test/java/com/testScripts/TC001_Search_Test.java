package com.testScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC001_Search_Test extends Base_Test{
	@Test(groups= "smokeTesting")
	public void searchTest() throws InterruptedException, IOException
	{
		driver.findElement(By.name("q")).sendKeys("books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Search']")));
		Thread.sleep(1000);
		WebDriver_Utility.takesScreenShotOfWebpage(driver, "searchScreenshot");
	}

}
