package com.BS4.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

public	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		String excelpath=System.getProperty("user.dir")+"\\TestData\\New Microsoft Office Excel Worksheet.xlsx";
	        File src=new File(excelpath);
	        FileInputStream file=new FileInputStream(src);
	         wb=new XSSFWorkbook(file);
	
	}
	public String String(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	public String Numeric(String SheetName,int row,int cell) {
		
		double value=wb.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		String NumValue=Double.toString(value).replace(".0", "");
		return NumValue;
	}
	 
}
