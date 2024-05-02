package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LanguageLearning_Page;

public class LanguageLearningPageTest {
	@Given("Page is loaded and filter is appiled")
	public void page_is_loaded_and_filter_is_appiled() {
	    System.out.println("Page is loaded and Language is going to print");
	}

	@When("All language and different levels are printed")
	public void all_language_and_different_levels_are_printed() throws InterruptedException {
	    LanguageLearning_Page l = new LanguageLearning_Page ();
	    l.ExtractAllLanguage();
	    l.printingLanguages();
	    l.printingLevels();
	    
	}

	@Then("Printed Successfully and clicking For Bussiness")
	public void printed_successfully_and_clicking_for_bussiness() throws InterruptedException {
		 System.out.println("Printed Successfully");
	}




}
