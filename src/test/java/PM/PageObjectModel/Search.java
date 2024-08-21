package PM.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search {

	private WebDriver driver;
	
	//Locators
	private By validproduct=By.xpath("//input[@placeholder='Search']");
	
	//Assert Locators
	private By verifyproduct_Count=By.xpath("//div[text()='30']");
	private By invalidproduct_Messages=By.xpath("//h4[text()='No Products Available']");
	
	// Constructor
	public Search(WebDriver driver) {
        this.driver = driver;
	}
	
	//Action performed
        public void searchvalid_product(String mala) {
            driver.findElement(validproduct).sendKeys("mala"+ Keys.ENTER);
        }
        public void searchInvalid_product(String Iphone15) {
            driver.findElement(validproduct).sendKeys("Iphone15"+ Keys.ENTER);
        }
    //Get text 
        public String VerifyValid_product() {
          return  driver.findElement(verifyproduct_Count).getText();
        }
        public String VerifyInvalid_product() {
            return  driver.findElement(invalidproduct_Messages).getText();
          }
}
