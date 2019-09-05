package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fb.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath="//button[@id='u_0_15']")
	WebElement signUpButton;
	
	@FindBy(xpath="//input[@id='u_0_n']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='u_0_p']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='u_0_s']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='u_0_z']")
	WebElement npassword;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement day;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	@FindBy(xpath="//label[@class='_58mt' and @for='u_0_9']")
	WebElement female;

}
