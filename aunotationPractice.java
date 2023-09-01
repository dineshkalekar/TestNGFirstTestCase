package TestNG_FirstTC;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class aunotationPractice {
	public WebDriver driver;
	
    @Test
	public void TestAnnotation() {

		System.out.println("Test Annotation");
	}
    @org.testng.annotations.BeforeMethod
	public void BeforeMethod() {

		System.out.println("Test BeforeMethod");
	}
    @org.testng.annotations.AfterMethod
	public void AfterMethod() {

		System.out.println("Test AfterMethod");
	}
    @org.testng.annotations.AfterClass
	public void AfterClass() {

		System.out.println("Test AfterClass");
	}
     @org.testng.annotations.BeforeClass
	public void BeforeClass() {

		System.out.println("Test BeforeClass");
	}
     @AfterSuite
     public void AfterSuit() {

 		System.out.println("Test AfterSuit");
 	}
     
     @BeforeSuite
     public void BeforeSuit() {

  		System.out.println("Test BeforeSuit");
  	}
      

}
