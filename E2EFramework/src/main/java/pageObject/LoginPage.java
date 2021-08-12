package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By submit = By.xpath("//input[@type='submit']");
	By error = By.xpath("//div[@role='alert']");

	public WebElement Username() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement Submit() {
		return driver.findElement(submit);
	}
	
	public WebElement Error() {
		return driver.findElement(error);
	}

}
