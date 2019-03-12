package com.harish.pagemodel.pageobjects.web;

import com.harish.pagemodel.pageobjects.Login;

public class LoginWebPage implements Login {

	public boolean login(String user, String password) {
		System.out.println("Login to web page");
		return false;
	}

}
