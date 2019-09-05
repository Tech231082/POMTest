package com.fb.qa.testcases;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
	
   LoginPage loginPage;
   HomePage homePage;
	public LoginPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
		
	}
	@Test(priority=2)
	public void loginPageLogoTest() {
		boolean flag=loginPage.validateLoginPageLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
