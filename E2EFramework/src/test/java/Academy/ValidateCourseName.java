package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LandingPage;

public class ValidateCourseName extends InitializeDriver {

	WebDriver driver;
	@Test
	public void validate() throws IOException {
		driver = base();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		String courseName = lp.Text().getText();
		Assert.assertEquals(courseName, "FEATURED COURSES1");
		driver.quit();
	}
	
	
}
