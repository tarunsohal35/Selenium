package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	 WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'sign_in')]")
	WebElement login;
	
	@FindBy(xpath = "//div[@class='listbuilder-popup-scale']")
	WebElement dialog;
	
	@FindBy(xpath = "//div[@class='text-center']/h2")
	WebElement text;
	
	@FindBy(xpath = "//button[text()='NO THANKS']")
	List<WebElement> popupsize;
	
	@FindBy(xpath = "//button[text()='NO THANKS']")
	WebElement popup;
	
	
	
	public WebElement Login() {
		return login;
	}
	
	public WebElement Dialog() {
		return dialog;
	}
	
	public WebElement Text() {
		return text;
	}
	
	public WebElement PopUp() {
		return popup;
	}
	
	public int PopUpSize() {
		return popupsize.size();
	}
	
	
}
