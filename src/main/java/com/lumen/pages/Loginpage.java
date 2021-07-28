package com.lumen.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Loginpage extends Basepage{

	
	
	@FindBy(xpath="//input[@id='ltkpopup-email']") 
	WebElement emailaccount;
	
	@FindBy(xpath="//button[@id='ltkpopup-submit']") 
	WebElement popupbtn;
	
	@FindBy(xpath="//input[@id='ltkpopup-phone']") 
	WebElement phoneaccount;
	
	
	@FindBy(xpath="//input[@id='ltkpopup-faux-submit']") 
	WebElement signupbtn;
	
	@FindBy(xpath="//*[@id='ltkpopup-thanks']/a") 
	WebElement finalsignupbtn;
	
	@FindBy(xpath="//span[text() ='Account']") 
	WebElement myaccount;
	
	@FindBy(xpath="//a[text() ='My Account']")
	WebElement myaccountlink;
		
	@FindBy(xpath="//button[@name='dwfrm_profile_confirm']")
	WebElement submit;
	
	
	
	private By userlogin = By.id("dwfrm_login_username");
	private By userpwd = By.id("dwfrm_login_password");
	
	
	@FindBy(xpath="//*[@id='dwfrm_login']/fieldset/div[3]/div[2]/button") 
	WebElement userbtn;
	
	private By firstname = By.id("dwfrm_profile_customer_firstname");
	private By lastname = By.id("dwfrm_profile_customer_lastname");
	private By email = By.id("dwfrm_profile_customer_email");
	private By emailconfirm = By.id("dwfrm_profile_customer_emailconfirm");
	private By pwd = By.id("dwfrm_profile_login_password");
	private By pwdconfrm = By.id("dwfrm_profile_login_passwordconfirm");
	
// manjunath	
	Actions action;
	
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
	

	
	
	
	//Initializing the Page Objects:
			public Loginpage(){
				PageFactory.initElements(driver, this);
			}
			
//Method						
			
	public Homepage register()
	{
		myaccount.click();
		myaccountlink.click();		
		 return new Homepage();
	}
		
	
	 public Homepage registerpage(String firtname,String latname,String mail,String mailconfirm,String password,String paswordconfrm){
			  
		   driver.findElement(firstname).sendKeys(firtname);
		   driver.findElement(lastname).sendKeys(latname);
		   driver.findElement(email).sendKeys(mail);
		   driver.findElement(emailconfirm).sendKeys(mailconfirm);
		   driver.findElement(pwd).sendKeys(password);
		   driver.findElement(pwdconfrm).sendKeys(paswordconfrm);
		   
	      return new Homepage();
		}
	
	
	 public Homepage submitbutton()
		{
		 submit.click();			
		 return new Homepage();
		}
	
	
	
	 public Homepage loginsetup(String mail,String password) {
		  driver.findElement(userlogin).sendKeys(mail);
		  driver.findElement(userpwd).sendKeys(password);		 
		  return new Homepage();
	  }
	  
	
	 public Homepage userloginsetup() {		 
		  userbtn.click();
		  return new Homepage();
	  }
	
	
	 public String getLoginPageTitle() {
			return driver.getTitle();
		}
	 

// manjunath
	 
	 public Homepage homeproduct(){
		 
		 action=new Actions(driver);
			action.moveToElement(lighting).build().perform();
			action.moveToElement(fans).build().perform();
			action.moveToElement(furniture).build().perform();
			action.moveToElement(rooms).build().perform();
			action.moveToElement(brands).build().perform();
			
			action.moveToElement(lighting).build().perform();
			action.moveToElement(ceiling).build().perform();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ceiling);
			js.executeScript("arguments[0].click();", large);
	return new Homepage();		 
		}

	 
	 public Homepage registerpoppup()
		{
			emailaccount.sendKeys("fazal71095@gmail.com");
			popupbtn.click();
			phoneaccount.sendKeys("9952660242");
			signupbtn.click();
			finalsignupbtn.click();
			return new Homepage();
		}	
	 
	 
}
