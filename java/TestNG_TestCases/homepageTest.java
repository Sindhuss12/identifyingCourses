package TestNG_TestCases;
import pageObject.*;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.browser;

public class homepageTest extends browser {
  @Test
  public void test1() throws InterruptedException, IOException {
	  Home_Page p= new Home_Page();

	  p.searchWebDevelopmentCourses();
	  System.out.println("Web Development Course is searched");
	 
  }
}
