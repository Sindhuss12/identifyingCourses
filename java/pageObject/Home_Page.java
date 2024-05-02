package pageObject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.browser;





public class Home_Page extends browser {
	
	@FindBy(xpath="//a[@class='nostyle']")
	WebElement popup;
	
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']")
	WebElement searchbtn;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Home_Page(){
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickPopUp() throws InterruptedException{
		try{
			Thread.sleep(5000);
		    js.executeScript("arguments[0].click()", popup);
		}
		catch(Exception e) {
			e.getMessage();
			}
		
}
	
	public void searchWebDevelopmentCourses() throws InterruptedException, IOException {
		search.sendKeys("Web Development");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		searchbtn.click();
	}
}
