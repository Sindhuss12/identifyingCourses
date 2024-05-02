package TestNG_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.browser;
import pageObject.LanguageLearning_Page;

public class languagelearningTest extends browser {
  @Test
  public void test3() throws InterruptedException, IOException {
	  LanguageLearning_Page l =new LanguageLearning_Page();
	  l.ExtractAllLanguage();
	  l.printingLanguages();
	  l.printingLevels();
	  System.out.println("Languages and levels are printed");
  }
}

