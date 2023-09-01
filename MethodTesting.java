package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MethodTesting extends baseClass {
	@Test
	public void fblogin() {

		WebElement e1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e1.click();
	}

	@Test
	public void sendkylogin() {

		WebElement e2 = driver.findElement(By.id("email"));
		e2.sendKeys("sffss");

		WebElement e3 = driver.findElement(By.id("pass"));
		e2.sendKeys("czdafcac");

		WebElement e4 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e4.click();
	}

}
