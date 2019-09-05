package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	//page factory(define page objects/webelements)
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"u_0_15\"]")
	WebElement signUpButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]/i[1]")
	WebElement logo;
	
	//initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//methods
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean validateLoginPageLogo() {
		return logo.isDisplayed();
		
	}
	public HomePage login(String uname,String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
		return new HomePage();
	}
	

}
