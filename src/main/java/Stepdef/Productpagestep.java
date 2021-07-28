package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Productpagestep extends Basepage{

	Loginpage loginpage;
	Homepage  homepage;
	
	 public Productpagestep() {
			super();
		}
	
	
	
	@Given("^user Lumen Product open the browser$")
	public void user_Lumen_Product_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
	}

	@Then("^user  Lumen Product enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_Lumen_Product_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
	}

	@Then("^user  Lumen Product  click on Login button$")
	public void user_Lumen_Product_click_on_Login_button() throws Throwable {
		 loginpage.userloginsetup();
	}

	@Then("^user  serach the product on the page to add cart$")
	public void user_serach_the_product_on_the_page_to_add_cart() throws Throwable {
		homepage.Productcartpromo();
		homepage.ProductSearch();
		
	}

	@Then("^user enter the promocode on th cart page$")
	public void user_enter_the_promocode_on_th_cart_page() throws Throwable {
		
	}

}
