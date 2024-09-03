package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPage;

public class LoginTest extends CommonBase{
	LoginPage login;
	@BeforeMethod
	public void openFirefox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY5);
		LoginPage login = new LoginPage(driver);

				
	}
	
	@Test
	public void loginSuccessfully()
	{
		login = new LoginPage(driver);
		login.LoginFunction("anhnhan@yopmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
		
	}
	
	@Test
	public void loginFail_UsernameNoExist()
	{
		login = new LoginPage(driver);
		login.LoginFunction("email@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
	}
	
	@Test
	public void loginFail_PasswordInvalid()
	{
		login = new LoginPage(driver);
		login.LoginFunction("anhnhan@yopmail.com", "12345");
		assertTrue(driver.findElement(By.xpath("//p[text()='Mật khẩu sai.']")).isDisplayed());
	}
	
	@Test
	public void loginFail_LeaveBlank()
	{
		login = new LoginPage(driver);
		login.LoginFunction("", "");
		assertTrue(driver.findElement(By.id("txtLoginUsername-error")).isDisplayed());
		assertTrue(driver.findElement(By.id("txtLoginPassword-error")).isDisplayed());
	}
	
}

	