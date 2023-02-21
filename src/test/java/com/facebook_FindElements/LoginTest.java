package com.facebook_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	
	@BeforeTest
	public void openApp () {
		//driver=WebDriverManager.chromedriver().create();
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	   driver.findElement(By.id("email")).sendKeys("seleniumclass@dmail.com");
	   driver.findElement(By.id("pass")).sendKeys("dontgivepass");
	   driver.findElement(By.name("login")).click();
	
	
	}
	
@Test
public void validLoginTest() {
	System.out.println("This is login test");
	
}
public void invalidLoginTest() {
	System.out.println("this is invalid login test");
	
}
}
