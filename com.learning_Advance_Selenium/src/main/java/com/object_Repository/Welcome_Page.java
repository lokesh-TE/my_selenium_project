package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

	public Welcome_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "small-searchterms")
	private WebElement searchTextField;
	@FindBy(xpath="//input[@value='search']")
	private WebElement searchButton;
	@FindBy(linkText="Log in")
	private WebElement LoginLink;
	
	public WebElement getSearchTextField()
	{
		return searchTextField;
	}
	public WebElement getSearchButton()
	{
		return LoginLink;
	}
	public WebElement getLoginLink()
	{
		return LoginLink;
	}
	public WebElement getShoppingCartLink()
	{
		return shoppingCartLink;
	}
	
	private WebElement shoppingCartLink;
	@FindBy(xpath = "//h1[text()='search']")
	
	private WebElement searchTitleText;
	public WebElement getSearchTitleText()
	{
		return searchTitleText;
	}
	
	
}
