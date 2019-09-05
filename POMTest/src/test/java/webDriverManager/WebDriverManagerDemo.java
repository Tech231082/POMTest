package webDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	@Test
	public void start() {
		//WebDriverManager.iedriver().setup();
		System.setProperty("webdriver.ie.driver", "C:/mytools/IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://mvnrepository.com/");
	}


}
