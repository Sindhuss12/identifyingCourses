package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Course_Page;

public class CoursePageTest {
	@Given("Search page is loaded")
	public void search_page_is_loaded() throws InterruptedException {
	    System.out.println("Data is going to be filtered and result is printed");
	}

	@When("Filter is added")
	public void filter_is_added() throws InterruptedException {
		Course_Page c = new Course_Page();
	    c.ApplyingFilter();
	   
	}

	@Then("Result is printed")
	public void result_is_printed() throws InterruptedException {
		Course_Page c = new Course_Page();
		c.click_On_First_Course();
		c.display_details();
		c.driver.close();
		c.click_On_second_Course();
		c.display_details();
		
	}


}
