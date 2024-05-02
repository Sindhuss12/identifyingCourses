package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ReadToTransferForm_Page;

public class FormFillingTest {
	@Given("Page is loaded and form is viewed")
	public void page_is_loaded_and_form_is_viewed() {
	    System.out.println("Form is loaded ");
	}

	@When("Form is filled and error message is captured")
	public void form_is_filled_and_error_message_is_captured() throws InterruptedException {
		ReadToTransferForm_Page f = new ReadToTransferForm_Page();
		f.bussiness();
	    f.formFilling();
	}

	@Then("The page is successfully closed")
	public void the_page_is_successfully_closed() {
		System.out.println("Error message is captured and the website is closed successfully ");
	    
	}




}
