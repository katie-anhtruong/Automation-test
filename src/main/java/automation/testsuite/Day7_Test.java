package automation.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day7_Test extends CommonBase {
    public class CommonBase {

	}

	@BeforeMethod
    public void openBrowser() {
       System.out.println("This method to open chrome browser");
}
    @Test
    public void testCase_1()
    {
    	System.out.println("This method to implementfor testcase1");
    }
    
    @AfterMethod
    public void closeBrowser()
    {
    	System.out.println("This method to close chrome browser");
    }
}