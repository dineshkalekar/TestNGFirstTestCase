package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {

	public WebDriver driver;

	@Test
	public void valid() {

		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("dineshkalekar33@gmail.com");

		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Sunnydinu@33");

		driver.findElement(By.cssSelector("button[type=submit]")).click();

		WebElement txt = driver.findElement(By.xpath("//div[@class='_9ay7']"));

		String Actual = txt.getText();

		System.out.println(Actual);

		String Explected = "The email address you entered isn't connected to an account. Find your account and log in.";

		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Actual, Explected);

//		if (Actual.equals(Explected)) {
//			System.out.println("Test CAse pass");
//
//		} else
//			System.out.println("fail");

		String title = driver.getTitle();

		System.out.println(title);

		String ActualTitle = driver.getTitle();

		String ExpectedTitle = "Log in to Facebook";

		soft.assertEquals(ActualTitle, ExpectedTitle);
        
		soft.assertAll();
		
	}

}
