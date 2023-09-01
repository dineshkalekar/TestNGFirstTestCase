package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BeforeSuite {
WebDriver driver;
	
	@Test
	
	public void fblogin() {

		 driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

	    driver.manage().window().maximize();
	    
     	WebElement e1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e1.click();

	}

	@Test
	

	public void instalogin() {
		driver=new FirefoxDriver();
		
		driver.get("https://www.instagram.com");
		
		String text=driver.getTitle();
		System.out.println(text);
	}
	
	@org.testng.annotations.BeforeSuite
	public void msg() {
		System.out.println("welcome......");
	}

}
