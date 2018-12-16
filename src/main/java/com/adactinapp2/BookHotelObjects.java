package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelObjects {

	
	public BookHotelObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditcardno;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement creditcardexpirymonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement creditcardexpiryyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvtype;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknobutton;
	
	public WebElement getFirstName()
	{
		return firstname;
	}
	
	public WebElement getLastName()
	{
		return lastname;
	}
	
	public WebElement getAddress()
	{
		return address;
	}
	
	public WebElement getCreditCardNo()
	{
		return creditcardno;
	}
	
	public WebElement getCreditCardType()
	{
		return creditcardtype;
	}
	
	public WebElement getCreditCardExpiryMonth()
	{
		return creditcardexpirymonth;
	}
	
	public WebElement getCreditCardExpiryYear()
	{
		return creditcardexpiryyear;
	}
	
	public WebElement getCVVType()
	{
		return cvvtype;
	}
	
	public WebElement getBookNow()
	{
		return booknobutton;
	}
}
