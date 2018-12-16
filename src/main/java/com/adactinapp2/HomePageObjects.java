package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	public HomePageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	public WebElement getLocation()
	{
		return location;
	}
	
	public WebElement getHotel()
	{
		return hotel;
	}
	
	public WebElement getRoomType()
	{
		return roomtype;
	}
	
	public WebElement getRoomNo()
	{
		return roomno;
	}
	
	public WebElement getAdultNo()
	{
		return adultroom;
	}
	
	public WebElement getChildNo()
	{
		return childroom;
	}
	
	public WebElement getSearchButton()
	{
		return search;
	}
	
}
