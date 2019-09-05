package com.fb.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	public HomePageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(priority=4)
	public void verifyHomeLinkClickableTest() {
		
				homePage.verifyClickOnHomePage();
		
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Facebook","Home page title is not matched");
		
	}
	@Test(priority=2)
	public void verrifySearchBlockWorkingTest() {
		homePage.searchMethod();
	}
	@Test(priority=3)
	public void verifyUsernameTest() {		
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	@Test(priority=5)
	public void verifyFindFriendsLinkClickedTest() {
		homePage.clickOnFindFriendsLink();
	}
	@Test(priority=6)
	public void verifyProfileLinkWorkingFineTest() {
		homePage.clickProfileLink();
	}
	@Test(priority=7)
	public void verifyUserNavigationLabelclickedTest() {
		homePage.clickOnUserNavigationLabel();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
