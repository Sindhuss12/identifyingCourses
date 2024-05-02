package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home_Page;

public class HomePageTest {
	@Given("To load the coursera page")
	public void to_load_the_coursera_page() throws InterruptedException {
	    Home_Page h = new Home_Page();
	    h.clickPopUp();
	    System.out.println("Coursera page is loaded and popupis clicked");
	}

	@When("search the Web Development Courses")
	public void search_the_web_development_courses() throws InterruptedException, IOException {
		Home_Page h = new Home_Page();
		h.searchWebDevelopmentCourses();
	}

	@Then("The search results are loaded")
	public void the_search_results_are_loaded() {
	  System.out.println("Search page is loaded");
	}



}
