package automation.testsuite;

import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
public class practiceXpathDay8 extends CommonBase {
	@BeforeMethod
    public void openBrowser() {
        driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
    }

    @Test
    public void getElementById() 
    {
        WebElement txtUserName = driver.findElement(By.id("name"));
        System.out.println(txtUserName);
        
        WebElement txtAddress = driver.findElement(By.id("address"));
        System.out.println(txtAddress);
        
        WebElement txtUserEmail = driver.findElement(By.id("email"));
        System.out.println(txtUserEmail);
        
        WebElement txtMobilecompany = driver.findElement(By.id("password"));
        System.out.println(txtMobilecompany);
        
      
}
}