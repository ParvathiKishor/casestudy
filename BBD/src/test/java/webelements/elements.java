package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements {
	
	public static WebElement signinphone(WebDriver d1) {
		 return d1.findElement(By.id("ap_email"));
		
	}
	public static WebElement signincontinuebut(WebDriver d1) {
		 return d1.findElement(By.id("continue"));
		
	}
	public static WebElement signinpassword(WebDriver d1) {
		 return d1.findElement(By.id("ap_password"));
		 
	}
	/*public static WebElement signinconfirmpassword(WebDriver d1) {
		 return d1.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input"));
		 
	}*/
	public static WebElement signinbutton(WebDriver d1) {
		 return d1.findElement(By.id("signInSubmit"));
		
	}
	public static WebElement searchpdt(WebDriver d1) {
		 return d1.findElement(By.id("twotabsearchtextbox"));
		
	}
	
	public static WebElement searchbutton(WebDriver d1) {
		 return d1.findElement(By.id("nav-search-submit-button"));
		
	}
	
	public static WebElement pdt(WebDriver d1) {
		 return d1.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/h2/a/span"));
	}
	
	
	/*public static WebElement addtocart(WebDriver d1) {
		 return d1.findElement(By.id("add-to-cart-button"));
	}
	/*public static WebElement plan(WebDriver d1) {
		 return d1.findElement(By.xpath("//input[@data-asin='B07FGYHKLG']"));
	}*/
	/*public static WebElement cart(WebDriver d1) {
		 return d1.findElement(By.xpath("//span[@id='nav-cart-count']"));
	}*/
	
	public static WebElement cartt(WebDriver d1) {
		 return d1.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 
		}
	
	/*public static WebElement gocartt(WebDriver d1) {
		 return d1.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/div[3]/div/span[1]/span/input"));
		 
	}*/
	

	// REGISTRATION:
	
	public static WebElement name(WebDriver d1) {
		return d1.findElement(By.name("customerName"));
	}
	public static WebElement email(WebDriver d1) {
		return d1.findElement(By.name("email"));
	}
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.name("password"));
	}
	public static WebElement passwordconfirm(WebDriver d1) {
		return d1.findElement(By.name("passwordCheck"));
	}
	public static WebElement continuebutton(WebDriver d1) {
		return d1.findElement(By.id("continue"));
	}
	
}
