package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageMethodSignature;

public class LoginWithMethodSignatureTest {

	@Test

	public void positiveLoginTest() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();

		lpms.openApp();
		lpms.getUserName("Marjan");
		lpms.getPassword("anything");
		lpms.getLoginButton();

	}

	@Test

	public void positiveLoginTest1() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();

		lpms.openApp();
		lpms.getUserName("Marjan1");
		lpms.getPassword("Anything2");
		lpms.getLoginButton();
	}

}
