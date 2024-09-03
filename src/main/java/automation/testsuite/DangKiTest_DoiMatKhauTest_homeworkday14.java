package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.DangKiPage_DoiMatKhauPage_homeworkday14;
import automation.page.LoginPageFactory_Day14;
import automation.page.LogoutPageFactory_Day14;

public class DangKiTest_DoiMatKhauTest_homeworkday14 extends CommonBase {
	DangKiPage_DoiMatKhauPage_homeworkday14 signupFactory;
	DangKiPage_DoiMatKhauPage_homeworkday14 changepasswordFactory;

	@BeforeMethod
	public void openFireFox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY5);
	}

	@Test
	public void signupSuccessfully () {
		signupFactory = new DangKiPage_DoiMatKhauPage_homeworkday14(driver);
		signupFactory.SignupFunction("test02", "test02+7@yopmail.com", "test02+7@yopmail.com", "12345678", "12345678", "0763505807");
		assertTrue(driver.findElement(By.xpath("//span[text()='Tiết kiệm đến 65% học phí khóa học']")).isDisplayed());
	}
	@Test
	public void changepasswordSuccessfully() {
		changepasswordFactory = new DangKiPage_DoiMatKhauPage_homeworkday14(driver);
		changepasswordFactory.ChangepasswordFunction("test02+4@yopmail.com", "123456", "123456", "1234567", "1234567");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());

	}
}
