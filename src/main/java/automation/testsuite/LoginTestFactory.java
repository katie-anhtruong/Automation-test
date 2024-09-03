package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPageFactory_Day14;
import automation.page.LogoutPageFactory_Day14;

public class LoginTestFactory extends CommonBase {
	LoginPageFactory_Day14 loginFactory;
	LogoutPageFactory_Day14 logoutFactory;
//Ctrl + A -> Ctrl + Shift + F
	@BeforeMethod
	public void openFireFox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY6);
	}

	
	@Test
	public void logoutSuccessfully () throws InterruptedException {
		loginFactory = new LoginPageFactory_Day14(driver);
		loginFactory.LoginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logoutFactory = new LogoutPageFactory_Day14(driver);
		logoutFactory.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
		// Gọi logoutFactory = new LogoutPageFactory(drive);
	}

	@Test
	public void loginFail_IncorrectPass() {
		loginFactory = new LoginPageFactory_Day14(driver);
		loginFactory.LoginFunction("admin@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
}
