package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Productnavistep extends Basepage {
	 Loginpage loginpage;
	 Homepage  homepage;
	 
	 public Productnavistep() {
			super();
		}
	
	@Given("^user Lumen product navigation open the browser$")
	public void user_Lumen_product_navigation_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		
		
	}

	@Then("^user product navigation enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_product_navigation_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
	}

	@Then("^user product navigation click on Login button$")
	public void user_product_navigation_click_on_Login_button() throws Throwable {
		loginpage.userloginsetup();
	}

	@Then("^user  product navigation the Home page to product page$")
	public void user_product_navigation_the_Home_page_to_product_page() throws Throwable {
		homepage.getMyAccountDetails();
		homepage.navigateToHome();
		
		homepage.viewTheGivenProduct();
		homepage.selectTheProduct();
	}

	@Then("^user moves to zip and product cart page$")
	public void user_moves_to_zip_and_product_cart_page() throws Throwable {
	   
		homepage.applyTheFilter();
		homepage.productSubmit();
	}
	
	
	
	
	
	
}
