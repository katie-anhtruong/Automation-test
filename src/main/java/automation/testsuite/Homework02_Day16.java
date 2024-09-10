package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Homework02_Day16 extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMPRACTISE);
	}

	@Test(priority = 1)
	public void verifyAlertMessage() {
		click(By.xpath("//button[text()='Try it']"));
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Welcome to Selenium WebDriver Tutorials");

	}
	

	@Test(priority = 2)
	public void AcceptAlertMessage() {
		click(By.xpath("//button[text()='Try it']"));
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//h3[@class='post-title entry-title']")).isDisplayed());

	}
}