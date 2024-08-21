package PM.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
// Loctaors
    private By emailField = By.name("emailid");
    private By passwordField = By.name("password"); 
    private By loginButton = By.xpath("//span[text()='Login']");
// Error Locators
    private By Valid_Credential=By.xpath("//div[text()='Prafulla']");
    private By invalidEmail=By.xpath("//span[text()='Invalid email id']");
    private By invalidPassword=By.xpath("//div[@class='react-toast-notifications__container css-xg5s2c']");
    private By EmptyEmail=By.xpath("//span[text()='Email Id is a required field']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    //Get Error Text
    public String VerifyUsername_AfterLogin() {
    	 return driver.findElement(Valid_Credential).getText();
    }
    public String VerifyErrorMessage_WithinvaildEmail() {
   	 return driver.findElement(invalidEmail).getText();
	
    }
    public String VerifyErrorMessage_Withinvaildpassword() {
      	 return driver.findElement(invalidPassword).getText();
    }
    public String VerifyErrorMessage_WithEmpty_Email() {
     	 return driver.findElement(EmptyEmail).getText();
   }
}
