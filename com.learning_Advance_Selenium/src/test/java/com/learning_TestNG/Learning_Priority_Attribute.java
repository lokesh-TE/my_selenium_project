package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Priority_Attribute {

	 @Test (priority = 1)
	 public void registerTest() throws InterruptedException
	 {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("lokesh",Keys.TAB,"kumar",Keys.TAB,"lokeshchhoker191@gmail.com",Keys.TAB,"Computer@123",Keys.TAB,"Computer@123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit(); 
	 }
	 @Test (priority = 2)
	 public void loginTest() throws InterruptedException
	 {
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("lokeshchhokker191@gmail.com",Keys.TAB,"Computer@123",Keys.ENTER);
			driver.quit();
			
	 }
	 @Test (priority = 3)
	 public void searchTest()
	 {
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.id("small-searchterms")).sendKeys("mobile",Keys.ENTER);
			driver.quit();
		 
	 }
}
