package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class DangKiPage_DoiMatKhauPage_homeworkday14 {

	private WebDriver driver;

	@FindBy(xpath = "//a[text()='Đăng Ký']")
	WebElement buttonSignup;
	@FindBy(id = "txtFirstname")
	WebElement textHovaTen;
	@FindBy(id = "txtEmail")
	WebElement textDiaChiEmail;
	@FindBy(id = "txtCEmail")
	WebElement textNhapLaiEmail;
	@FindBy(id = "txtPassword")
	WebElement textMatKhau;
	@FindBy(id = "txtCPassword")
	WebElement textNhapLaiMatKhau;
	@FindBy(id = "txtPhone")
	WebElement textDienThoai;
	@FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @type='submit']")
	WebElement buttonDangKy;
	@FindBy(xpath = "//div[@class='avatar2']")
	WebElement buttonAvatar;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin' and @class='fs14']")
	WebElement buttonChinhSuaThongTin;
	@FindBy(id = "txtpassword")
	WebElement textMatKhauHienTai;
	@FindBy(id = "txtnewpass")
	WebElement textMatKhauMoi;
	@FindBy(id = "txtrenewpass")
	WebElement textNhapLaiMatKhauMoi;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
	WebElement buttonLuuMatKhauMoi;
	@FindBy(xpath = "//a[text()='Đăng Nhập']")
	WebElement buttonDangNhap;
	@FindBy(id = "txtLoginUsername")
	WebElement textEmail;
	@FindBy(id = "txtLoginPassword")
	WebElement textPassword;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']")
	WebElement buttonLogin;

	public DangKiPage_DoiMatKhauPage_homeworkday14(WebDriver _driver) {
		super();
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void SignupFunction(String firstname, String email, String nhaplaiemail, String password,
			String nhaplaipassword, String phone) {
		buttonSignup.click();
		textHovaTen.sendKeys(firstname);
		textDiaChiEmail.sendKeys(email);
		textNhapLaiEmail.sendKeys(nhaplaiemail);
		textMatKhau.sendKeys(password);
		textNhapLaiMatKhau.sendKeys(nhaplaipassword);
		textDienThoai.sendKeys(phone);
		buttonDangKy.click();
	}

	public void ChangepasswordFunction(String emailLogin, String passwordLogin, String matkhauhientai,
			String maukhaumoi, String nhaplaimatkhaumoi) {
		buttonDangNhap.click();
		textEmail.sendKeys(emailLogin);
		textPassword.sendKeys(passwordLogin);
		buttonLogin.click();
		buttonAvatar.click();
		buttonChinhSuaThongTin.click();
		textMatKhauHienTai.sendKeys(matkhauhientai);
		textMatKhauMoi.sendKeys(maukhaumoi);
		textNhapLaiMatKhauMoi.sendKeys(nhaplaimatkhaumoi);
		buttonLuuMatKhauMoi.click();
	}
}
