package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.pages.Productpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductQtystep extends Basepage {

	 Loginpage loginpage;
	 Homepage  homepage;
	 Productpage prodtpage;
	 
	 
	@Given("^user Lumen product adding quantity open the browser$")
	public void user_Lumen_product_adding_quantity_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		 prodtpage = new Productpage();
	}

	@Then("^user product adding quantity enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_product_adding_quantity_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
	}

	@Then("^user product adding quantity click on Login button$")
	public void user_product_adding_quantity_click_on_Login_button() throws Throwable {
		 loginpage.userloginsetup();
	}

	@Then("^user  product adding quantity in page$")
	public void user_product_adding_quantity_in_page() throws Throwable {
		prodtpage.productquantity();
	}

	
	
}
