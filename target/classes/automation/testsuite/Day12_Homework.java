package automation.testsuite;

import automation.common.CommonBase;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;
import automation.constant.CT_PageURLs;

public class Day12_Homework extends CommonBase{

	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY4);
	}
	//Case1: kiểm tra Country dropdownlist 
	@Test
	public void case1_Dropdownlist() {
	    Select dropdownCountry = new Select(driver.findElement(By.xpath("(//select)[1]")));
	    
	    // Check the total number of options
	    assertEquals(dropdownCountry.getOptions().size(), 249);}
	
	    @Test
		public void case2_Dropdownlist() {
		    Select dropdownCountry = new Select(driver.findElement(By.xpath("(//select)[1]")));
	    // Select Sweden by visible text and verify selection
	    dropdownCountry.selectByVisibleText("Sweden");
	    assertEquals(dropdownCountry.getFirstSelectedOption().getText(),"Sweden");}
	    
	    @Test
		public void case3_Dropdownlist() {
		    Select dropdownCountry = new Select(driver.findElement(By.xpath("(//select)[1]")));
	    // Select New Caledonia by index and verify selection
	    dropdownCountry.selectByIndex(157);
	    assertEquals(dropdownCountry.getFirstSelectedOption().getText(),"New Caledonia");}
	}




