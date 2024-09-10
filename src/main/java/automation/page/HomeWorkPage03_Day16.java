package automation.page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
public class HomeWorkPage03_Day16 {
	
	private WebDriver driver;
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement textCustomerID;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement buttonSubmit;
	
	public HomeWorkPage03_Day16(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void DeleteCustomerID(String customerID) {
		textCustomerID.sendKeys(customerID);
		buttonSubmit.click();
	}

}
