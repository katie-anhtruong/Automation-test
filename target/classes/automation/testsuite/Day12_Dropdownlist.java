package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
public class Day12_Dropdownlist extends CommonBase{
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY3);
	}
	
	@Test
	public void case1_Dropdownlist()
	{
		Select dropdownDay =  new Select(driver.findElement(By.id("select-demo")));
		//Case1: kiểm tra size của dropdownlist là 8
		assertEquals( dropdownDay.getOptions().size(),8);
		
		//Case2: Chọn Monday bằng cách thứ 1, kiểm tra giá trị sau khi chọn
		dropdownDay.selectByVisibleText("Monday");
		assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Monday");
		
		//Case3: Chọn Tuesday bằng cách 2, kiểm tra giá trị sau khi chọn
		dropdownDay.selectByVisibleText("Tuesday");
		assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Tuesday");
		
		//Case4: Chọn Tuesday bằng cách 3, kiểm tra giá trị sau khi chọn
		dropdownDay.selectByIndex(1);
		assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Sunday");
	}

}
