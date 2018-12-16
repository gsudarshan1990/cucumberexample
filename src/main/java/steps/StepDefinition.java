package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adactinapp2.BasePage;
import com.adactinapp2.BookConfirmation;
import com.adactinapp2.BookHotelObjects;
import com.adactinapp2.HomePageObjects;
import com.adactinapp2.LoginPageObjects;
import com.adactinapp2.SelectHotelObjects;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	BasePage bp;
	LoginPageObjects lpo;
	HomePageObjects hpo;
	SelectHotelObjects sho;
	BookHotelObjects bho;
	BookConfirmation bc;
	@Given("^user enters the login page$")
	public void user_enters_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 bp=new BasePage();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lpo=new LoginPageObjects(bp.driver);
	    lpo.getUsername().sendKeys("Sudarshan1990");
	    lpo.getPassword().sendKeys("DTA9P9");
	    lpo.getLoginButton().click();
		
	}

	@Then("^user successfully login$")
	public void user_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		Assert.assertTrue(lpo.getTitle(bp.driver).contains("AdactIn.com - Search Hotel"));
	}

	@When("^user enters details$")
	public void user_enters_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		hpo=new HomePageObjects(bp.driver);
		Select selectlocation=new Select(hpo.getLocation());
		selectlocation.selectByIndex(3);
		Select selecthotel=new Select(hpo.getHotel());
		selecthotel.selectByIndex(2);
		Select selectroomtype=new Select(hpo.getRoomType());
		selectroomtype.selectByIndex(2);
		Select selectroomno=new Select(hpo.getRoomNo());
		selectroomno.selectByIndex(1);
		Select selectadults=new Select(hpo.getAdultNo());
		selectadults.selectByIndex(4);
		Select selectchild=new Select(hpo.getChildNo());
		selectchild.selectByIndex(2);
		hpo.getSearchButton().click();
		sho=new SelectHotelObjects(bp.driver);
		sho.getRadioButton().click();
		sho.getContinue().click();
		bho=new BookHotelObjects(bp.driver);
		bho.getFirstName().sendKeys("Sudarshan");
		bho.getLastName().sendKeys("Govindarajan");
		bho.getAddress().sendKeys("Chennai");
		bho.getCreditCardNo().sendKeys("1234876590215643");
		Select selectcardtype=new Select(bho.getCreditCardType());
		selectcardtype.selectByIndex(3);
		Select selectexpirymonth=new Select(bho.getCreditCardExpiryMonth());
		selectexpirymonth.selectByIndex(8);
		Select selectexpiryyear=new Select(bho.getCreditCardExpiryYear());
		selectexpiryyear.selectByIndex(2);
		bho.getCVVType().sendKeys("518");
		bho.getBookNow().click();
		
		
	}

	@Then("^Orderid is Obtained$")
	public void orderid_is_Obtained() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bc=new BookConfirmation(bp.driver);
		WebDriverWait wait=new WebDriverWait(bp.driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='order_no']")));
		System.out.println(bc.getOrderNo().getAttribute("value"));
	
	}
	
	
}
