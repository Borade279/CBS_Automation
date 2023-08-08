package com.cbs.util;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class MyExcelFile {
	
	public static String getData(int row, int cell) throws IOException {
		
		
		File fil = new File ("C:\\Users\\AkashBorade\\Desktop\\Excel Autom\\CBS_Automation.xlsx");
		FileInputStream  file = new FileInputStream(fil);
		//Workbookfactory.create(file).get
		String ExcelSheet = WorkbookFactory.create(file).getSheet("CC Account").getRow(row).getCell(cell).getStringCellValue();
		System.out.println(ExcelSheet);
		//XSSFWorkbook xss = new XSSFWorkbook(file);
		return ExcelSheet;
		
		
		
		
		
		
	}
	
	
}
