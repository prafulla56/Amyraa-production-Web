package PM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PM.Base.BaseTest;
import PM.PageObjectModel.Register;

public class RegisterTest extends BaseTest {
	
	@Test(priority=1)
	public void Regsiter_WithValid_Details() {
		Register register=new Register(driver);
		
		//Test data
		String name="Ashish Sawant";
		String emailid="ashishdwb@yopmail.com";
		String mobilenumber="8888888888";
		String businessName="DWB";
		String password="Test@1234";
		String confirmPassword="Test@1234";
		
		register.enterName(name);
		register.enterEmail(emailid);
		register.enterMobileNumber(mobilenumber);
		register.enterBusinessName(businessName);
		register.enterPassword(password);
		register.enterConfirmPassword(confirmPassword);
		register.ClickRegisterbtn();
		
		 // Add assertions to verify Register was successful
       /* String expectedMessage = "Your Account will Approved soon"; 
        String actualMessage = register.VerifySuccessfulRegistration();

        Assert.assertEquals(actualMessage, expectedMessage, "Successfull message does not match expected value.");*/
		
		
	}
	@Test(priority=2, enabled=true)
	public void Regsiter_WithEmptyField() {		
		Register register=new Register(driver);
		
		//Test data
		String name="";
		String emailid="";
		String mobilenumber="";
		String businessName="";
		String password="";
		String confirmPassword="";
		
		register.enterName(name);
		register.enterEmail(emailid);
		register.enterMobileNumber(mobilenumber);
		register.enterBusinessName(businessName);
		register.enterPassword(password);
		register.enterConfirmPassword(confirmPassword);
		register.ClickRegisterbtn();
		
		//Verify Error message after leaving name field empty 
		    String expectedMessage = "Full Name is required"; 
	        String actualMessage = register.EmptyNamefield();

	        Assert.assertEquals(actualMessage, expectedMessage, "Successfull message does not match expected value.");
		
	}

}
