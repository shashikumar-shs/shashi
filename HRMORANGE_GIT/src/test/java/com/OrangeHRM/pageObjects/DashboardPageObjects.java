package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OrangeHRM.genericScripts.BaseConstructorInitialization;

public class DashboardPageObjects extends BaseConstructorInitialization
{
	@FindBy(xpath = "(//img[@alt='profile picture'])[1]")
	private WebElement LogoutMenu;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement LogoutOption;
	@FindBy(xpath = "(//span[.='PIM'])[1]")
	private WebElement Pim_Btn;
	@FindBy(xpath = "//h6[.='Dashboard']")
	private WebElement DashboardText;
	public DashboardPageObjects(WebDriver driver)
	{
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	public WebElement LogoutMenu()
	{
		return LogoutMenu;
	}
	public WebElement LogoutOption()
	{
		return LogoutOption;
	}
	public WebElement Pim_Btn()
	{
		return Pim_Btn;
	}
	public WebElement DashboardText()
	{
		return DashboardText;
	}






}
