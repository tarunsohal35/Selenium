package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {

	public WebDriver driver;

	public Properties prop;

	public WebDriver base() throws IOException  {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\java\\E2EFramework\\src\\main\\java\\Academy\\prop.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-3.141.59\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		return driver;
	

	}
	
	public void screenshot(String methodName, WebDriver driver2) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver2;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\screen\\"+methodName+".png";
		FileUtils.copyFile(src, new File(destination));
		
		
	}

}
