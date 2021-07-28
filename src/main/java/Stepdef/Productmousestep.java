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

public class Productmousestep  extends Basepage {

	 Loginpage loginpage;
	 Homepage  homepage;
	 Productpage prodtpage;
	
	 public Productmousestep() {
			super();
		}
	
	 
	 @Given("^user Lumen mouse over product Page open the browser$")
	 public void user_Lumen_mouse_over_product_Page_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		 prodtpage = new Productpage();
	 }

	 @Then("^user Lumen mouse over product  Page enters the username \"([^\"]*)\" and password (\\d+)$")
	 public void user_Lumen_mouse_over_product_Page_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		 ExcelReader reader = new ExcelReader();
			List<Map<String,String>> testData = 
					reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
			String mail = testData.get(rowNumber).get("mail");
			String password = testData.get(rowNumber).get("password");
			loginpage.loginsetup(mail,password);
	 }

	 @Then("^user Lumen mouse over product  Page click on Login button$")
	 public void user_Lumen_mouse_over_product_Page_click_on_Login_button() throws Throwable {
		     loginpage.userloginsetup();
	 }

	 @Then("^user Lumen mouse over product  Page$")
	 public void user_Lumen_mouse_over_product_Page() throws Throwable {
		    homepage.viewTheGivenProduct();
			homepage.selectTheProduct();
	 }

	 @Then("^user Lumen  productPage and quantity add$")
	 public void user_Lumen_productPage_and_quantity_add() throws Throwable {
		    homepage.applyTheFilter();
			homepage.productSubmit();
//			prodtpage.productquantity();
	 }
	 
	 
	 
}
