package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Productremovepage extends Basepage {

	Loginpage loginpage;
	Homepage  homepage;
	
	

	 public Productremovepage() {
			super();
		}
	
	
	@Given("^user  Product remove open the browser$")
	public void user_Product_remove_open_the_browser() throws Throwable {
	   
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		
	}

	@Then("^user   Product remove enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_Product_remove_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
	}
	@Then("^user   Product remove  click on Login button$")
	public void user_Product_remove_click_on_Login_button() throws Throwable {
		 loginpage.userloginsetup();
	}

	@Then("^user   product remove on the page to add cart$")
	public void user_product_remove_on_the_page_to_add_cart() throws Throwable {
		homepage.Productcartremove();
	}

	
	
	
	
	
}
