package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Academy.InitializeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;

@RunWith(Cucumber.class)
public class stepdefinition extends InitializeDriver{
	WebDriver driver ;
	
	 @Given("^: intiate the browser$")
	    public void _intiate_the_browser() throws Throwable {

			driver = base();
	    }


	    @And("^: open \"([^\"]*)\" and click on login button$")
	    public void _open_something_and_click_on_login_button(String strArg1) throws Throwable {
	    	driver.get(strArg1);
			LandingPage lp = new LandingPage(driver);
			if(lp.PopUpSize()>0){
				lp.PopUp().click();
			}
			
			
			lp.Login().click();
	    }
	    
	    @When("^: sign in with (.+) and (.+)$")
	    public void _sign_in_with_and(String username, String password) throws Throwable {
	    	LoginPage logpg = new LoginPage(driver);
			logpg.Username().sendKeys(username);
			logpg.Password().sendKeys(password);
			logpg.Submit().click();
	    }

	    @Then("^: get the error message$")
	    public void _get_the_error_message() throws Throwable {
	    	LoginPage logpg = new LoginPage(driver);
			System.out.println(logpg.Error().getText());
	    }


	    @And("^: close the browser$")
	    public void _close_the_browser() throws Throwable {
	      driver.quit();
	    }
	

}
