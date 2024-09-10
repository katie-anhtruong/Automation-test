package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
public class HomeWorkPage02_Day16 {

	private WebDriver driver;
	@FindBy(xpath = "//button[text()='Try it']")
	WebElement buttonTryit;
	
	public HomeWorkPage02_Day16(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void Alertdemo() {
		buttonTryit.click();
	}
}
