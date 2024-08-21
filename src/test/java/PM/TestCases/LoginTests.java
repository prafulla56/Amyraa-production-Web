package PM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PM.Base.BaseTest;
import PM.PageObjectModel.LoginPage;

public class LoginTests extends BaseTest {
	
	 
	
	 @Test(priority=1, enabled=false, invocationCount=1)
	    public void Login_With_Valid_Credentials() {
		 LoginPage loginPage = new LoginPage(driver);
	      // Test Data
	        String email = "prafulla.mishra@dwebbox.com";
	        String password = "Test@123";
	        
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	        
	        // Add assertions to verify login was successful
	        String expectedMessage = "Hi,Prafulla"; 
	        String actualMessage = loginPage.VerifyUsername_AfterLogin();

	        Assert.assertEquals(actualMessage, expectedMessage, "Successfull message does not match expected value.");
	    }
	 
	 @Test(priority=2,enabled=true)
	 public void Login_with_InvalidEmail()
	 {
		 LoginPage loginPage = new LoginPage(driver);
		 
		    String email = "mprafulla92ygdgmail.com";
	        String password = "Test@123";
	        
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	        
	        // Add assertions to verify error message for email field
	        String expectedMessage = "Invalid email id"; 
	        String actualMessage = loginPage.VerifyErrorMessage_WithinvaildEmail();

	        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match expected value.");
	       
	       
	 }
	 @Test(priority=3,enabled=true)
	 public void Login_with_InvalidPassword()
	 {
		 LoginPage loginPage = new LoginPage(driver);
		 
		    String email = "prafulla.mishra@dwebbox.com";
	        String password = "Testjhbckhd123";
	        
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	        
	        // Add assertions to verify error message for invaild Password
	        String expectedMessage = "Invalid username or password"; 
	        String actualMessage = loginPage.VerifyErrorMessage_Withinvaildpassword();

	        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match expected value.");
	       
	     
	 }
	 @Test(priority=4,enabled=true)
	 public void Login_with_EmptyEmail()
	 {
		 LoginPage loginPage = new LoginPage(driver);
		  
		    String email = "";
	        String password = "Test@123";
	        
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	        
	        // Add assertions to verify error message for Empty Email Field
	        String expectedMessage = "Email Id is a required field"; 
	        String actualMessage = loginPage.VerifyErrorMessage_WithEmpty_Email();

	        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match expected value.");
	 }



	
}



