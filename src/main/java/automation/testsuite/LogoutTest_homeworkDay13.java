package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LogoutPage_homeworkDay13;

public class LogoutTest_homeworkDay13 extends CommonBase {
	LogoutPage_homeworkDay13 logout;
	LogoutPage_homeworkDay13 login;
	@BeforeMethod

	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY6);
		LogoutTest_homeworkDay13 logout = new LogoutTest_homeworkDay13();

	}
	@Test
	public void logoutSuccessfully () throws InterruptedException {
		login = new LogoutPage_homeworkDay13(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logout = new LogoutPage_homeworkDay13(driver);
		logout.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
}
}
