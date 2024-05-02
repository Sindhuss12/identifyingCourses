package TestNG_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.browser;
import pageObject.ReadToTransferForm_Page;

public class formTest extends browser {
  @Test
  public void test4() throws InterruptedException, IOException {
	  ReadToTransferForm_Page r = new ReadToTransferForm_Page();
	  r.bussiness();
	  r.formFilling();
	  System.out.println("Error Message is captured");
  }
}
