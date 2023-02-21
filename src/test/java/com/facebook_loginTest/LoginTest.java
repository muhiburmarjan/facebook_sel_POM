package com.facebook_loginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPage;

public class LoginTest {
	//public WebDriver driver;


	@Test

	public void validLoginTest() {
		LoginPage lp = new LoginPage();
		lp.openApp();
		lp.getUserName();
		lp.getPassword();
		lp.getLoginButton();
		
		
		
		
		
		//driver.findElement(By.id("email")).sendKeys("seleniumclass@dmail.com");
		//driver.findElement(By.id("pass")).sendKeys("dontgivepass");
		//driver.findElement(By.name("login")).click();

	}

	@Test

	public void validLoginTest2() {

	}

	@Test

	public void validLoginTest3() {

	}

	@Test

	public void validLoginTest4() {

	}

	@AfterTest
	public void closeApp() {

	}
}
