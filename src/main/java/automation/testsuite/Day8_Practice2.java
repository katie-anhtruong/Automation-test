package automation.testsuite;

import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
public class Day8_Practice2 extends CommonBase {
	@BeforeMethod
    public void openBrowser() {
        driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void getElementById() 
    {
        WebElement txtUserEmail = driver.findElement(By.name("email"));
        System.out.println(txtUserEmail);
        
        WebElement txtPassword = driver.findElement(By.id("pass"));
        System.out.println(txtPassword);
        
        WebElement txtUsercompany = driver.findElement(By.name("company"));
        System.out.println(txtUsercompany);
        
        WebElement txtMobilecompany = driver.findElement(By.name("mobile number"));
        System.out.println(txtMobilecompany);
        
        WebElement txtFirstCrush = driver.findElement(By.id("inp_val"));
        System.out.println(txtFirstCrush);
}
}