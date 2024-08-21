package PM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PM.Base.BaseTest;
import PM.PageObjectModel.Search;

public class SearchTest extends BaseTest {
	
	 @Test(priority=1, enabled=true, invocationCount=1)
	    public void Searchfunctionality_With_ValidProducts() {
		 Search search = new Search(driver);
	      // Test Data
	        String product = "mala";
	        search.searchvalid_product(product);
	        
	      // Verify Product Count After Searching
	        String expectedMessage = "30 Products"; 
	        String actualMessage = search.VerifyValid_product();
	        Assert.assertEquals(actualMessage, expectedMessage, "Product Count does not match expected value.");
	 }
	 @Test(priority=2, enabled=true, invocationCount=1)
	    public void SearchFunctionality_WithInvalid_Products() {
		 Search search = new Search(driver);
	      // Test Data
	        String product = "iphone";
	        search.searchInvalid_product(product);
	        
	     // Verify Message after Inavlid product search 
	        String expectedMessage = "No Products Available"; 
	        String actualMessage = search.VerifyInvalid_product();
	        Assert.assertEquals(actualMessage, expectedMessage, "Invalid product search message does not match expected value.");
	 }
}
