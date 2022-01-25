package Steps;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webelements.elements;

public class scripsamazonlogin {
	
	WebDriver d1=null;
	elements ele=new elements();
	
	
	@Given("Open chrome browser and url of the application.")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Se installers\\driver latest\\chromedriver.exe");
		
	    d1=new ChromeDriver();
	    d1.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1\"");
	    d1.manage().window().maximize();
	    System.out.println("Given stt");
	}
	
	
	
	@When("Enter mobilenumber , password and click signin button.")
	public void enter_mobilenumber_password_and_click_signin_button() throws Throwable {
		ele.signinphone(d1).sendKeys("918129983309");
        ele.signincontinuebut(d1).click();
        ele.signinpassword(d1).sendKeys("Shylaja@123");
        Thread.sleep(3000);
       // ele.signinconfirmpassword(d1).sendKeys("Shylaja@123");
        ele.signinbutton(d1).click();
        Thread.sleep(5000);
        System.out.println("login success");
	    
	}
	
	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Wow login success");
	}

	@When("Enter product  and click search button.")
	public void enter_product_and_click_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ele.searchpdt(d1).sendKeys("pressure cooker");
        ele.searchbutton(d1).click();
        System.out.println("great!");
        Thread.sleep(5000);
	}

	@Then("leads to product search page")
	public void leads_to_product_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("search the required brand!");
 
	}

	@When("select the product  and add product to cart.")
	public void select_the_product_and_add_product_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor jse= (JavascriptExecutor) d1;
        jse.executeScript("scroll(0,500)");
		ele.pdt(d1).click();
        Set<String> window=d1.getWindowHandles();
        Iterator<String> itr=window.iterator();
        String w1=itr.next();
        String w2=itr.next();
        d1.switchTo().window(w2);
        
        jse.executeScript("scroll(0,500)");
        Thread.sleep(1000);
        
      //ele.addtocart(d1).click();
      ele.cartt(d1).click();
    /*ele.gocartt(d1).click();*/
      System.out.println("check in ur cart!");
      
      Robot r=new Robot();
      Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
      Rectangle rec=new Rectangle(d);
      BufferedImage sourse=r.createScreenCapture(rec);
      File destination=new File("C:\\Users\\admin\\eclipse-workspace\\cucumber.png");
      ImageIO.write(sourse, "png", destination);
      
      
      
      
	}

	@Then("leads to cart")
	public void leads_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Product successfully added to the cart!");
	}


}
