package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

	public WebDriver driver;

	@Test

	public void varifyloginfunctionality() {

		 driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.id("email")).sendKeys("sfkjhfis");

		driver.findElement(By.id("pass")).sendKeys("dsfss");
		WebElement e1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e1.click();

	}

	@Test

	public void velidateerrormsg() {
		WebElement e1 = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
		String text = e1.getText();
		System .out.println(text);

	}
}
