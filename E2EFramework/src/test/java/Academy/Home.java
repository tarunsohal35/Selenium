package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class Home extends InitializeDriver {

@Test(dataProvider = "userData")
public void homePage(String uname, String pass) throws IOException {
	
	driver = base();
	driver.get(prop.getProperty("url"));
	LandingPage lp = new LandingPage(driver);
	if(lp.PopUpSize()>0){
		lp.PopUp().click();
	}
	
	
	lp.Login().click();
	LoginPage logpg = new LoginPage(driver);
	logpg.Username().sendKeys(uname);
	logpg.Password().sendKeys(pass);
	logpg.Submit().click();
	
	
}

@DataProvider
public Object[][] userData() {
	Object[][] data = {{"restricteduser","123"}, {"nonRestricteduser","345"}};
	return data;
}

@AfterTest
public void teardown() {
	driver.quit();
}
	
	

}
