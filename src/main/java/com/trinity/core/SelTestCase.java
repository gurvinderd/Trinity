package com.trinity.core;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelTestCase {
	protected WebDriver driver;
	protected String appURL;
	
	@BeforeSuite()
	@Parameters("appURL")
	public void setEnv (@Optional ("http://newtours.demoaut.com/mercuryregister.php") String appURL) 
	{
		this.appURL = appURL;
	}
	
	@BeforeMethod()
	@Parameters("browser")
	public void launchBrowser(@Optional("FF") String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/trinity/jars/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FF")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
	}
	
	@AfterMethod()
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
