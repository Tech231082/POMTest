package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class ProfileLinkPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"u_0_16\"]/li[2]/a")
	WebElement activityLog;
	
	public ProfileLinkPage() {
		PageFactory.initElements(driver, this);
	}
	/*public boolean verifyActivityLogPresent() {
		return activityLog.isDisplayed();
	}*/
	public boolean verifyActivityLogPresent() {
		return activityLog.isDisplayed();
		
	}

}
