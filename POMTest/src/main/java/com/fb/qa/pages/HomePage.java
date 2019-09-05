package com.fb.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fb.qa.base.*;

public class HomePage extends TestBase{
	@FindBy(xpath="//div[contains(text(),'Sush Rinwa')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[@id='findFriendsNav']")
	WebElement findfriendsLink;
	
	@FindBy(xpath="//span[@class='_1vp5']")
	WebElement profileLink;
	
	@FindBy(xpath="//div[@id='userNavigationLabel']")
	WebElement userNavigationLabel;
	
	@FindBy(xpath="//input[@class='_1frb']")
	WebElement search;
	
	@FindBy(xpath="//a[@class='_2s25']")
	WebElement homeLink;
	
	
	
	//craeting the home page constructor for initializing page objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		//creating methods
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
	}
	public HomePage verifyClickOnHomePage() {
		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		
		boolean invisible=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='_3ixn']")));
		if(invisible) {
			homeLink.click();
			
		}*/
		try{
			JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		js.executeAsyncScript("arguments[0].click();", homeLink);
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		//homeLink.click();
		return new HomePage();
	}
	public boolean verifyCorrectUsername() {
		return usernameLabel.isDisplayed();
	}
	public SearchPage searchMethod() {
		search.sendKeys("Parmod");
		return new SearchPage();
	}
	public FindFriendsPage clickOnFindFriendsLink() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", findfriendsLink);
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		//findfriendsLink.click();
		return new FindFriendsPage();
	}
	public ProfileLinkPage clickProfileLink() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",profileLink);
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		//profileLink.click();
		return new ProfileLinkPage();
	
	}
	public UserNavigationLabelPage clickOnUserNavigationLabel() {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",userNavigationLabel);
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		//userNavigationLabel.click();
		return new UserNavigationLabelPage();
	
	}

}
