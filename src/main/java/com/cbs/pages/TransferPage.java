package com.cbs.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cbs.base.TestBase;
import com.cbs.util.TestUtil;

public class TransferPage extends TestBase {
	TestUtil testutil = new TestUtil();
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Row row;
	String location = "C:\\Users\\AkashBorade\\Desktop\\Excel Autom\\CBS_Automation.xlsx";
	
	
	
}
