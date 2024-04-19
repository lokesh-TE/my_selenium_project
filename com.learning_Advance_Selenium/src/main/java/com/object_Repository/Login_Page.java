package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "Email")
	private WebElement emailTextFild;
	
	public WebElement getEmailTextField()
	{
		return emailTextFild;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	@FindBy(id="password")
	private WebElement passwordtextField;
	
	public WebElement getPasswordTextField()
	{
		return passwordtextField;
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	 
}
