package automation.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPageFactory_Day14 {
 private WebDriver driver;
 

@FindBy(id="email") WebElement textEmail;
 @FindBy(id="password") WebElement textPassword;
 @FindBy(name="signin") WebElement buttonLogin;
 
 public LoginPageFactory_Day14(WebDriver _driver) {
	super();
	this.driver = _driver;
	PageFactory.initElements(_driver, this);
	}
 
 public void LoginFunction(String email, String pass)
 {

	textEmail.sendKeys(email);
	textPassword.sendKeys(pass);
	buttonLogin.click();
 }
}
