package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.HomeWorkPage01_Day16;

public class Homework01_Day16 extends CommonBase {
	HomeWorkPage01_Day16 changepasswordFactory;

	@BeforeMethod
	public void openFireFox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY5);
	}

	@Test
	public void ShowAlert() {
		changepasswordFactory = new HomeWorkPage01_Day16(driver);
		changepasswordFactory.LoginFunction("test02+4@yopmail.com", "123456");
		changepasswordFactory.UpdatePassword("123456", "1234567");
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Cập nhật mật khẩu mới thành công!");

	}
	
	@Test
	public void AcceptAlertSuccessfully() {
		changepasswordFactory = new HomeWorkPage01_Day16(driver);
		changepasswordFactory.LoginFunction("test02+4@yopmail.com", "123456");
		changepasswordFactory.UpdatePassword("123456", "1234567");
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//span[text()='Tiết kiệm đến 65% học phí khóa học']")).isDisplayed());

	}
}