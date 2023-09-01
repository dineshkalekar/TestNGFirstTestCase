package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class afterMethod {
WebDriver driver;
	
	@Test
	
	public void fblogin() {

		 driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

//		driver.findElement(By.id("email")).sendKeys("sfkjhfis");
//
//		driver.findElement(By.id("pass")).sendKeys("dsfss");
		driver.manage().window().maximize();
     	WebElement e1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e1.click();

	}
	@Test
	@BeforeMethod
	

	public void instalogin() {
		driver=new FirefoxDriver();
		
		driver.get("https://www.instagram.com");
		
		String text=driver.getTitle();
		System.out.println(text);
	}
	

}
