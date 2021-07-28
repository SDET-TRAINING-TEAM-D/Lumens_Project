package com.lumen.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productpage extends Basepage{

	
	
	@FindBy(xpath="//span[text() ='Account']") 
	WebElement myaccount;
	
	
	@FindBy(xpath="//a[text() ='Sign Out']") 
	WebElement myaccountlogout;
	
	
//priya
	Actions action;
	@FindBy(id = "mcBookMark") 
	WebElement minicart;
	@FindBy(xpath = "//button[@class='imagebuttonCO continuecheckout continueCOtop']")
	WebElement securebtn;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	WebElement firstname;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_lastName") 
	WebElement lastname;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_address1") 
	WebElement address;	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_phone")
	WebElement phone;
	@FindBy(xpath = "//button[@class='saveaddress h-auto bg-blue border-0']")
	WebElement submit;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_city")
	WebElement city;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_states_stateUS")
	WebElement state;
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_postal")
	WebElement zipcode;
	private By errormsg = By.xpath("//span[@for='dwfrm_singleshipping_shippingAddress_addressFields_postal']");

	
	
//  jeevan  
	
	
	@FindBy(xpath="//*[@id='Quantity']")
    WebElement number;
   
    @FindBy(xpath="//button[@type='submit']")
    WebElement click_cart;
   
    @FindBy(xpath="//button[@id='simplesearchbtn']")
    WebElement searchbtn;
   
    @FindBy(xpath="//*[@id='searchinput']")
    WebElement search;  	
	
	
 
    
	
	//Initializing the Page Objects:
	public Productpage(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	
//Method	
	public Productpage accountlogout()
	{
		myaccount.click();
		myaccountlogout.click();		
	return new Productpage();
	}
	
	
	
	
	
//priya
	public void clickViewCart() {
		action=new Actions(driver);
		action.moveToElement(minicart).build().perform();
		minicart.click();
	}
	public void clickOnSecureButton() {
		action=new Actions(driver);
		action.moveToElement(securebtn).build().perform();
		securebtn.click();
	}
	public void getTheShippingDetails() {
		firstname.sendKeys("Mohanapriya");
		lastname.sendKeys("Raj");
		address.sendKeys("No909 North Street US noisec");
		phone.sendKeys("9876543210");
		submit.click();
		city.sendKeys("hendey");
		Select select1=new Select(state);
		select1.selectByValue("AZ");
		zipcode.sendKeys("600019");
	}
	public String getTextMessage() {
		return driver.findElement(errormsg).getText();
		
	}
	
	
	
	
	public Productpage productquantity()
    {
        search.sendKeys("Angelo Two-Tier Chandelier by Feiss - OPEN BOX RETURN");
        searchbtn.click();
        click_cart.click();
        number.click();
        number.clear();
        number.sendKeys("5");
//        viewcart.click();
//        cart.click();
//        number.click();
    return new Productpage();
    }
	
	
	
	
	
	
	
}
