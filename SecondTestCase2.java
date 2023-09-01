package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTestCase2 {
	
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
	public void instalogin() {
		driver=new FirefoxDriver();
		
		driver.get("https://www.instagram.com");
		
		String text=driver.getTitle();
		System.out.println(text);
	}
	
}
