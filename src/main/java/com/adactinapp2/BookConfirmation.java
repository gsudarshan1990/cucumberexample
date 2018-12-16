package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmation {

	public BookConfirmation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement order_no;
	
	public WebElement getOrderNo()
	{
		return order_no;
	}
}
