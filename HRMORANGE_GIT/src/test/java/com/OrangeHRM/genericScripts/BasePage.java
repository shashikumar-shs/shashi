package com.OrangeHRM.genericScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OrangeHRM.pageObjects.DashboardPageObjects;
import com.OrangeHRM.pageObjects.LoginPageObjects;
import com.OrangeHRM.pageObjects.PimPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage implements I_Application_Constants
{
	public static WebDriver driver;
	LoginPageObjects lp;
	ReadProperty rp;
	public PimPageObjects pimpage;
	public DashboardPageObjects dp;
	@Parameters("Browsers")
	@BeforeClass
	public void BrowserConfig(String Browsers) throws Exception
	{
		switch(Browsers.toLowerCase())
		{
		case "chrome":WebDriverManager.chromedriver().setup();
					  driver = new ChromeDriver();
					  break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
						break;
		default:System.out.println("Invalid Browser");
		break;
		}
		rp = new ReadProperty();
		driver.get(rp.TestUrl());
		driver.manage().timeouts().implicitlyWait(TimeOut,TimeUnit.SECONDS);
		lp = new LoginPageObjects(driver);
		dp = new DashboardPageObjects(driver);
		pimpage = new PimPageObjects(driver);
	}
	@BeforeMethod
	public void LoginApplication()
	{
		lp.usnTf().sendKeys(rp.TestUsn());
		lp.pswTf().sendKeys(rp.TestPsw());
		lp.LoginBtn().click();
	}
	
	@AfterMethod
	public void LogoutApplication() throws InterruptedException
	{
		Thread.sleep(2000);
		dp.LogoutMenu().click();
		dp.LogoutOption().click();
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();

	}
}








