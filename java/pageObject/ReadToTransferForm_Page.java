package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.browser;

public class ReadToTransferForm_Page extends browser {
	
	@FindBy(xpath="//div[@role='navigation']/a[2]")
	WebElement ForBussiness;
	
	@FindBy(xpath="//span[contains(text(),'Contact Sales')]")
	WebElement ContactSales;
	
	@FindBy(id="FirstName")
	WebElement Firstname;
	
	@FindBy(id="LastName")
	WebElement Lastname;
   
	@FindBy(id="Email")
	WebElement email;

	@FindBy(id="Phone")
	WebElement phone;
	
	@FindBy(id="Title")
	WebElement title;
	
	@FindBy(css="select#Institution_Type__c")
	WebElement instType;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"ValidMsgEmail\"]")
	WebElement error;
	
	@FindBy(xpath="//*[@id=\"ValidMsgEmail\"]/span")
	WebElement error1;
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ReadToTransferForm_Page(){
		PageFactory.initElements(driver,this);
	}
	
	public void bussiness()throws InterruptedException{
		driver.navigate().to("https://www.coursera.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ForBussiness.click();
		ContactSales.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void formFilling()throws InterruptedException{
		
		Firstname.sendKeys("Sindhu");
		Lastname.sendKeys("ss");
		email.sendKeys("xyz.com");
		phone.sendKeys("9876543210");
		title.sendKeys("Software Developer");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    js.executeScript("window.scrollBy(0,600)", "");
	    js.executeScript("arguments[0].click()",submit);
	    js.executeScript("window.scrollBy(0,-500)", "");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    System.out.println(error.getText());
	    System.out.println(error1.getText());
	}
}
