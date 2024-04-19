package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_DataProvider {

	@Test (dataProvider = "loginData")
	 public void loginTest(String username,String password) throws InterruptedException
	 {
		@DataProvider (name = "loginData.")
		public Object [] [] loginData()
		{
			Object [] [] data = new Object [3] [2] ;
			data [0] [0] = "lokeshchhoker123@gmail.com";
			data [0] [1] = "Computer@123";
			data [1] [0] = "lokeshchhoker121@gmail.com";
			data [0] [0] = "Computer@123";
			data [0] [0] = "lokeshchhoker191@gmail.com";
			data [0] [0] = "Computer@123";
			
			return data;
			
			}
		
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("username",Keys.TAB,"password",Keys.ENTER);
			Thread.sleep(2000);
			driver.quit();
}

	
}
