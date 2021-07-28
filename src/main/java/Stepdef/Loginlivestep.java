package Stepdef;

import java.util.List;
import java.util.Map;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Loginlivestep extends Basepage{

	Loginpage loginpage;
	Homepage  homepage;
	
	public Loginlivestep() {
		super();
	}
	
	
	@Given("^user Lumen login livechat  Page open the browser$")
	public void user_Lumen_login_livechat_Page_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
	}

	

	@Then("^user  Lumen login livechat  Page$")
	public void user_Lumen_login_livechat_Page() throws Throwable {
		homepage.getlivechat();
	}

	
	
	
	
	
	
	
	
}
