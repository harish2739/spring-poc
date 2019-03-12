package com.harish.features.login.tests;

import org.testng.annotations.Test;

import com.harish.base.BaseTest;
import com.harish.pagemodel.pageobjects.Login;

public class LoginTests extends  BaseTest {
	
	@Test
	public void loginPositiveTest() {
		Login login = (Login)context.getBean("login");
		login.login("harish", "1234");
		
	}
	
}
