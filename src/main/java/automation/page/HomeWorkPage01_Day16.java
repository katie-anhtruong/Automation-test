package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomeWorkPage01_Day16 {
	
	private WebDriver driver;
	@FindBy(xpath = "//a[text()='Đăng Nhập']")
	WebElement buttonDangNhap;
	@FindBy(id = "txtLoginUsername")
	WebElement textEmail;
	@FindBy(id = "txtLoginPassword")
	WebElement textPassword;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']")
	WebElement buttonLogin;
	@FindBy(id = "showsub")
	WebElement buttonAvatar;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin' and @class='fs14']")
	WebElement buttonChinhSuaThongTin;
	@FindBy(id = "txtpassword")
	WebElement btnUpdatePass;
	@FindBy(id = "txtpassword")
	WebElement txtOldPass;
	@FindBy(id = "txtnewpass")
	WebElement txtNewPass;
	@FindBy(id = "txtrenewpass")
	WebElement txtConfirmNewPass;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
	WebElement buttonLuuMatKhauMoi;

	public HomeWorkPage01_Day16(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void LoginFunction(String email, String pass) {
		buttonDangNhap.click();
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
	}

	public void UpdatePassword(String oldPass, String newPass) {
			buttonAvatar.click();
			buttonChinhSuaThongTin.click();
			btnUpdatePass.click();
			txtOldPass.sendKeys(oldPass);
			txtNewPass.sendKeys(newPass);
			txtConfirmNewPass.sendKeys(newPass);
			buttonLuuMatKhauMoi.click();
		}
}
