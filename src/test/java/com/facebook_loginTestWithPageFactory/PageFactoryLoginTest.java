package com.facebook_loginTestWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_loginPageWithPageFactory.PageFactoryLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryLoginTest extends com.facebook.com_basetest.baseTest{
	WebDriver driver;
	
	private PageFactoryLoginPage plp;

@BeforeMethod
public void init() {
	 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	


}
@Test
public void validUserNameTest() {
	PageFactoryLoginPage plp = new PageFactoryLoginPage(driver);
	plp.getUserName("Marjan123");
	plp.getPassword("jklkjl");
	plp.getLoginButton();
	
}
@Test
public void validPasswordTest() {
	PageFactoryLoginPage plp = new PageFactoryLoginPage(driver);
	plp.getUserName("Marjan123");
	plp.getPassword("jklkjl");
	plp.getLoginButton();
}
	
@AfterMethod
public void closeApp(){
	if(driver != null) {
		driver.quit();
	}
}
	
}


