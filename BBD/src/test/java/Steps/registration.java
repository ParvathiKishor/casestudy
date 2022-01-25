package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webelements.elements;

public class registration {
	
	WebDriver d1=null;
	elements ele=new elements();
	
	@Given("User Open chrome browser and url of the application.")
public void user_Open_chrome_browser_and_url_of_the_application() {
    System.setProperty("webdriver.chrome.driver", "C:\\Se installers\\driver latest\\chromedriver.exe");
		
	    d1=new ChromeDriver();
	    d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=1BC38CA4GRJ1D6NDW1JM&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    d1.manage().window().maximize();
	    System.out.println("Given stt");
}
	
	
	
	@When("User enters his name, email, password, confirm password and clicks continue button.")
	public void user_enters_his_name_email_password_confirm_password_and_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    ele.name(d1).sendKeys("Shylaja Kishor");
	    ele.email(d1).sendKeys("8547590351");
	    ele.password(d1).sendKeys("Krishna@123");
	    ele.passwordconfirm(d1).sendKeys("Krishna@123");
	    ele.continuebutton(d1).click();
	    System.out.println("Given details!");
	}

	@Then("leads to mobile number verification page.")
	public void leads_to_mobile_number_verification_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verification done via otp");
	}

	@Then("Click on Create your Amazon account button.")
	public void click_on_Create_your_Amazon_account_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Registration Success");
	}


}
