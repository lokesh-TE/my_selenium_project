package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC003_Remove_From_Cart extends Base_Test {

	@Test(groups="regressionTesting")
	public void removeFromCart() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='product-name']/ancestor::tr[@class='cart-item-row']/descendant::input[1]")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(1000);
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		WebDriver_Utility.takesScreenShotOfWebpage(driver, "RemoveFromCart");
		Thread.sleep(2000);
		
	}
}
