package stepDefinition;
import java.io.IOException;

import Utilities.browser;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
public class hooks extends browser {
	
	@BeforeAll
	public static void before_all() throws IOException
	{   brow();
	}
	@AfterAll
	public static void after_all()
	{
		driver.quit();
	}

}
