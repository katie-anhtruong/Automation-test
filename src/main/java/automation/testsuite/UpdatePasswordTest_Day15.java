package automation.testsuite;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPageFactory_Day14;
import automation.page.UpdatePassword_PageFactory;

public class UpdatePasswordTest_Day15 extends CommonBase{
 
 @BeforeMethod
 public void openFireFox() {
	 driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMEASY7);
 }
 @Test
 public void updatePasswordSuccessfully() {
	 UpdatePassword_PageFactory updatePass = new UpdatePassword_PageFactory(driver);
	 updatePass.LoginFunction("anhnhantruong95@gmail.com", "Na220295@");
	 updatePass.UpdatePassword("Na220295@", "123456");
 }
 
}
