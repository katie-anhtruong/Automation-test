package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage_homeworkDay13 {
	private WebDriver driver;

	public LogoutPage_homeworkDay13(WebDriver _driver) {
		this.driver = _driver;
	}

	public void LoginFunction(String email, String password) {

		WebElement textEmail = driver.findElement(By.id("email"));

		if (textEmail.isDisplayed()) {
			textEmail.sendKeys(email);
		}
		WebElement textPassword = driver.findElement(By.id("password"));

		if (textPassword.isDisplayed()) {
			textPassword.sendKeys(password);
		}

		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Đăng nhập' and @type='submit']"));

		if (btnLogin.isDisplayed()) {
			btnLogin.click();
		}
	}

	public void LogoutFunction() {
		WebElement btnAdmin = driver.findElement(By.id("dropdownMenuLink"));

		if (btnAdmin.isDisplayed()) {
			btnAdmin.click();

			WebElement btnDangxuat = driver.findElement(By.xpath("//button[text()='Đăng xuất' and @type='button']"));

			if (btnAdmin.isDisplayed()) {
				btnDangxuat.click();

				WebElement btnLogout = driver.findElement(By.xpath("//button[text()='Đăng xuất' and @class='btn btn-success']"));

				if (btnLogout.isDisplayed()) {
					btnLogout.click();

				}
			}
		}
	}

}
