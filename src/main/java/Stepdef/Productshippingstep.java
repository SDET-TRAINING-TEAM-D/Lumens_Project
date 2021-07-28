package Stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.lumen.pages.Basepage;
import com.lumen.pages.Homepage;
import com.lumen.pages.Loginpage;
import com.lumen.pages.Productpage;
import com.lumen.util.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Productshippingstep extends Basepage{

	 Loginpage loginpage;
	 Homepage  homepage;
	 Productpage prodtpage;

	 public Productshippingstep() {
			super();
		}
	 @Given("^user Lumen product shipping open the browser$")
	 public void user_Lumen_product_shipping_open_the_browser() throws Throwable {
		 Basepage.browserlaunch();
		 loginpage  = new Loginpage();
		 loginpage.registerpoppup();
		 loginpage.register();
		 homepage = new Homepage();
		 prodtpage = new Productpage();
	 }

	 @Then("^user product shipping enters the username \"([^\"]*)\" and password (\\d+)$")
	 public void user_product_shipping_enters_the_username_and_password(String sheetName, int rowNumber) throws Throwable {
		 ExcelReader reader = new ExcelReader();
			List<Map<String,String>> testData = 
					reader.getData("D:\\lumens assesment\\lumens assesment\\UserData.xlsx",  sheetName);
			String mail = testData.get(rowNumber).get("mail");
			String password = testData.get(rowNumber).get("password");
			loginpage.loginsetup(mail,password);
	 }

	 @Then("^user pproduct shipping click on Login button$")
	 public void user_pproduct_shipping_click_on_Login_button() throws Throwable {
		 loginpage.userloginsetup();
	 }

	 @Then("^user  add product in cart and details in page$")
	 public void user_add_product_in_cart_and_details_in_page() throws Throwable {
		 prodtpage.clickViewCart();
		 prodtpage.clickOnSecureButton();
		 prodtpage.getTheShippingDetails();
		 String actualmessage=prodtpage.getTextMessage();
			System.out.println(actualmessage);
			Assert.assertTrue(actualmessage.contains("Please check your postal code"));
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
}
