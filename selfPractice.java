package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class selfPractice {

public	WebDriver driver;

	@Test
	public void ABC() {
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		WebElement e1 = driver.findElement(By.xpath("// button[@class=\"button-orange wide\"]"));
		e1.click();
		
		System.out.println("Test Case Pass");

	}
	
	
	@Test
	
	public void BCD() {
		driver.get("https://www.angelone.in/login/");
		
		String gettitle= driver.getTitle();
		
		System.out.println(gettitle);
		
	}

	@BeforeSuite
	public void CDE() throws InterruptedException {
		Thread.sleep(5000);
		
		System.out.println("hiiiii....Bhxvyxx");
		
		Thread.sleep(1000);
		}
	
}
