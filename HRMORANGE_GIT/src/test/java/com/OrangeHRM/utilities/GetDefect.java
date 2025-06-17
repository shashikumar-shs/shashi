package com.OrangeHRM.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.OrangeHRM.genericScripts.BasePage;
import com.aventstack.extentreports.MediaEntityBuilder;

public class GetDefect extends BasePage 
{
	public static void CaptureDefect(String Filename) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(DefectsPath+CurrentTimeZone.currentTimeZone()+" "+Filename+".png");
		FileHandler.copy(temp, perm);
		MediaEntityBuilder.createScreenCaptureFromPath(DefectsPath+CurrentTimeZone.currentTimeZone()+" "+Filename+".png").build();
	}
}







