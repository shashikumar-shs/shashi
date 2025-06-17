package com.OrangeHRM.genericScripts;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty implements I_Application_Constants
{
	Properties pro;
	public  ReadProperty() throws Exception
	{
		FileInputStream fis = new FileInputStream(PropertyPath);
		pro = new Properties();
		pro.load(fis);
	}
	public  String TestUrl()
	{
		return pro.getProperty(urlKey);
	}
	public String TestUsn()
	{
		return pro.getProperty(UsnKey);
	}
	public String TestPsw()
	{
		return pro.getProperty(PswKey);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
