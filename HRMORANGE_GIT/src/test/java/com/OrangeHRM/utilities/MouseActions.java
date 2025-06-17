package com.OrangeHRM.utilities;

import org.openqa.selenium.WebElement;

public class MouseActions 
{
	public static void RightClick(WebElement element)
	{
		ActionsObjects.MouseActions().contextClick(element).perform();
	}
	public static void DragAndDrop(WebElement src, WebElement dst)
	{
		ActionsObjects.MouseActions().dragAndDrop(src, dst).perform();
	}
	public static void MouseHover(WebElement element)
	{
		ActionsObjects.MouseActions().moveToElement(element).perform();
	}
	public static void DoubleClick(WebElement element)
	{
		ActionsObjects.MouseActions().doubleClick(element).perform();
	}
	public static void ClickAndHold(WebElement element)
	{
		ActionsObjects.MouseActions().clickAndHold(element).perform();
	}
	public static void Release(WebElement element)
	{
		ActionsObjects.MouseActions().release(element).perform();
	}
	public static void MoveBy(int x,int y)
	{
		ActionsObjects.MouseActions().moveByOffset(x,y).perform();
	}
}
