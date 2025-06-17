package com.OrangeHRM.runnerScripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.genericScripts.BasePage;
import com.OrangeHRM.utilities.ReadExcel;

public class TC01_AddEmp extends BasePage
{
	@DataProvider(name= "EmpData")
	public String[][] empData() throws Exception
	{
		
		int lastRow = ReadExcel.LastRowNumber(ExcelPath,"Sheet1");
		int lstCel = ReadExcel.LastCellNumber(ExcelPath, "Sheet1");
		String[][] empData = new String[lastRow+1][lstCel];//r/c
		for(int r = 0;r<=lastRow;r++)
		{
		//	XSSFRow row = ReadExcel.AccessRow(ExcelPath, "Sheet1", r);
			for(int c = 0; c<lstCel;c++)
			{
				String val = ReadExcel.AccessCellValue(ExcelPath, "Sheet1", r, c);
//				System.out.print(val+ " \t");
				empData[r][c]=val;
			}
		}
		return empData;
	}
	@Test(dataProvider = "EmpData")
	public void TC01_Add_Emp(String fn,String mn,String ln)
	{
		Assert.fail();
	dp.Pim_Btn().click();
	pimpage.AddEmp_Btn().click();
	pimpage.fnTf().sendKeys(fn);
	pimpage.mnTf().sendKeys(mn);
	pimpage.lnTf().sendKeys(ln);
	pimpage.SaveBtn().click();
	}
}



