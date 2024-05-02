package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.browser;

public class LanguageLearning_Page extends browser {
	
	@FindBy(xpath="//button[@aria-label='Show more Language options']//span[@class='cds-button-label'][normalize-space()='Show more']")
	WebElement ShowMore;
	
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='css-zweepb']")
	List<WebElement> Languages;
	
	@FindBy(xpath="//button[contains(@class,'css-1s96oj')]//span[contains(text(),'Close')]")
	WebElement Close;

	@FindBy(xpath="//*[@id='search-results-header-wrapper']/div/div/div/div[4]/div/div")
	WebElement Levels;
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    
	
	public LanguageLearning_Page(){
		PageFactory.initElements(driver,this);
	}
	
	public void ExtractAllLanguage() throws InterruptedException{
			driver.navigate().to("https://www.coursera.org/");
			search.sendKeys("language");
			searchbtn.click();
			js.executeScript("window.scrollBy(0,200)", "");
	
	}
	public void printingLanguages() throws InterruptedException{
		ShowMore.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for(WebElement lang:Languages) {
	    	System.out.println(lang.getText());
	    	
	    }
		Close.click();
		
	}
	public void printingLevels()throws InterruptedException{
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println(Levels.getText());
		js.executeScript("window.scrollBy(0,-1200)", "");
	}
	

}
