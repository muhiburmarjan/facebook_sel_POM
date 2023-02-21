package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWithVariables {
public WebDriver driver;




public void openApp() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
}
	
	
	public WebElement getUserName(String enterUserName) {
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys(enterUserName);
	return userName;
		
	}
	
	public WebElement getPassword(String enterPassword) {
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys(enterPassword);
		return userPass;
		
	}
	public WebElement getLoginButton() {
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		return loginButton;
		
		
	}
	
}