package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.genericScripts.BaseConstructorInitialization;

public class PimPageObjects extends BaseConstructorInitialization
{
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement AddEmp_Btn;
	@FindBy(name = "firstName")
	private WebElement fnTf;
	@FindBy(name = "middleName")
	private WebElement mnTf;
	@FindBy(name = "lastName")
	private WebElement lnTf;
	@FindBy(xpath =  "//button[.=' Save ']")
	private WebElement SaveBtn;
	
	public PimPageObjects(WebDriver driver)//initialization
	{
		super(driver);
	}
	
	public WebElement AddEmp_Btn()
	{
		return AddEmp_Btn;
	}
	public WebElement fnTf()
	{
		return fnTf;
	}
	public WebElement mnTf()
	{
		return mnTf;
	}
	public WebElement lnTf()
	{
		return lnTf;
	}
	public WebElement SaveBtn()
	{
		return SaveBtn;
	}
	
	
	
}
