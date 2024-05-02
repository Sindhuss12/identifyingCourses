package TestNG_TestCases;

import java.io.IOException;
import pageObject.*;
import org.testng.annotations.Test;

import Utilities.browser;


public class coursepageTest extends browser {
  @Test 
  public void test2() throws InterruptedException, IOException {
	   
	  Course_Page p =new Course_Page ();
	  p.ApplyingFilter();
	  p.click_On_First_Course();
	  p.display_details();
	  p.driver.close();
	  p.click_On_second_Course();
	  p.display_details();
	  System.out.println("Courses printed");
  }
}
