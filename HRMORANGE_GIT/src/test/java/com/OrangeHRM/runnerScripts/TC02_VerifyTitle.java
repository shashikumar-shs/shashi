package com.OrangeHRM.runnerScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.genericScripts.BasePage;
import com.OrangeHRM.utilities.MouseActions;

public class TC02_VerifyTitle extends BasePage
{
	@Test
	public void  Testcase02()
	{
		String EpectedTitle = "Dashboard";
		String txt = dp.DashboardText().getText();//Dashboard
		Assert.assertEquals(txt, EpectedTitle);
		MouseActions.RightClick(dp.LogoutMenu());
	}
}
