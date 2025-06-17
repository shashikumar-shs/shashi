package com.OrangeHRM.utilities;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHRM.genericScripts.BasePage;

public class ActionsObjects extends BasePage
{
	public static Actions MouseActions()
	{
		return new Actions(driver);
	}
	public static Select DropDown(WebElement element)
	{
		return new Select(element);
	}
	public static JavascriptExecutor JSE(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js;
	}
	public static Robot KeyBoard() throws Exception
	{
		return new Robot();
	}
}
