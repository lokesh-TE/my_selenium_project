package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Invocation_Count_Attribute {

	@Test (invocationCount = 5)
	 public void loginTest() throws InterruptedException
	 {
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("lokeshchhokker191@gmail.com",Keys.TAB,"Computer@123",Keys.ENTER);
			Thread.sleep(2000);
			driver.quit();
			
	 }
}
