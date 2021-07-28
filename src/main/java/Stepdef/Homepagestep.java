package Stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.lumen.pages.Basepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homepagestep extends Basepage{

	 Loginpage loginpage;
	 
	 public Homepagestep() {
			super();
		}
	 
	 private static String title;
	 
	@Given("^user Lumen open the browser$")
	public void user_Lumen_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
	}

	@Then("^user enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	    loginpage.userloginsetup();
	}
	@Then("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page() throws Throwable {
		title = loginpage.getLoginPageTitle();
		Assert.assertEquals(title, "Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com");
		System.out.println("Successfully verified Title");
		
	}

	@Then("^user navigate the Home page to product page$")
	public void user_navigate_the_Home_page_to_product_page() throws Throwable {
	   
		loginpage.homeproduct();
		
	}
	
	
}
