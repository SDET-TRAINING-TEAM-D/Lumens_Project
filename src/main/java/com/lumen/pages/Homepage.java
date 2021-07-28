package com.lumen.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage  extends Basepage{

	@FindBy(xpath="//input[@name='q']") 
	WebElement searchprdt;
	
	@FindBy(xpath="//button[@id='simplesearchbtn']") 
	WebElement searchbtn;
	
	
	@FindBy(xpath="//span[text() ='Cart']") 
	WebElement prdtcartbtn;
	
	
	@FindBy(xpath="//input[@name='dwfrm_cart_couponCode']") 
	WebElement promocode;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement applybtn;
	
	
	@FindBy(xpath="//span[text() ='Remove']") 
	WebElement prdtcartremove;
	
//priya
	
	Actions action;
	
	@FindBy(id = "searchinput")
	WebElement search;
	
	@FindBy(id = "simplesearchbtn")
	WebElement searchicon;
	
	@FindBy(xpath  = "//a[@class='logo-link lu-sprite']")
	WebElement logo;
	
	
	@FindBy(xpath = "//span[@title='Lighting']") 
	WebElement lighting;
	@FindBy(xpath = "//span[@title='Fans']") 
	WebElement fans;
	@FindBy(xpath = "//span[@title='Furniture']") 
	WebElement furniture;
	@FindBy(xpath = "//span[@title='Rooms']") 
	WebElement rooms;
	@FindBy(xpath = "//span[@title='Brands']") 
	WebElement brands;
	@FindBy(xpath = "//a[@title='Ceiling Lights']") 
	WebElement ceiling;
	@FindBy(xpath = "//img[@alt='Ceiling Lights Chandeliers']") 
	WebElement large;
	@FindBy(xpath = "//a[@href='https://www.lumens.com/chandeliers/?prefn1=LU_BestSellerScore&prefv1=1%20business%20day&prefn2=Style&prefv2=Transitional']")
	WebElement ready;
	@FindBy(xpath = "//div[@class='refinement pb-0 pr-md-3 Style ']")
	WebElement sytle;
	@FindBy(xpath = "//a[@href='https://www.lumens.com/chandeliers/?prefn1=Style&prefv1=Transitional']") 
	WebElement traditional;
	@FindBy(xpath = "//img[@src='https://images.lumens.com/is/image/Lumens/FSSP199440OB_alt01?$Lumens.com-250$']") 
	WebElement product;	
	@FindBy(id = "add-to-cart")
	WebElement addcart;
	
	
//jeevan
	
   	
    @FindBy(xpath="//*[@class='LPMlabel']") 
	WebElement livechat;
	    
	
    @FindBy(xpath="//input[@id='txt_4616424']") 
	WebElement login_name;
    
    @FindBy(xpath="//input[@id='txt_4616425']") 
	WebElement login_email;
    
    
    @FindBy(xpath="//button[@class='lp_submit_button lpc_survey-area__submit-button lpc_desktop']") 
	WebElement login_submit;
    
  
    
    
   
   

	
	
	//Initializing the Page Objects:
	public Homepage(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
//Method	
	public Homepage ProductSearch()
	{
		searchprdt.sendKeys("Plisse Electric Kettle");
		searchbtn.click();		
		 return new Homepage();
	}
	
	public Homepage Productcartpromo()
	{
	
		prdtcartbtn.click();
		promocode.sendKeys("110011");
		applybtn.click();		
		 return new Homepage();
	}
	

	public Homepage Productcartremove()
	{
	
		prdtcartbtn.click();
		prdtcartremove.click();	
		 return new Homepage();
	}
	
	
//priya
	
	public Homepage getMyAccountDetails() {
		search.sendKeys("iphone");
		searchicon.click();
		return new Homepage();
	}
	public Homepage navigateToHome() {
		action=new Actions(driver);
		action.moveToElement(logo).build().perform();
		logo.click();
		return new Homepage();
	}
	
	public Homepage viewTheGivenProduct() {
		action=new Actions(driver);
		action.moveToElement(lighting).build().perform();
		action.moveToElement(fans).build().perform();
		action.moveToElement(furniture).build().perform();
		action.moveToElement(rooms).build().perform();
		action.moveToElement(brands).build().perform();
		return new Homepage();
	}
	public Homepage selectTheProduct() {
		action.moveToElement(lighting).build().perform();
		action.moveToElement(ceiling).build().perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ceiling);
		js.executeScript("arguments[0].click();", large);
		return new Homepage();
	}
	public Homepage applyTheFilter() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sytle);
		action.moveToElement(sytle).build().perform();
		sytle.click();	
		traditional.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1500);");
		ready.click();
		return new Homepage();
	}
	public Homepage productSubmit() {
		action.moveToElement(product).build().perform();
		product.click();
		action.moveToElement(addcart).build().perform();
		addcart.click();
		return new Homepage();
	}
	
	
//jeevan
	  
	
	public Homepage getlivechat()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		livechat.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login_name.sendKeys("Fazal");
		login_email.sendKeys("fazal71095@gmail.com");
		login_submit.click();
		return new Homepage();
	}
    
    
	
	
}
