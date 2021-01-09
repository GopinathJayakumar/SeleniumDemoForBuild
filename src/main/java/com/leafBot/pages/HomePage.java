package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{

	public HomePage(){
	//	this.driver = driver;
		/*
		 * this.driver = driver; this.node = node; this.test = test;
		 */
		PageFactory.initElements(driver, this);
	}		


	/*
	 * @FindBy(how=How.XPATH,using="//span[text()='Accounts']") public WebElement
	 * eleAccounts;
	 * 
	 * public AccountsPage clickAccounts(){ click(eleAccounts); return new
	 * AccountsPage(driver, node, test); }
	 */

	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogout;

	
	@Given("click logout button")
	public LoginPage clickLogout() {
		click(eleLogout);
		return new LoginPage();		
	}
	
	
	@Then("homepage should be dispalyed")
	public void verifyHomePage() {
		System.out.println("homepage is displayed");

	}
	
	

}










