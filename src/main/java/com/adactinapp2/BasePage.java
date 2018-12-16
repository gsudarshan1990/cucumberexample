package com.adactinapp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static final String CHROME_KEY="webdriver.chrome.driver";
	public static final String CHROME_PATH="C:\\SeleniumDriversImportant\\chromedriver.exe";
	public static WebDriver driver;
	
	public BasePage()
	{
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelAppBuild2/");
		driver.manage().window().maximize();
	}
	
}
