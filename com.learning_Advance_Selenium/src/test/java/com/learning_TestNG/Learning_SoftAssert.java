package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_SoftAssert {

	@Test
	public void loginTest() throws InterruptedException
	{
		SoftAssert ast = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demowebshop.tricentis.com/");
		 ast .assertEquals(driver.getTitle(), "Demo Web");
		 driver.findElement(By.linkText("Log in")).click();
		 
		 Assert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/login","validating url of login");
		 driver.findElement(By.id("Email")).sendKeys("lokeshchhoker123@gmail.com",Keys.TAB,"Computer@123",Keys.ENTER);
		 
		 ast.assertEquals(driver.getTitle(),"Demo Web Shop","Validating Home Page Title");
		 Thread.sleep(2000);
		 driver.quit();
		 ast.assertAll();
	}
}
