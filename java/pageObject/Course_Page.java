package pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.browser;

public class Course_Page extends browser {
	public String originalWindow;
	public String firstWindow;
	@FindBy(xpath="//span[@id='cds-react-aria-53-label-text' or text()='English']")
	WebElement English;
	
	@FindBy(xpath="//*[@id=\"search-results-header-wrapper\"]/div/div/div/div[4]/div/div/div[1]")
	WebElement Beginner;
	
	@FindBy(xpath="//ul[contains(@class,'css-reop')]/li[1]//div[@class='cds-ProductCard-header']/div[2]/a")
	public WebElement firstCourse;
	@FindBy(xpath="//ul[contains(@class,'css-reop')]/li[2]//div[@class='cds-ProductCard-header']//a")
	public WebElement secondCourse;
	@FindBy(xpath="//div[@data-e2e='key-information']//div[contains(@class,'css-guxf')]/div[contains(@class,'Typography')]")
	public WebElement rating1;
	@FindBy(xpath="//div[@data-track-component='syllabus']/div/div//span[contains(text(),'hour')]")
	public List<WebElement> hours;
	@FindBy(xpath="//h1[@data-e2e='hero-title']")
	public WebElement name;

 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Course_Page(){
		PageFactory.initElements(driver,this);
		originalWindow = driver.getWindowHandle();
	}
	public void ApplyingFilter() throws InterruptedException{
		English.click();
		Thread.sleep(10000);
		Beginner.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",Beginner);
	}
	public void click_On_First_Course() {

	
		js.executeScript("arguments[0].click()",firstCourse);
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.equals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        firstWindow=driver.getWindowHandle();
		        break;
		    }
		}

	}

public void click_On_second_Course() {
	driver.switchTo().window(originalWindow);
		js.executeScript("arguments[0].click()",secondCourse);
		for (String windowHandle : driver.getWindowHandles()) {
		    if((!originalWindow.equals(windowHandle)) && (!firstWindow.equals(windowHandle))) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
	}
		

public void display_details() {
		int totalhrs=0;
		String nm=name.getText();
       String  rating=rating1.getText();
        for(WebElement h:hours) {
       	 js.executeScript("arguments[0].scrollIntoView();",h);
       	String hr= h.getText();
       	String[] s=hr.split(" ");
       	totalhrs=totalhrs+Integer.parseInt(s[0]);
        }
       System.out.println("Course Name:"+ nm);
       System.out.println("Rating of the course:"+ rating);
       System.out.println("Total Hours of the Course:"+ totalhrs);
	}

}