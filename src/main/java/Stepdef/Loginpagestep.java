package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpagestep extends Basepage {

	
	 Loginpage loginpage;
	
	public Loginpagestep() {
		super();
	}
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		 Basepage.browserlaunch();
	}

	@Then("^user clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
	}

	@When("^user is  going to  enter uid \"([^\"]*)\" and pwd (\\d+)$")
	public void user_is_going_to_enter_uid_and_pwd(String sheetName, int rowNumber) throws Throwable {
	    
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:\\lumens assesment\\lumens assesment\\FlipkartData.xlsx",  sheetName);
		String firtname = testData.get(rowNumber).get("firtname");
		String latname = testData.get(rowNumber).get("latname");
		String mail = testData.get(rowNumber).get("mail");
		String mailconfirm = testData.get(rowNumber).get("mailconfirm");
		String password = testData.get(rowNumber).get("password");
		String paswordconfrm = testData.get(rowNumber).get("paswordconfrm");
		
		loginpage.registerpage(firtname,latname,mail,mailconfirm,password,paswordconfrm);	
	}

	@Then("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
	   loginpage.submitbutton();
	}
	
}
