package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.ProfileLinkPage;

public class ProfileLinkPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ProfileLinkPage profileLinkPage;
	
	
	public ProfileLinkPageTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        profileLinkPage=homePage.clickProfileLink();
	}
	
	@Test(priority=1)
	public void verifyActivityLogTest() {
		boolean flag=((ProfileLinkPage) profileLinkPage).verifyActivityLogPresent();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
