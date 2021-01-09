package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(){
	//	this.driver = driver;
		/*
		 * this.driver = driver; this.node = node; 
		 */
		PageFactory.initElements(driver,this);
	}
	 
	
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUsername;

	
	@Given("enter username as (.*)")
	public LoginPage enterUsername(String data) throws InterruptedException {
		clearAndType(eleUsername, data);
		//Thread.sleep(3000);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;

	
	@Given("enter password as (.*)")
	public LoginPage enterPassword(String data) throws InterruptedException {
		clearAndType(elePassword, data);
		
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;

	
	@When("click on login button")
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage();		
	}
	
	
}
