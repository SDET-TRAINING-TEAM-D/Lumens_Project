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

public class Logoutpagestep extends Basepage{

	Loginpage loginpage;
	Homepage  homepage;
	Productpage prdtpage;
	
	public Logoutpagestep() {
		super();
	}

	
	@Given("^user  Product logout open the browser$")
	public void user_Product_logout_open_the_browser() throws Throwable {
	   
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		
	}

	@Then("^user    enters the username \"([^\"]*)\" and password (\\d+)$")
	public void user_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
	   
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
		String mail = testData.get(rowNumber).get("mail");
		String password = testData.get(rowNumber).get("password");
		loginpage.loginsetup(mail,password);
		
		
	}

	@Then("^user   enter   click on Login button$")
	public void user_enter_click_on_Login_button() throws Throwable {
		   loginpage.userloginsetup();
	}

	@Then("^user   logout on the page$")
	public void user_logout_on_the_page() throws Throwable {
		prdtpage  = new Productpage();
		prdtpage.accountlogout();
	}
	
	
}
