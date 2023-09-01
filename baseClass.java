package TestNG_FirstTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
public	WebDriver driver;
	
	@BeforeMethod
	public void lonching() {
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage(). window().maximize();
		
		
	}
	@AfterMethod
	public void close() {
		
		driver.close();
		
	}

}
