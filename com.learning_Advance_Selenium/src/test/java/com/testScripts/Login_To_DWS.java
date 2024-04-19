package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login_To_DWS {

	@Test
	
	public void titleOfDWS()
	{
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedTitle = "Demo Web Shop";
        String actualTitle = driver.getTitle();
        
        if (actualTitle.equals(expectedTitle)) {
            
        	Reporter.log("Title is validated");
            
        } else {
        	Reporter.log("invalid");
            
        }
        
		
		
	}
	
}
