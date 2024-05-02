package TestNG_TestCases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilities.browser;

public class baseTest extends browser {
	@BeforeTest
	public void setup() {
      
	brow();
	System.out.println("Browser is launched");
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Page is closed");
	}


}

