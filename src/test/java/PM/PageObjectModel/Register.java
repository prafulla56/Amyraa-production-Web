package PM.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
	private WebDriver driver;
	//Locators
	private By namefield=By.xpath("//input[@placeholder='Enter your full name']");
	private By emailfield=By.xpath("//input[@placeholder='Enter your email ID']");
	private By Mobilefield=By.xpath("//input[@placeholder='Enter your mobile number']");
	private By businessname=By.xpath("//input[@placeholder='Enter your business name']");
	private By password_field=By.xpath("//input[@placeholder='Enter your password']");
	private By confirmfpassword_field=By.xpath("//input[@placeholder='Enter your confirm password']");
	private By Clickregister_btn=By.xpath("//span[text()='Register']");
	//private By VerifySuccessfulRegistration=By.xpath("");
	
	//Error message Locators
	private By emptynamefield=By.xpath("//span[text()='Full Name is required']");
	
	 public  Register(WebDriver driver) {
	        this.driver = driver;
	    }
	 public void enterName(String name) {
	        driver.findElement(namefield).sendKeys(name);
	    }
	 public void enterEmail(String email) {
	        driver.findElement(emailfield).sendKeys(email);
	    }
	 public void enterMobileNumber(String mobile) {
	        driver.findElement(Mobilefield).sendKeys(mobile);
	    }
	 public void enterBusinessName(String businessName) {
	        driver.findElement(businessname).sendKeys(businessName);
	    }
	 public void enterPassword(String password) {
	        driver.findElement(password_field).sendKeys(password);
	    }
	 public void enterConfirmPassword(String confirmpassword) {
	        driver.findElement(confirmfpassword_field).sendKeys(confirmpassword);
	    }
	 public void ClickRegisterbtn() {
	        driver.findElement(Clickregister_btn).click();;
	    }
	/* public String VerifySuccessfulRegistration() {
	       return driver.findElement(VerifySuccessfulRegistration).getText();
	    }*/
	 //Get Error Message
	 public String EmptyNamefield() {
	      return  driver.findElement(emptynamefield).getText();
	    }


}
