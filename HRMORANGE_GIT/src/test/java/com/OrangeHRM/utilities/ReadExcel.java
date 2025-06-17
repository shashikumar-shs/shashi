package com.OrangeHRM.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel
{
	static FileInputStream fis;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static int lastCell;
	public static int LastRowNumber(String path,String Sheetname) throws Exception
	{
		 fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(Sheetname);
		int lastrownumber = sheet.getLastRowNum();
		return lastrownumber;
	}
	public static int LastCellNumber(String path,String Sheetname) throws Exception
	{
		 fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(Sheetname);
		 for(int r = 0; r <= LastRowNumber(path, Sheetname);r++)
		 {
			 XSSFRow row = sheet.getRow(r);//01
			 for(int c=0;c<row.getLastCellNum();c++)
			 {
				lastCell = row.getLastCellNum();
			 }
		 }
		 return lastCell;
	}
	public static XSSFSheet AccessSheet(String path,String Sheetname) throws Exception
	{
		fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(Sheetname);
		 return sheet;
	}
	public static XSSFRow AccessRow(String path,String Sheetname,int row) throws IOException
	{
		fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(Sheetname);
		 XSSFRow	Row =sheet.getRow(row);
		 return Row;
	}
	public static XSSFCell AccessCell(String path,String Sheetname,int row,int cell) throws IOException
	{
		fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(Sheetname);
		 XSSFRow	Row =sheet.getRow(row);
		 XSSFCell Cell = Row.getCell(cell);
		 return Cell;
	}
	public static String AccessCellValue(String path,String Sheetname,int row,int cell) throws Exception
	{
	     fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = AccessSheet(path, Sheetname);
		 XSSFRow	Row = AccessRow(path, Sheetname, row);
		 XSSFCell Cell = AccessCell(path, Sheetname, row, cell);
		 String value = Cell.getStringCellValue();
		 return value;
	}
}
