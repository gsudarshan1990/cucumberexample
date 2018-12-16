package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	
	public LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginbutton;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getLoginButton()
	{
		return loginbutton;
	}
	
	public String getTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
}
