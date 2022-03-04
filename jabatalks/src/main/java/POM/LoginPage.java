package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath ="//span[text()='Choose Language']")
	WebElement dropdown;
	
	@FindBy (xpath ="(//i[@class='caret pull-right'])[2]")
	WebElement selectlanguage;
	
	@FindBy (xpath ="//div[text()='English']")
	WebElement english;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement fullName;
	
	@FindBy(xpath = "//input[@id='orgName']")
	WebElement organizationName;
	
	@FindBy(xpath = "//input[@id='singUpEmail']")
	WebElement emailId;
	
	@FindBy(xpath = "//span[text()='I agree to the']")
	WebElement checkBox;
	
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectdropdown() {
		 if(dropdown.isEnabled() && dropdown.isDisplayed()) 
		    { 
		       System.out.println("Dropdown is enabled and visible"); 
		    } 
		   else { 
		       System.out.println("Dropdown is not visible"); 
		   } 
	}
	
	public void language() {
		selectlanguage.click();
		}
	public void languageSelect() {
		english.click();
	}
	public void sendfullName() {
		fullName.sendKeys("XYZ");
	}
	
	public void organizationName() {
		organizationName.sendKeys("XYZ");
	}
	
	public void sendemailId() {
		emailId.sendKeys("deepikajoshi2193@gmail.com");
	}
	
	public void tickCheckbox() {
		checkBox.click();
	}
	
	public void hitbutton() {
		submitButton.click();
	}
}
