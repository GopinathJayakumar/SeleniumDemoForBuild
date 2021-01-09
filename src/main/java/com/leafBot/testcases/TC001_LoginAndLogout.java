package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginAndLogout extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {

		testCaseName = "Login and Logout";
		testDescription = "Test login and logout";
		authors = "Hari";
		category = "Smoke";
		dataSheetName = "TC001";

	}

	@Test(dataProvider = "fetchData")
	public void loginLogout(String username,String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();

	}
}