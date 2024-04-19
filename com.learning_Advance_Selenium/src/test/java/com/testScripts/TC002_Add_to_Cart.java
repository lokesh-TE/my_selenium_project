package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC002_Add_to_Cart extends Base_Test {

	@Test(groups="regrassionTesting")
	public void Add_To_Cart() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		WebDriver_Utility.takesScreenShotOfWebpage(driver, "addtocart");
		Thread.sleep(2000);
		
	}
}
