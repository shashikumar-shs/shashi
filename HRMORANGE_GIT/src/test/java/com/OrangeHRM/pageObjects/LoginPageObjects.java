package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericScripts.BaseConstructorInitialization;

public class LoginPageObjects extends BaseConstructorInitialization
{
	@FindBy(name = "username")
	private WebElement usnTf;
	@FindBy(name = "password")
	private WebElement pswTf;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtn;
	
	public LoginPageObjects(WebDriver driver)//initialization
	{
		super(driver);
	}
	
	public WebElement usnTf()
	{
		return usnTf;
	}
	public WebElement pswTf()
	{
		return pswTf;
	}
	public WebElement LoginBtn()
	{
		return LoginBtn;
	}
}
