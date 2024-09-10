package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.HomeWorkPage03_Day16;
public class Homework03_Day16 extends CommonBase {
	HomeWorkPage03_Day16 deleteCustomerID;

	@BeforeMethod
	public void openFireFox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_DEMOGURU);
	}
	
	@Test
	public void ShowAlertDeleteCustomer() {
		deleteCustomerID = new HomeWorkPage03_Day16(driver);
		deleteCustomerID.DeleteCustomerID("12345");
		waitAlertPeresent();
		String actualMessage1= driver.switchTo().alert().getText();
		assertEquals(actualMessage1, "Do you really want to delete this Customer?");

	}
	
	@Test
	public void AcceptAlertDeleteCustomer() {
		deleteCustomerID = new HomeWorkPage03_Day16(driver);
		deleteCustomerID.DeleteCustomerID("1234567");
		waitAlertPeresent();
		String actualMessage1 = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		waitAlertPeresent();
		String actualMessage2 = driver.switchTo().alert().getText();
		assertEquals(actualMessage2, "Customer Successfully Delete!");

	}
	
	@Test
	public void confirmSuccessAlert() {
	    deleteCustomerID = new HomeWorkPage03_Day16(driver);
	    deleteCustomerID.DeleteCustomerID("123457");
	    waitAlertPeresent();
	    String actualMessage1 = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    waitAlertPeresent();
	    String actualMessage2 = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
	}


}
