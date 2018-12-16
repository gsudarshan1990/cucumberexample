package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelObjects {

	public SelectHotelObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobuttonselection;
	
	public WebElement getRadioButton()
	{
		return radiobuttonselection;
	}
	
	public WebElement getContinue()
	{
		return continuebutton;
	}
}
