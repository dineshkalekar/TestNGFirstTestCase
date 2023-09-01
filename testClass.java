package TestNG_FirstTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testClass extends baseClass {
	
	@Test
	public void fblogin() {
		WebElement e1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		e1.click();
	}
	@Test
	public void errormsg() {
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
		String text = e1.getText();
		System .out.println(text);

	}
	
	@Test
	public void msg() {
		System.out.println("Welcome my class");
	}

}
