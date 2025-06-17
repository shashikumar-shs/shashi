package com.OrangeHRM.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown
{
	public static void SelectOption(WebElement element,Object value)//1
	{
		Select dropDown = ActionsObjects.DropDown(element);
		if(value instanceof Integer)
		{
			dropDown.selectByIndex((int)value);//123
		}
		else if(value instanceof String)
		{	
			try
			{
				dropDown.selectByValue((String)value);
			} catch (Exception e) 
			{
				dropDown.selectByVisibleText((String)value);
			}
		}
	}
}
